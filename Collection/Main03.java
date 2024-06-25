package Collection;

import java.util.Scanner;
import Collection.ArrayListMahasiswa03;

public class Main03 {
    public static void main(String[] args) {
        ArrayListMahasiswa03 arrayListMahasiswa = new ArrayListMahasiswa03();
        
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Cari Mahasiswa");
            System.out.println("4. Cetak Semua Mahasiswa (ArrayList)");
            System.out.println("5. Keluar");
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
                    arrayListMahasiswa.tambahMahasiswa(new Mahasiswa03(nim, nama, tglLahir, noTelp));
                    break;
                case 2:
                    System.out.print("NIM: ");
                    nim = sc.nextLine();
                    arrayListMahasiswa.hapusMahasiswa(nim);
                    break;
                case 3:
                    System.out.print("NIM: ");
                    String nimCari = sc.nextLine();
                    Mahasiswa03 cariMahasiswa = arrayListMahasiswa.cariMahasiswa(nimCari);
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
                case 4:
                    System.out.println("Data Mahasiswa (ArrayList):");
                    arrayListMahasiswa.cetakSemuaMahasiswa();
                    break;
                case 5:
                    System.out.println("Keluar!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}
