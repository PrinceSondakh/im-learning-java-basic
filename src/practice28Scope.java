public class practice28Scope {
    //Di java variable hanya bsa diakses didalam area dimana mereka dibuat, hal ini disebut scope
    //hny ada ada dlm blok ini
    public static void main(String[] args) {
        sayHello("Prince");
        sayHello("");
    }
    static void sayHello(String name){
        String hello = "Hello " + name;

        if(!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }
        System.out.println(hello);
    }
}
