
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Demo{
    public static void main(String[] args) {
        // Map<String, Integer> students = new HashMap<>();
        Map<String, Integer> students = new Hashtable<>();
        students.put("asif",1) ;
        students.put("asif2",2) ;
        students.put("asif3",3) ;
        students.put("asif4",444) ;    
        students.put("asif",5);

System.out.println("hash map"+students);
System.out.println("hash map"+students.keySet());
// for (Map<String,Integer> n: students){
//     System.out.println(n);
// }

for( String n : students.keySet()){
    System.out.println("key = " +n + " : " +"value = "  + students.get(n));
}
    }
}