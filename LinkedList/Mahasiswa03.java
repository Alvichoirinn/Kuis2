public class Mahasiswa03 {
    //Mendefinisikan class Mahasiswa03
    private String nim;
    private String nama;
    private String tglLahir;
    private String noTelp;

    //Mendefinisikan konstruktor untuk class Mahassiswa03
    public Mahasiswa03(String nim, String nama, String tglLahir, String noTelp) {
        this.nim = nim;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.noTelp = noTelp;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public String getNoTelp() {
        return noTelp;
    }

    //Mendefinisikan metode toString untuk menggantikan representasi string default dari objek
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Tanggal Lahir: " + tglLahir + ", No Telp: " + noTelp;
    }
}
