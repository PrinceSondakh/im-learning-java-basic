public class practice2_TernaryOperator {
    public static void main(String[] args) {
        manual();
        pakaiTernaryOperator();
    }

    /** MEMAKAI TERNARY OPERATOR, LEBIH CEPAT DAN SEDERHANA*/
    public static void pakaiTernaryOperator(){
        var nilai = 90;
        String abaf = "sof";
        String ucapan = nilai > 75 ? abaf : "Anda tidak lulus";
        System.out.println(ucapan);
    }

    public static void manual(){
        var nilai = 75;
        String ucapan;

        if (nilai >= 75) {
            ucapan = "anda lulus";
        } else {
            ucapan = "anda tidak lulus";
        }
        System.out.println(ucapan);
    }
}
