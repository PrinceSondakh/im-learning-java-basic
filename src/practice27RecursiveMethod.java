public class practice27RecursiveMethod {
    /* adalah kemampuan method memanggil method dirinya sendiri, contohnya factorial*/
    public static void main(String[] args) {
        factorial(4);
    }

    //Factorial loop tanpa recursive method
    static int factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
            System.out.println("Result right now is " + result);
        }
        return result;
    }
    /*
    * 1
    * 2
    * 6
    * 24
    * 24
    * */
}
