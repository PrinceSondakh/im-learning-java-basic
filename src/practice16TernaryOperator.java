public class practice16TernaryOperator {
    /*
    What is Ternary operator ? To reduce the using of If-Else statement
    */
    public static void main(String[] args) {
        // Without Ternary Operator
        var nilai = 75;
        String ucapan;

        if(nilai >= 75){
            ucapan = "Congrats! You are graduate!";
        } else {
            ucapan = "Try again!";
        }

        System.out.println(ucapan);

        //========================================
        //This is with ternary operator
        var nilai2 = 75;
        String ucapan2 = nilai >= 75 ? "Congrats! You are graduate!" : "Try Again";
        System.out.println(ucapan2);
    }
}
