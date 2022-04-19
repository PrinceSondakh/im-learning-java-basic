import java.sql.SQLOutput;

public class practice24MethodReturnValue {
    //untuk mengembalikkan valuenya return diikuti dgn tipe datanya
    //dijava hny bisa menghasilkan tipe 1 data dlm 1 method. Tdk bisa return value lebih dari satu. (Golang bisa)
    public static void main(String[] args) {
        var a = 100;
        var b = 200;
        var c = sum(a, b);

        System.out.println(c);
        System.out.println(sum(200,200));
        System.out.println(hitung(130, "+", 130));
        System.out.println(hitung(330, "-", 130));
        System.out.println(hitung(130, "a", 130));
    }
    static int sum(int value1, int value2){
        var total = value1 + value2;
        return (total);
    }
    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
