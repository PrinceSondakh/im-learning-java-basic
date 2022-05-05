public class ForEach_practice2_MethodVariableArgument {

    /** VARIABLE ARGUMENT: mengirim data dgn jumlah yg tdk pasti*/
    public static void main(String[] args) {

        int[] values = {80, 80, 50, 50, 50};
        sayCongrats("Eka", values);

        sayCongrats("Prince", 90,90,90,90,90);
    }

    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " anda lulus");
        } else {
            System.out.println("maaf " + name + " anda tidak lulus");
        }

    }

}
