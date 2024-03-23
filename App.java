package StudiKasus03;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("==== APLIKASI PENYIMPAN KHS ====");
        System.out.print("NIM   : "); String nimMahasiswa = scan.nextLine();
        System.out.print("Nama  : "); String namaMahasiswa = scan.nextLine();
        System.out.print("Berapa mata kuliah yang ingin anda masukkan? ");
        int berapa = scan.nextInt();

        Mahasiswa mahasiswa = new Mahasiswa(namaMahasiswa, nimMahasiswa);
        MataKuliah[] mataKuliah = new MataKuliah[berapa];

        scan.nextLine();

        int i = 0;
        while (i < berapa) {

            System.out.print("Nama Mata Kuliah : ");
            String namaMataKuliah = scan.nextLine();
            System.out.print("Kode Mata Kuliah : ");
            int kodeMataKuliah = scan.nextInt();
            System.out.print("Nilai : ");
            int nilaiAngka = scan.nextInt();
            scan.nextLine();

            mataKuliah[i] = new MataKuliah(namaMataKuliah, kodeMataKuliah, nilaiAngka);

            i++;
        }

        System.out.println("==== KHS MAHASISWA ====");
        System.out.println("NIM              : " + mahasiswa.getNim());
        System.out.println("Nama Mahasiswa   : " + mahasiswa.getNama());

        for(int j = 0; j < berapa; j++) {
            System.out.println("Nama Mata Kuliah : " + mataKuliah[j].getNama());
            System.out.println("Kode Mata Kuliah : " + mataKuliah[j].getKode());
            System.out.println("Nilai            : " + mataKuliah[j].getNilaiHuruf());
        }

        scan.close();
    }
}