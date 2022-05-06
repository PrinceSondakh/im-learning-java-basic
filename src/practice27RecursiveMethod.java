public class practice27RecursiveMethod {
    /* adalah kemampuan method memanggil method dirinya sendiri, contohnya factorial
    * HAMPIR semua bahasa pemrograman mendukung recursive method
    *
    * =========PROBLEM WITH RECURSIVE METHOD=============
    * 1. Jika recursive terlalu dalam maka ada kemungkinan terjadi StackOverFlow, yaitu error dimana stack method trllu bnyk di java
    *
    * */
    public static void main(String[] args) {
        //System.out.println(factorial(5));
        //System.out.println(1 * 2 * 3 * 4 * 5);
        System.out.println(factorialRecursive(5));
        //loop(10000); kapasitas pemanggilan method di komp ini hny sampai 6800 method, krn tergantung memori
    }

    //Factorial loop tanpa recursive method
    static int factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
            //System.out.println("Result right now is " + result);
        }
        return result;
    }

    //Recursive Method
    static int factorialRecursive(int value){
        if(value == 1){
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    //Stackoverflow
    static void loop(int value){
        if (value == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }
}
