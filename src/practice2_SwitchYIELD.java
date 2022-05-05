public class practice2_SwitchYIELD {
    public static void main(String[] args) {
        manual();
    }

    public static void manual(){
        var nilai = "A";
        String ucapan;
        //MANUAL
        switch (nilai){
            case "A" -> ucapan = "Wow anda lulus dengan baik";
            case "B" -> ucapan = "Wow anda lulus dengan ok";
            case "C" -> ucapan = "Wow anda lulus";
            default -> {
                ucapan = "Anda salah pilih jurusan";
            }
        }
        System.out.println(ucapan);
    }

    public static void yield(){ //Yield utk mengembalikan return value
        var nilai = "B";
        //With yield
        String ucapan = switch (nilai){
            case "A": yield "Wow anda lulus dengan baik";
            case "B": yield "Wow anda lulus dengan ok";
            case "C": yield "Wow anda lulus";
            default: yield "Anda salah pilih jurusan";
        };
        System.out.println(ucapan);
    }

}
