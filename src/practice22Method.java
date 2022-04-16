public class practice22Method {
    /* METHOD
    * Method adalah block code program yang akan berjalan saat kita panggil
    * method prinntln() = menampilkan tulisan di console
    * untuk membuat method di java kita bisa menggunakan kata kunci void, lalu diikuti dgn nama method, kurung() dan diakhiri dgn block
    *
    *dalam bahasa pemrograman lain method disebut juga dgn Function/method
    *
    * kegunaan method kalau mau misah misahin kode program maka akan BERMANFAAT
    * METHOD JUGA BERSIFAT RE-USABLE , bisa Digunakan kembali
    *
    * */
    public static void main(String[] args) {
        sayHelloWorld();
        sayHelloWorld();
    }
    //static hanya boleh manggil static
    //method diawali dgn huruf kecil , jgn ikutin style org PHP atau javascript pakai underscore bikin method
    static void sayHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World2");
        System.out.println("Hello World3");
    }

}
