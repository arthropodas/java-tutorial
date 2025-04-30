
interface Computer {

    abstract public void code();
}

class Laptop implements  Computer {

    public void code() {
        System.out.println("Coding, compile, running");
    }
}

class Desktop implements Computer {

    public void code() {
        System.out.println("Coding, compile, running fast......");
    }
}

class Developer {

    public void devApp(Computer lap) {
        lap.code();
    }
}

public class DemoInterface {

    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Desktop desktop = new Desktop();
        Developer dev = new Developer();
        dev.devApp(lap);
        dev.devApp(desktop);

    }
}
