public class GantiTipeDataCharKeInt {
    public static void main(String[] args) {
        char b = '2';

        int k = 2;
        int l = Character.getNumericValue(b); /**ini methodnya*/
        System.out.println(l);
        System.out.println(k + l);
        System.out.println(k - l);
        System.out.println(k * l);
        System.out.println(k / l);
        System.out.println(k % l);

        int e = -2;
        e--;
        System.out.println(e);

        System.out.println("TERNARY OPERATOR");

        String ucapan = 49 >= 50? "Pake Ini": "Pake itu";
        System.out.println(ucapan);
    }

}
