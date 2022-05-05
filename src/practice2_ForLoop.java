public class practice2_ForLoop {
    public static void main(String[] args) {

        var a = 1;
        while(a < 0){
            System.out.println("A lebih dari 0 = " + a);
            a++;
            if (a > 20000) {
                break;
            }

        }
        System.out.println(a);

    }
}
