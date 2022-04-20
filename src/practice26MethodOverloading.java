public class practice26MethodOverloading {
    //kemampuan membuat method dengan nama yang sama lebih dari satu , tapi parameternya harus berbeda
    public static void main(String[] args) {
        sayHello();
        sayHello("Nama saja");
        sayHello("First name", "Second name");
    }
    static void sayHello(){
        System.out.println("Testing");
    }
    static void sayHello(String name){
        System.out.println("Testing2 with string " + name);
    }
    static void sayHello(String firstName, String lastName){
        System.out.println("Testing3 with string " + firstName + " " + lastName);
    }
}
