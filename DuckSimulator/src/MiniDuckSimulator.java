public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        mallard.setQuackBehavior(new MuteQuack());
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyWithRocketPower());
        model.performFly();

        Duck rD = new RubberDuck();
        rD.display();
        rD.performFly();
        rD.performQuack();
        rD.setFlyBehavior(new FlyWithRocketPower());
        rD.performFly();
    }
}
