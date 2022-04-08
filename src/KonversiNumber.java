public class KonversiNumber {
    //latihan 3
    public static void main(String[] args) {

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        System.out.println(iniInt);
        //number overflow dibawah
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;

        System.out.println(iniInt2);
    }

}
