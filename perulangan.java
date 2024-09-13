import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        int nilaisiswa=0,jumlahsiswa;
        Scanner s = new Scanner(System.in);
        System.out.println("masukan jumlah siswa");
        jumlahsiswa = s.nextInt();

        int totalnilai=0;

        for (int index = 1; index <=jumlahsiswa; index++) {
            System.out.println("masukan nilai siswa"+index+":");
            nilaisiswa = s.nextInt();
            totalnilai+=nilaisiswa;
            
        }

            double ratarata = totalnilai / jumlahsiswa;
            System.out.println("total nilai: "+ totalnilai);
            System.out.println("rata rata: "+ ratarata);
        }
    }
    

