public class RubberDuck extends Duck {
    public RubberDuck() {
        qB = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a golden rubber duckie!");
    }
}
