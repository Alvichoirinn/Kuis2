package Collection;
import java.util.ArrayList;
import java.util.List;
public class ArrayListMahasiswa03 {
    // Mendeklarasikan variabel mahasiswaList sebagai List yang berisi objek Mahasiswa03
    private List<Mahasiswa03> mahasiswaList;

    //Konstruktor untuk inisialisasi mahasiswaList sebagai ArrayList kosong
    public ArrayListMahasiswa03() {
        mahasiswaList = new ArrayList<>();
    }

    //Method untuk menambahkan data mahasiswa
    public void tambahMahasiswa(Mahasiswa03 mhs) {
        mahasiswaList.add(mhs);
    }

    //Method untuk menghapus data mahasiswa
    public void hapusMahasiswa(String nim) {
        Mahasiswa03 mhs = cariMahasiswa(nim);
        if (mhs != null) {
            mahasiswaList.remove(mhs);
            System.out.println("Mahasiswa dengan NIM " + nim + " telah dihapus.");
        } else {
            System.out.println("Mahasiswa tidak ditemukan.");
        }
    }

    //Method untuk mencari data mahasiswa
    public Mahasiswa03 cariMahasiswa(String nim) {
        for (Mahasiswa03 mhs : mahasiswaList) {
            if (mhs.getNim().equals(nim)) {
                return mhs;
            }
        }
        return null;
    }

    //Method untuk mencetak data mahasiswa
    public void cetakSemuaMahasiswa() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|                              DATA MAHASISWA                                |");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.printf("| %-15s | %-20s | %-15s | %-15s |\n", "NIM", "Nama", "Tanggal Lahir", "No Telepon");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    
        //Mencetak setiap objek mahasiswa03 dalam format berikut
        for (Mahasiswa03 mhs : mahasiswaList) {
            System.out.printf("| %-15s | %-20s | %-15s | %-15s |\n", mhs.getNim(), mhs.getNama(), mhs.getTglLahir(), mhs.getNoTelp());
        }
    }
}


