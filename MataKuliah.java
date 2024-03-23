package StudiKasus03;

public class MataKuliah {
    private String nama;
    private int kode;
    private int nilaiAngka;

    public MataKuliah(String nama, int kode, int nilaiAngka) {
        this.nama = nama;
        this.kode = kode;
        this.nilaiAngka = nilaiAngka;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public int getNilaiAngka() {
        return nilaiAngka;
    }

    public void setNilaiAngka(int nilaiAngka) {
        this.nilaiAngka = nilaiAngka;
    }

    public String getNilaiHuruf() {
        if (nilaiAngka >= 85) {
            return "A";
        } else if (nilaiAngka >= 80) {
            return "A-";
        } else if (nilaiAngka >= 75) {
            return "B+";
        } else if (nilaiAngka >= 70) {
            return "B";
        } else if (nilaiAngka >= 65) {
            return "B-";
        } else if (nilaiAngka >= 60) {
            return "C+";
        } else if (nilaiAngka >= 55) {
            return "C";
        } else if (nilaiAngka >= 50) {
            return "C-";
        } else if (nilaiAngka >= 40) {
            return "D";
        } else if (nilaiAngka >= 0) {
            return "E";
        } else {
            return "Nilai tidak valid";
        }
    }
}
