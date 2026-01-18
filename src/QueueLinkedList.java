/**
 * Class antrianLinkedList mengimplementasikan Queue menggunakan Linked List
 *
 * Prinsip FIFO (First In First Out):
 * - enqueue: menambahkan elemen di belakang (rear)
 * - dequeue: menghapus elemen di depan (front)
 */
public class QueueLinkedList {
    private Node front;  // Pointer ke depan antrian
    private Node rear;   // Pointer ke belakang antrian
    private int size;    // Jumlah pelanggan dalam antrian
    private int counter; // Counter untuk nomor antrian

    public QueueLinkedList() {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.counter = 0;
    }

    /**
     * Mengecek apakah antrian kosong
     */
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * Mendapatkan jumlah pelanggan dalam antrian
     */
    public int getSize() {
        return size;
    }

    /**
     * Generate nomor antrian otomatis (A001, A002, dst.)
     */
    private String generateQueueNumber() {
        counter++;
        return String.format("A%03d", counter);
    }

    /**
     * Menambahkan pelanggan baru ke antrian (enqueue)
     * Pelanggan ditambahkan di bagian belakang (rear)
     */
    public void addCustomer(String nama) {
        String queueNumber = generateQueueNumber();
        Customer newCustomer = new Customer(queueNumber, nama);
        Node newNode = new Node(newCustomer);

        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;

        System.out.println("\nPelanggan berhasil ditambahkan!");
        System.out.println("Nomor antrian: " + queueNumber);
        System.out.println("Nama: " + nama);
        System.out.println("Posisi: " + size);
    }

    /**
     * Melayani pelanggan (dequeue)
     * Menghapus pelanggan dari depan antrian (front)
     */
    public void serveCustomer() {
        if (isEmpty()) {
            System.out.println("\nAntrian kosong. Tidak ada pelanggan untuk dilayani.");
            return;
        }

        Customer servedCustomer = front.data;
        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }

        System.out.println("\nMEMANGGIL PELANGGAN:");
        System.out.println("Nomor antrian: " + servedCustomer.getQueueNumber());
        System.out.println("Nama: " + servedCustomer.getName());
        System.out.println("Sisa antrian: " + size + " pelanggan");
    }

    /**
     * Menampilkan seluruh daftar pelanggan dalam antrian
     */
    public void showQueue() {
        System.out.println("\nDAFTAR ANTRIAN CUSTOMER SERVICE");

        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.printf("%-8s %s%n", "No.", "Nama");

        Node current = front;
        while (current != null) {
            Customer p = current.data;
            String nama = p.getName().length() > 40 ?
                    p.getName().substring(0, 37) + "..." : p.getName();
            System.out.printf("%-8s %s%n", p.getQueueNumber(), nama);
            current = current.next;
        }

        System.out.printf("Total: %d pelanggan%n", size);
    }
}