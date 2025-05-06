class Counter extends  Thread{

    int  counter = 0;
    public void run(){
        // int counter = 0;
        counter++;

    }
}
public class DemoRace{
    public static void main(String args[]){
        Thread a = new Thread();
        Thread b = new Thread();
        Counter c = new Counter();

        a.start();
        b.start();
        System.out.println(" the result is"+ c.counter);



        
    }
}