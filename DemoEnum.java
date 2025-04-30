
enum Status {
    Running, Pending, Success, Failed;
}

public class DemoEnum {

    public static void main(String args[]) {
        Status[] s = Status.values();
        for (Status status : s) {
            System.err.println(status + " : " + status.ordinal());
        }

    }
}
