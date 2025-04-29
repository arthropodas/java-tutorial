
class CalcB extends Calc{
    int sum(int a, int b){
        return a+b+100;
    }
}

public  class AdvCal{
    public static void main(String[] args) {
        CalcB c = new CalcB();
       System.out.println("sum is"+ c.sum(1,2));
       
        
    }
}