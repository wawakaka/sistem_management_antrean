# Sistem Manajemen Antrian Customer Service

Sistem manajemen antrian pelayanan pelanggan yang diimplementasikan menggunakan struktur data Queue dengan Linked List.

## Deskripsi

Program ini mendemonstrasikan implementasi Queue menggunakan Linked List dengan prinsip FIFO (First In First Out). Sistem dapat menambah pelanggan ke antrian, melayani pelanggan, dan menampilkan daftar antrian.

## Persyaratan

- Java Development Kit (JDK) 8 atau lebih tinggi
- Terminal/Command Prompt

## Cara Menjalankan

### 1. Compile Program

Dari root project, execute command ini:

```bash
javac -d "out/production/Sistem management antrean" src/*.java
```

### 2. Menjalankan Program

Setelah compile berhasil, jalankan:

```bash
java -cp "out/production/Sistem management antrean" CustomerServiceQueueManagementSystem
```

### 3. Compile dan Jalankan Sekaligus

```bash
javac -d "out/production/Sistem management antrean" src/*.java && java -cp "out/production/Sistem management antrean" CustomerServiceQueueManagementSystem
```

## Fitur Program

1. **Tambah Pelanggan Baru** - Menambahkan pelanggan ke antrian dengan nomor antrian otomatis (A001, A002, dst.)
2. **Layani Pelanggan** - Melayani pelanggan pertama dalam antrian
3. **Lihat Daftar Antrian** - Menampilkan semua pelanggan yang sedang mengantri
4. **Keluar** - Keluar dari program

## Struktur Program

- `CustomerServiceQueueManagementSystem.java` - Kelas utama dengan interface menu
- `QueueLinkedList.java` - Implementasi Queue menggunakan Linked List
- `Customer.java` - Kelas data pelanggan
- `Node.java` - Struktur node untuk Linked List
