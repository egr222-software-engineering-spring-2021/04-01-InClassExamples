public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior qB;
    public Duck() {
    }
    public abstract void display();
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        qB.quack();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fB) {
        flyBehavior = fB;
    }

    public void setQuackBehavior(QuackBehavior qB) {
        this.qB = qB;
    }
}
