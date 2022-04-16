import java.sql.SQLOutput;

public class practice20BreakAndContinue {
    //in switch state ment we know break
    //break untuk menghentikan semua perulangannya
    //continue menghentikan perulangan saat ini dan melanjutkan ke perulangan berikutnya
    public static void main(String[] args) {
        //this is break
        var counter = 1;
        while (true) {
            System.out.println("Looping number " + counter);
            counter++;

            if (counter > 10) {
                break;
            }
        }
        System.out.println("Looping stopped");

        //this is continue
        for (var counter2 = 1; counter2 <100; counter2++){
            if (counter2 % 2 == 0){ //kalau nilai continue True maka dihentikan, dalam kasus ini kalau nilai
                continue; //dalam kasus ini kalau nilainya genap maka dihentikan
            }
            System.out.println("Looping ganjil "+ counter2);
        }
    }
}
