
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CustomException extends Exception {

    public CustomException(String s) {
        System.out.println("hi this is custom exception");
    }
}

public class Demo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;

        try {
            String s = "new";
            System.out.println("System out print ln is " + s.length());
            int j = 1;
            if (j == 0) {
                throw new CustomException("don't want denominator as zero");
            }
            System.out.println("result" + 18 / j);
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            int num = Integer.parseInt(br.readLine());
            System.out.println("the number is " + num);
        } catch (NullPointerException e) {

        } catch (CustomException e) {
            throw new ArithmeticException(e.getMessage());
        } catch (Exception e) {
            System.out.println("hi this is exception" + e);
        } finally {
            br.close();
            System.out.println("After result");

        }
    }
}
