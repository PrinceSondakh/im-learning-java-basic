public class practice2_RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialPanggil(5));
        System.out.println(1 * 2 * 3 * 4 * 5);
        System.out.println(1 + 2 + 3 + 4 + 5);
    }

    static int factorialPanggil(int nilai){
        var result = 1; //kalau mau tambah bagusnya result dibikin 0

        for(var counter = 1; counter <= nilai; counter++){
            System.out.println("result now " + result);
            result += counter;

        }

        return result;
    }

}
