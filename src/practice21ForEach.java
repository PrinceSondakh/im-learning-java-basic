public class practice21ForEach {
    //For each utk mengakses data di seluruh ARRAY secara otomatis, karena mengakses data array menggunakan perulangan biasanya bertele-tele
    public static void main(String[] args) {
        //Bertele-tele ARRAY untuk perulangan
        String[] array = {
                "Eko", "Kurniawan", "Khannedy",
                "Programmer", "Zaman", "Now"
        };
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        //kalau pakai For Each (untuk mengambil seluruh data dalam array)
        System.out.println("This is foreach:");
        for (var name : array){ //For,, var name/string name atau tipe datanya ..
            System.out.println(name);
        }
    }
}
