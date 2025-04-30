
enum Laptop {
    ChromeBook(5000),
    MacBook(7000),
    ThinkPad;

    private int price;

    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Demo {

    public static void main(String[] args) {

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " " + lap.getPrice());
        }

    }
}
