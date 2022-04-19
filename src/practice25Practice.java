public class practice25Practice {
    //variable argument = method untuk mengirim data dgn jumlah tak tentu/pasti , bisa nol atau lebih
    //biasanya menggunakan array sebagai parameter di method tersebut
    //HANYA BISA ditempatkan diposisi akhir
    public static void main(String[] args) {
        //Ini pakai array
        var total = 0;
        int[] values = {80, 50, 50, 50, 80};
        for (var value : values){ //value didalam values
            total = total + value;
            System.out.println("Nilai value sekarang: "+total);
        }
        //=====================================================
    }
}
