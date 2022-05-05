public class practice2_LAMBDASWITCH {
    //Tidak perlu kata kunci break
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai){
            case "A" -> System.out.println("Wow anda lulus dengan baik");
            case "B" -> System.out.println("Wow anda lulus dengan ok");
            case "C" -> System.out.println("Wow anda lulus");
            default -> {
                System.out.println("Anda salah pilih jurusan");
            }
        }

    }
}
