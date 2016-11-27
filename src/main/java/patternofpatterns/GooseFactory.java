package patternofpatterns;

public class GooseFactory extends AbstractGooseFactory {

  @Override
  public Goose createGoose() {
    return new Goose();
  }

  @Override
  public Quackable createDuck() {
    return new GooseAdapter(new Goose());
  }
}
