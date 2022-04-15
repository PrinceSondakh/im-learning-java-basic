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
//INI NAMANYA SWITCH LAMBDA HANYA BISA DIGUNAKAN DI JAVA 14 Keatas
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
//ini namanya Switch tanpa yield
        switch(nilai){
            case "A" -> ucapan = "Wow anda lulus dgn baik";
            case "B", "C" -> ucapan = "Nilai anda cukup baik";
            case "D" -> ucapan = "Anda tdk lulus";
            default -> {
                ucapan = "Anda salah jurusan";
            }
        }
        System.out.println(ucapan);

        //SWITCH with yield (yield is for return value) YIELD JUGA HANYA BISA DIGUNAKAN DI JAVA VERSI 14

        ucapan = switch (nilai){
            case "A":
                yield "Wow anda lulus dgn baik";
            case "B", "C" :
                yield "Nilai anda cukup baik";
            case "D" :
                yield "Anda tdk lulus";
            default :
                yield "Anda salah jurusan";
        };
        System.out.println(ucapan);
    }
}
