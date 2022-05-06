public class practice2_SWITCHLAMBDAandYIELD {
    public static void main(String[] args) {

        var nilai = "A";
        /**switch lambda*/
        switch (nilai) {
            case "A" -> System.out.println("Nilai anda sempurna");
            case "B" -> System.out.println("Nilai and cukup baik");
            case "C" -> System.out.println("Nilai anda ok");
            default -> System.out.println("Mungkin anda salah jurusan");
        }
        /**tanpa yield*/
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Nilai anda sempurna";
            case "B" -> ucapan = "Nilai and cukup baik";
            case "C" -> ucapan ="Nilai anda ok";
            default -> ucapan = "Mungkin anda salah jurusan";
        }
        System.out.println(ucapan);
        /** JAVA 14 ..dengan YIELD, yield itu return value*/
        String ucapan2 = switch (nilai){
            case "A": yield "Nilai anda sempurna";
            case "B": yield "Nilai and cukup baik";
            case "C": yield "Nilai anda ok";
            default: yield "Mungkin anda salah jurusan";
        };
        System.out.println(ucapan2);

    }
}
