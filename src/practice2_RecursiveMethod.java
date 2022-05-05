public class practice2_RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(specialCase(5));
        System.out.println(factorialLoopo(5));
        System.out.println(factorialRecursive(5));

        loop(10000);
    }
    /** special case */
    static int specialCase(int nilai){
        var result = 1; //kalau mau tambah bagusnya result dibikin 0

        for(var counter = 1; counter <= nilai; counter++){
            result += counter; //tambah
        }
        return result;
    }
    /** factorial Loop manual*/
    static int factorialLoopo(int nilai){
        var result = 1;
        for(var counter = 1; counter <= nilai; counter++){
            result *= counter;
        }
        return result;
    }
    static int factorialRecursive(int nilai){
        if (nilai == 1){
            return 1;
        } else {
            return nilai * factorialRecursive(nilai - 1);
        }
    }
    //Stackoverflow //cuma bisa handle sekitar 6500 method tergantung memory
    static void loop(int value){
        if (value == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }


}
