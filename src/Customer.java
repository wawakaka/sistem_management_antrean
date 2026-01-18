/**
 * Class Pelanggan merepresentasikan data pelanggan dalam antrian
 */
public class Customer {
    private final String queueNumber;
    private final String name;

    public Customer(String queueNumber, String name) {
        this.queueNumber = queueNumber;
        this.name = name;
    }

    public String getQueueNumber() {
        return queueNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s", queueNumber, name);
    }
}



// java 16 version simpler
//public record Customer(String queueNumber, String name) {
//
//    @Override
//    public String toString() {
//        return String.format("[%s] %s", queueNumber, name);
//    }
//}