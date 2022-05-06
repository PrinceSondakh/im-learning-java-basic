public class ForEach_practice2_MethodVariableArgument {

    /** VARIABLE ARGUMENT: mengirim data dgn jumlah yg tdk pasti*/
    public static void main(String[] args) {

        int[] values = {80, 80, 50, 50, 50};
        sayCongrats("Eko", values);

        sayCongrats("Prince", 90,90,90,90,90);
    }

    static void sayCongrats(String name, int... values){
        //var total = 0;
        for (var value : values){
            System.out.println(value);
            //total += value;
        }
        var total2 = 500; // ini hanya tambahan
        var finalValue = total2 / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " anda lulus, nilai anda " +finalValue );
        } else {
            System.out.println("maaf " + name + " anda tidak lulus");
        }

    }

}
