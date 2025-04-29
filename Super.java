
class A {

    public A() {
        System.out.println("In A");
    }

    public A(int a) {
        System.out.println("Int A");
    }
}

class B extends A {

    public B() {
        super(10);
        this();
        System.out.println("In B");
    }

    public B(int b) {

        System.out.println("int B");
    }
}

public class Super {

    public static void main(String args[]) {
        B b = new B();
    }
}
