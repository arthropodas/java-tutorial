
class Human {

    private int age;
    private String name = "asif";

    public String getName() {
        return this.name;
    }

    public void setAge(int age, Human hum) {
        hum.age = age;
    }

    public int getAge() {

        return age;
    }

}

public class Private {

    public static void main(String args[]) {
        Human hum = new Human();
        hum.setAge(10,hum);
        System.out.println("value of age is " + hum.getAge());

    }
}
