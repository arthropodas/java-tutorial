
class CustomException extends Exception {

    public CustomException(String s) {
        System.out.println("hi this is custom exception");
    }
}

public class Demo {

    public static void main(String[] args) {
        try {
            String s = "new";
            System.out.println("System out print ln is " + s.length());
            int j = 0;
            if (j == 0) {
                throw new CustomException("don't want denominator as zero");
            }
            System.out.println("result" + 18 / j);
        } catch (NullPointerException e) {

        } catch (CustomException e) {
            throw new ArithmeticException(e.getMessage());
        } catch (Exception e) {
            System.out.println("hi this is exception" + e);
        } finally {

            System.out.println("After result");

        }
    }
}
