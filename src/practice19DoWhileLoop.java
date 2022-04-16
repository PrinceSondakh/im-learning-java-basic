public class practice19DoWhileLoop {
    //while loop = pengecekan kondisi dilakukan di awal, kalau ini di cek terakhir
    //minimum 1x execution, eventough the condition is wrong
    public static void main(String[] args) {

        var counter = 100;
        /*This is one of the wrong condition because Counter is 100 and java program won't show it*/
        while (counter <= 10){
            System.out.println("Looping " + counter);
            counter++;
        }

        var counter2 = 100;
        do{
            System.out.println("Looping from counter 2 " + counter2);
            counter2++;
        } while (counter2 <=10);

        /* Contoh penerapan , menampilkan menu program yg minimal 1x, misalkan datanya tidak valid*/

    }
}
