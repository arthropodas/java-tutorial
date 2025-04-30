class A{
    public void displayReturn(){
        System.out.println("print with content A");
    }
}


class B extends  A{
    @Override
    public void displayReturn(){
        System.out.println("print with content B");
    }
}
public class DemoAnnotation{
    public static void main(String[] args) {
        B obj = new B();
        obj.displayReturn();

    }
}