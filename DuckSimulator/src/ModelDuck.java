public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        qB = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a cool new duck model!");
    }
}
