
class A implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }

            System.out.println("HI");
        }

    }

}

class B implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }

            System.out.println("Hello");
        }

    }
}

public class RunnableDemo {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        Thread obj1 = new Thread(a);
        Thread obj2 = new Thread(b);
        obj1.start();
        obj2.start();
    }
}
