public class latihan8TipeDataBukanPrimitif {

    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        //konversi primitif ke bukan primitif
        int iniInt33 = 100;
        Integer iniInteger2 = iniInt33;

        //latihan
        int age = 30;

        Integer iniObject = age;

        int konversiKePrimitifLagi = iniObject;
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();
        System.out.println(iniShort + " " + iniLong2 + " " + iniFloat);
        Long amount = 100000L;
       // amount.

    }

}
