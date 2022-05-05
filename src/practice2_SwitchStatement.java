public class practice2_SwitchStatement {
    public static void main(String[] args) {
        char nilai = 'B';

        switch (nilai) {
            case 'A':
                System.out.println("Selamat anda lulus dengan sangat baik");
                break;
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Selamat anda memenuhi standard untuk lulus di mata pelajaran ini");
                break;
            default:
                System.out.println("Anda tidak lulus");
        }

    }
}
