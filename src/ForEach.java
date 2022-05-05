public class ForEach {
    public static void main(String[] args) {
        String[] awawa = {
                "Awa1", "Awa2", "Awa3", "Awa4", "Awa5", "Awa6"
        };
        manual(awawa);
        teknikForEach(awawa);
    }

    /** Menggunakan ForEach, utk menangkap semua data*/
    private static void teknikForEach(String... aray){
        for (var name : aray){
            System.out.print(name + " ");
        }
    }

    private static void manual(String... aray){
        String yangDicari = "Awa3";

        for (int i = 0; i < aray.length; i++){
            if(aray[i] == yangDicari){
                isiValue(aray[i]);
            }
        }
    }

    private static void isiValue(String value){
        System.out.println(value + " Telah Ditemukan!");
    }
}
