import java.util.Scanner;

/**
 * Sistem Manajemen antrian Customer Service
 * Implementasi Queue menggunakan Linked List
 */
public class CustomerServiceQueueManagementSystem {
    private static QueueLinkedList queue;
    private static Scanner scanner;

    public static void main(String[] args) {
        queue = new QueueLinkedList();
        scanner = new Scanner(System.in);

        System.out.println("\nSISTEM MANAJEMEN ANTRIAN CUSTOMER SERVICE");
        System.out.println("Implementasi Queue - Linked List\n");

        boolean running = true;
        while (running) {
            showMenu();
            int selectedMenu = getInputInteger();

            switch (selectedMenu) {
                case 1:
                    addNewCustomer();
                    break;
                case 2:
                    queue.serveCustomer();
                    break;
                case 3:
                    queue.showQueue();
                    break;
                case 4:
                    running = false;
                    System.out.println("\nTerima kasih! Sampai jumpa!\n");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid! Silakan pilih 1-4.\n");
            }
        }

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\nMENU UTAMA");
        System.out.println("1. Tambah Pelanggan Baru");
        System.out.println("2. Layani Pelanggan");
        System.out.println("3. Lihat Daftar Antrian");
        System.out.println("4. Keluar");
        System.out.printf("Antrian: %d pelanggan%n", queue.getSize());
    }

    private static void addNewCustomer() {
        System.out.print("\nNama Pelanggan: ");
        String nama = scanner.nextLine().trim();

        if (nama.isEmpty()) {
            System.out.println("!!! Nama tidak boleh kosong!");
            return;
        }

        queue.addCustomer(nama);
    }

    private static int getInputInteger() {
        System.out.print("Pilih menu [1-4]: ");
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}

// /**
// * Sistem Manajemen antrian Customer Service
// * java 25 compact source files version
// * Implementasi Queue menggunakan Linked List
// */
//private static QueueLinkedList queue;
//private static Scanner scanner;
//
//void main() {
//    queue = new QueueLinkedList();
//    scanner = new Scanner(System.in);
//
//    IO.println("\n╔════════════════════════════════════════════╗");
//    IO.println("║   SISTEM MANAJEMEN antrian CUSTOMER SERVICE║");
//    IO.println("║      Implementasi Queue - Linked List      ║");
//    IO.println("╚════════════════════════════════════════════╝");
//
//    boolean running = true;
//    while (running) {
//        showMenu();
//        int selectedMenu = getInputInteger("Pilih menu [1-4]: ");
//
//        switch (selectedMenu) {
//            case 1:
//                addNewCustomer();
//                break;
//            case 2:
//                queue.serveCustomer();
//                break;
//            case 3:
//                queue.showQueue();
//                break;
//            case 4:
//                running = false;
//                IO.println("\nTerima kasih! Sampai jumpa!\n");
//                break;
//            default:
//                IO.println("\nPilihan tidak valid! Silakan pilih 1-4.\n");
//        }
//    }
//
//    scanner.close();
//}
//
//private static void showMenu() {
//    IO.println("\n┌────────────────────────────────┐");
//    IO.println("│          MENU UTAMA            │");
//    IO.println("├────────────────────────────────┤");
//    IO.println("│  1. Tambah Pelanggan Baru      │");
//    IO.println("│  2. Layani Pelanggan           │");
//    IO.println("│  3. Lihat Daftar antrian       │");
//    IO.println("│  4. Keluar                     │");
//    IO.println("└────────────────────────────────┘");
//    System.out.printf("antrian: %d pelanggan%n", queue.getSize());
//}
//
//private static void addNewCustomer() {
//    IO.print("\nNama Pelanggan: ");
//    String nama = scanner.nextLine().trim();
//
//    if (nama.isEmpty()) {
//        IO.println("!!! Nama tidak boleh kosong!");
//        return;
//    }
//
//    queue.addCustomer(nama);
//}
//
//private static int getInputInteger(String prompt) {
//    IO.print(prompt);
//    try {
//        return Integer.parseInt(scanner.nextLine().trim());
//    } catch (NumberFormatException e) {
//        return -1;
//    }
//}