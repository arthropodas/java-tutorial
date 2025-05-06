
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoForeEach {

    public static void main(String[] args) {
        List list = Arrays.asList(1, 24, 5, 6, 3, 5, 23);
        Consumer<Integer> con = (Integer num)-> System.out.println(num);
        list.forEach(con);   

    }
}
