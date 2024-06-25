
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        LinkedListMahasiswa03 linkedListMahasiswa = new LinkedListMahasiswa03();

        linkedListMahasiswa.tambahMahasiswa(new Mahasiswa03("2341760001", "Alvi Choirinnikmah", "2004-02-08", "085222333989"));
        linkedListMahasiswa.tambahMahasiswa(new Mahasiswa03("2341760002", "Alva Freya Aisya", "2004-02-20", "085222333988"));
        linkedListMahasiswa.tambahMahasiswa(new Mahasiswa03("2341760003", "Nayla Citra Lestari", "2004-05-28", "085222333987"));

        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Cek Data");
            System.out.println("3. Hapus Mahasiswa");
            System.out.println("4. Cari Mahasiswa");
            System.out.println("5. Cetak Semua Mahasiswa (LinkedList)");
            System.out.println("6. Sorting");
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Tanggal Lahir: ");
                    String tglLahir = sc.nextLine();
                    System.out.print("Nomor Telepon: ");
                    String noTelp = sc.nextLine();
                    linkedListMahasiswa.tambahMahasiswa(new Mahasiswa03(nim, nama, tglLahir, noTelp));
                    break;
                case 2:
                    if (linkedListMahasiswa.isEmpty()) {
                        System.out.println("Linked list kosong.");
                    } else {
                        System.out.println("Linked list tidak kosong.");
                    }
                    break;   
                case 3:             
                    System.out.print("NIM: ");
                    nim = sc.nextLine();
                    linkedListMahasiswa.hapusMahasiswa(nim);
                    break;
                case 4:
                    System.out.print("NIM: ");
                    String nimCari = sc.nextLine();
                    Mahasiswa03 cariMahasiswa = linkedListMahasiswa.cariMahasiswa(nimCari);
                    if (cariMahasiswa != null) {
                        System.out.println("Data Mahasiswa yang Dicari:");
                        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.printf("| %-15s | %-20s | %-15s | %-15s |\n", "NIM", "Nama", "Tanggal Lahir", "No Telepon");
                        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.printf("| %-15s | %-20s | %-15s | %-15s |\n", cariMahasiswa.getNim(), cariMahasiswa.getNama(), cariMahasiswa.getTglLahir(), cariMahasiswa.getNoTelp());
                        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    } else {
                        System.out.println("Mahasiswa dengan NIM yang dicari tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.println("Data Mahasiswa (LinkedList):");
                    linkedListMahasiswa.cetakSemuaMahasiswa();
                    break;
                case 6:
                    linkedListMahasiswa.sortMahasiswa();
                    System.out.println("Data Mahasiswa (LinkedList) setelah diurutkan:");
                    linkedListMahasiswa.cetakSemuaMahasiswa();
                    break;
                case 7:
                    System.out.println("Keluar!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 6);

        sc.close();
    }
}
