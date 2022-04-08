public class latihan15Switch {
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Anda lulus dgn baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda tidak lulus");
        }

        switch(nilai){
            case "A" -> System.out.println("Wow anda lulus dgn baik");
            case "B", "C" -> System.out.println("Nilai anda cukup baik");
            case "D" -> System.out.println("Anda tdk lulus");
            default -> {
                System.out.println("Anda salah jurusan");
            }
        }

        var nilai2 = "A";
        String ucapan;

        switch(nilai){
            case "A" -> ucapan = "Wow anda lulus dgn baik";
            case "B", "C" -> ucapan = "Nilai anda cukup baik";
            case "D" -> ucapan = "Anda tdk lulus";
            default -> ucapan = "Anda salah jurusan";

        }
        System.out.println(ucapan);

        //coba menambah ini test saja sih wkwk

    }
}
