
import java.util.Arrays;

import java.util.List;

public class Demo {
    public static void main(String args[]){

        List<Integer> list = Arrays.asList(1, 23, 9, 4, 5); 
        int sum = 0;
        for(int n  : list){
            if (n%2==0){
                n= n*2;
                sum = sum + n;
            }
        }
        System.out.println("sum is"+ sum);
        System.out.println("<<<< ......................>>>>"+ sum);

    }
    
}
