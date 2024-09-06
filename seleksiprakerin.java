import java.util.Scanner;

public class  seleksiprakerin {
    public static void main(String[] args) {
        String nama,kelas,perilaku;
        int nilai;

        Scanner s = new Scanner(System.in);
        System.out.print("nama: ");
        nama = s.nextLine();
        System.out.print("kelas: (X/XI/XII)");
        kelas = s.next();

        if(kelas.equalsIgnoreCase("XII")){
            System.out.print("perilaku siswa: (baik/cukup)");
            perilaku = s.next();
            if (perilaku.equalsIgnoreCase("baik")) {
                System.out.println("nilai siswa: ");
                nilai = s.nextInt();
                if(nilai >=85){
                    System.out.println(nama+ "dinyatakan bisa mengikuti prakerin");
                }else{
                    System.out.println("maaf anda gagal karena nilai");
                }
            }else{
                System.out.println("anda gagal karena perilaku");    
            }
        }else{
            System.out.println("anda gagal karena bukan kelas XII");
        }
    }
    
}
