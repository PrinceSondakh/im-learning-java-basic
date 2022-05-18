public class practice2_FactorialLoopTest {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(1 * 2 * 3 * 4 * 5);
       // System.out.println(factorialLoopRecursiveMethod(5));
    }

    public static int factorialLoop(int value){
        int nilai = 1;
        for(int i = 1; i <= value; i++){
            nilai *= i;
        }
        return nilai;
    }
}
