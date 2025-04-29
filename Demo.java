
class Calc {
    int num = 100 ;
    public Object display(int num) {
        System.err.println("out"+num);
        if(1!=1){
        
        return "something";
        }
        else{
             return 0; 
        }
    }

}

public class Demo {

    public static void main(String[] args) {
        Calc c = new Calc();
        System.err.println("The object is"+ c);
        System.err.println("c.display();" + c.display(4));
    }
}
