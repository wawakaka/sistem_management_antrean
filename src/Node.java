/**
 * Class Node untuk membentuk struktur Linked List
 * Setiap node menyimpan data pelanggan dan referensi ke node berikutnya
 */
public class Node {
    Customer data;
    Node next;

    public Node(Customer data) {
        this.data = data;
        this.next = null;
    }
}