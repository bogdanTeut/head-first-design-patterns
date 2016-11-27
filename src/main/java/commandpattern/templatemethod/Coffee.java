package commandpattern.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Coffee extends CaffeineBeverage{

  @Override
  protected void brew() {
    System.out.println("Brew coffee in the watter");
  }

  @Override
  protected void addCondiments() {
    System.out.println("Adding milk froth");
  }

  @Override
  protected boolean customerWantsCondiments(){
    final String result = readCustomerResponse();

    if (result.toLowerCase().startsWith("y")){
      return true;
    }else{
      return false;
    }
  }

  private String readCustomerResponse() {
    final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String response = null;

    try {
      System.out.print("Would you like condiments?");
       response = bf.readLine();
    } catch (final IOException e) {
      System.out.println("Exception during reading customer's input");
    }

    if (response == null){
      return "no";
    }

    return response;
  }
}
