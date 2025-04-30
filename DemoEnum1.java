
enum Status {
    Running, Pending, Failed, Success
}

public class DemoEnum1 {

    public static void main(String[] args) {
        Status status = Status.Pending;
        switch (status) {
            case Running -> System.out.println("Running...");

            case Pending -> System.out.println("Pending...");

            case Failed -> System.out.println("Failed...");

            default -> System.out.println("success...");
        }

    }
}
