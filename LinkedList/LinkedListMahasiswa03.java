public class LinkedListMahasiswa03 {
    private Node03 head;
    private Node03 tail;

    public LinkedListMahasiswa03() {
        this.head = null;
        this.tail = null;
    }

    public void tambahMahasiswa(Mahasiswa03 mhs) {
        Node03 newNode = new Node03(mhs);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void hapusMahasiswa(String nim) {
        Node03 current = head;
        Node03 previous = null;

        while (current != null && !current.data.getNim().equals(nim)) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Mahasiswa tidak ditemukan.");
            return;
        }

        if (previous == null) {
            head = current.next;
        } else {
            previous.next = current.next;
        }

        if (current == tail) {
            tail = previous;
        }

        System.out.println("Mahasiswa dengan NIM " + nim + " telah dihapus.");
    }

    public Mahasiswa03 cariMahasiswa(String nim) {
        Node03 current = head;
        while (current != null) {
            if (current.data.getNim().equals(nim)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void cetakSemuaMahasiswa() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|                              DATA MAHASISWA                                |");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.printf("| %-15s | %-20s | %-15s | %-15s |\n", "NIM", "Nama", "Tanggal Lahir", "No Telepon");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Node03 current = head;
        while (current != null) {
            Mahasiswa03 mhs = current.data;
            System.out.printf("| %-15s | %-20s | %-15s | %-15s |\n", mhs.getNim(), mhs.getNama(), mhs.getTglLahir(), mhs.getNoTelp());
            current = current.next;
        }
    }

    public void sortMahasiswa() {
        Node03 current = head;
        Node03 index = null;
        Mahasiswa03 temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.getNama().compareTo(index.data.getNama()) > 0) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
            System.out.println("Data Mahasiswa telah diurutkan berdasarkan nama.");
        }
    }
}


