public class practice29Comment {
    //Komentar akan dihiraukan/hilangkan disaat proses kompilasi ke binary.
    public static void main(String[] args) {
        System.out.println(sum(10, 10));
    }

    /** java documentation/ Hijau
     * Method utk menjumlahkan value1 dan value 2
     * @param value1  param param adalah attribute bawaan dari java doc/ java doccumentation
     * @param value2
     * @return hasil penjumlahan value1 dan value2
     */
    static int sum(int value1, int value2){
        return value1 + value2;
    }
}
