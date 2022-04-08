import java.sql.SQLOutput;

public class latihan14IfStatement {
    public static void main(String[] args) {
        System.out.println("Nama Siswa Budi");
        var nilaiKKM_MTK = 70;
        var nilaiKKM_Bindo = 70;
        var nilaiKKM_IPA = 70;
        var nilaiKKM_IPS = 70;
        var nilaiKKM_Inggris = 70;

        int[] budi = {2, 9, 10, 80, 10};



        if(budi[0] >= nilaiKKM_MTK) {
            System.out.println("Budi Lulus MTK");
        } else{
                System.out.println("Budi tdk lulus MTK");
        }
        if(budi[1] >= nilaiKKM_Bindo){
            System.out.println("Budi Lulus B indo");
        } else{
            System.out.println("Budi tdk lulus B Indo");
        }
        if(budi[2] >= nilaiKKM_IPA){
            System.out.println("Budi Lulus IPA");
        } else{
            System.out.println("Budi tdk lulus IPA");
        }
        if(budi[3] >= nilaiKKM_IPS){
            System.out.println("Budi Lulus IPS");
        } else{
            System.out.println("Budi tdk lulus IPS");
        }
        if(budi[4] >= nilaiKKM_Inggris){
            System.out.println("Budi Lulus Inggris");
        } else{
            System.out.println("Budi tdk lulus Inggris");
        }


        System.out.println("===================");

        var nilai1 = 90;
        var absen1 = 90;

        if(nilai1 >= 90 && absen1 >= 90){
            System.out.println("A Grade");
        }
        else if(nilai1 >= 80 && absen1 >= 80){
            System.out.println("B Grade");
        }
        else if(nilai1 >= 70 && absen1 >= 70){
            System.out.println("C Grade");
        }
        else if(nilai1 >= 60 && absen1 >= 60){
            System.out.println("D Grade");
        }
        else{
            System.out.println("E grade");
        }
    }
}
