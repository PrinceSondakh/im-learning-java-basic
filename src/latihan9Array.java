public class latihan9Array {

    public static void main(String[] args) {

        //pertama tipe datanya dulu terus [] terus nama variabelnya..
        String[] arrayString;

        //menginisialisasi, kata kunci neww dan masukan jumlah data yg ditampung
        arrayString = new String[3];

        //cara ubah isi dari array, gunakan nama variabel, terus kurung kotak [] dan nomor indexnya
        arrayString[0] = "Prince";
        arrayString[1] = "George";
        arrayString[2] = "Imanuel";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[0] = "Budi";

        System.out.println(arrayString[0]);

        //bisa juga seperti ini
        String[] arrayString2 = new String[4];

        String[] nama = new String[]{
          "Bebek", "Dodol", "sdfssd"
        };

        int[] arrayInt = new int[]{
                1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = new long[]{
                10L, 20L, 30L
        };
        /* OPERASI Di Array
        * array [index] mengambil data
        * array [index] = value mengubah data
        * array.length = mengambil panjang array
        * */
        System.out.println(arrayLong.length);

        //Array dalam array
        String[][] array2kali = new String[][]{
                {"barisPertamaNomor1", "barisPertamaNomor2", "barisPertamaNomor3"}, //array 0
                {"barisKeduaNomor1", "barisKeduaNomor2", "barisKeduaNomor3"},
                {"barisKetigaNomor1", "barisKetigaNomor2", "barisKetigaNomor3"},
                {"barisKeempatNomor1", "barisKeempatNomor2", "barisKeempatNomor3"}
        };

        System.out.println(array2kali[0][1]);
        System.out.println(array2kali[1][1]);
        System.out.println(array2kali[2][1]);
        System.out.println(array2kali[2][2]);
        System.out.println(array2kali[1][1]);
        System.out.println(array2kali[0][0]);


        array2kali[2][2] = "Bebek3";
        array2kali[1][1] = "Bebek2";
        array2kali[0][0] = "Bebek1";
        System.out.println(array2kali[2][2] + " " + array2kali[1][1] + " " + array2kali[0][0]);
        System.out.println(array2kali.length);
        System.out.println(array2kali[0].length);

    }

}
