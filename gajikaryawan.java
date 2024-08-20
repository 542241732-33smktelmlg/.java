import java.util.Scanner;

public class gajikaryawan {

    public static void main(String[] args) {

        double jamkerja, tarifperjam, pajak, gajikaryawan;

         Scanner input = new Scanner(System.in);
         System.out.println("masukan jam kerja: ");
         jamkerja = input.nextDouble();
         System.out.println("masukan tarif kerja: ");
         tarifperjam = input.nextDouble();
         System.out.println("masukan pajak");
         pajak = input.nextDouble();

         gajikaryawan=jamkerja*tarifperjam;
         pajak=(pajak/100)*gajikaryawan;
         gajikaryawan=gajikaryawan-pajak;
         System.out.println("gajikaryawan :"+gajikaryawan);




        
    }
    
}
