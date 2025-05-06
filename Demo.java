
class A extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
            System.out.println("hi......................");
        }
    }
}

class B extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
            System.out.println("he>>>>>>>>>>>>>>>>>>>>>>>");
        }
    }
}

public class Demo {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        // System.out.println("the priority of a " + a.getPriority());
        // System.out.println("the priority of b " + b.getPriority());
        a.start();
        b.start();
    }

}
