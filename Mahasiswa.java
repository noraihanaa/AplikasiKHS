package StudiKasus03;

public class Mahasiswa {
    private String nim;
    private String nama;

    public Mahasiswa (String nama, String nim) {
        this.nim = nim;
        this.nama = nama;
    }


    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
}
