
abstract class Car {

    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("playing music");
    }
}

abstract class WagnR extends Car {

    @Override
    public void drive() {
        System.out.println("driving");
    }
}

class UpdatedWagnR extends WagnR {

    @Override
    public void fly() {
        System.out.println("fying...............");
    }

    public void check() {
        System.out.println("checking...");
    }
}

public class DemoAbstract {

    public static void main(String[] args) {
        Car obj = new UpdatedWagnR();
        obj.drive();
        obj.playMusic();
        obj.fly();

    }
}
