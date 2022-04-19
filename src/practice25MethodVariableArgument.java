public class practice25MethodVariableArgument {
    //variable argument = method untuk mengirim data dgn jumlah tak tentu/pasti , bisa nol atau lebih
    //biasanya menggunakan array sebagai parameter di method tersebut
    //HANYA BISA ditempatkan diposisi akhir
    public static void main(String[] args) {
        //Ini pakai array
        int[] values = {80, 50, 50, 50, 80};
        sayCongrats("Guderian", values);
        //=====================================================
    }

    //Ini pakai aray ==========================================================
    static void sayCongrats(String name, int[] values){
        var total = 0;
        for (var value : values){ //value didalam values
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){ //nilai rata2
            System.out.println("Congrats " + name + ", You are graduate!");
        } else {
            System.out.println("Sorry" + name + ", You don't pass this semester");
        }
    }
}
