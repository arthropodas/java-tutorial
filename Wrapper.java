
public class Wrapper {

    public static void main(String[] args) {
        int num = 5;
        Integer num1 = num; //autoboxing
        int num2 = num1; //auto unboxing
        int num3 = num1.intValue(); //unboxing
        String str = "1234";
        Integer num4 = Integer.parseInt(str);
        System.out.println("The num4" + num4);

        System.out.println("the value of num2" + num2);

    }
}
