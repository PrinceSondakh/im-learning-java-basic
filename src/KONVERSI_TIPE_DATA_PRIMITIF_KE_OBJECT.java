public class KONVERSI_TIPE_DATA_PRIMITIF_KE_OBJECT {

    public static void main(String[] args) {
        /** semua tipe data yg bukan primitif punya method atau function value utk konversi*/
        int iniInt = 29;

        Integer iniObjInt = iniInt;

        float beb = iniObjInt.floatValue();
        System.out.println(beb);
    }

}
