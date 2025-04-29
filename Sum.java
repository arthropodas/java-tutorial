
public class Sum {

    public static void main(String[] args) {
        sum(10);
    

    }

    public static int sum(int a) {
        if (a < 1) {
            return 0;
        } else {
            System.out.println(" " + a);
            return sum(a - 1);

        }

    }
}
