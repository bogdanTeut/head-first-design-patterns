package stateofthings;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballMachineTestDrive {

  public static void main(String[] args) {
    final String[] locations = {"127.0.0.1"};

    GumballMachineRemote gumballMachine = null;

    try {

      if (System.getSecurityManager() == null) {
        System.setSecurityManager(new SecurityManager());
      }

      final Registry registry = LocateRegistry.getRegistry(locations[0]);
      gumballMachine = (GumballMachineRemote)registry.lookup("gumballmachine");

      final GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
      gumballMonitor.report();

    } catch (RemoteException e) {
      e.printStackTrace();
    } catch (NotBoundException e) {
      e.printStackTrace();
    }

    System.out.println(gumballMachine);
  }
}
