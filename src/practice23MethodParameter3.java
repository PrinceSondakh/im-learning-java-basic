public class practice23MethodParameter3 {
    public static void main(String[] args) {
        sayHello("Eko","Kurniawan");
        sayHello("Budi","Nugraha");
        sayHello("Joko","Nugroho");
    }

    static void sayHello(String firstName, String lastName){ //tidak ada batasan dalam jumlah parameter yang dimasukan
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
