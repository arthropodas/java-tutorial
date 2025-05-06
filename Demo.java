
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

    public static void main(String[] args) {
        // List<Integer> num = new ArrayList<Integer>();
        Set<String> num = new HashSet<String>();
        Set<Integer> treeSet = new TreeSet<Integer>();
        num.add("1");
        num.add("6");
        num.add("5");
        num.add("4");
        num.add("-1");
        num.add("2");
        num.add("3");
        treeSet.add(1);
        treeSet.add(6);
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(-1);
        treeSet.add(2);
        treeSet.add(3);
        for (String n : num) {
            System.out.println("d: " + n);
            // System.out.println("result: " + ((int) n * 2));
        }
        System.out.println("............................");

        for (int n : treeSet) {
            System.out.println("d: " + n);
            // System.out.println("result: " + ((int) n * 2));
        }
        // System.out.println("Value at index 2: " + num.get(0));  
        // Getting index of value 4
        // System.out.println("Index of value 4: " + num.indexOf(4)); 
    }
}
