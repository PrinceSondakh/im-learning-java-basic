public class testBooleanSkill1 {

    public static void main(String[] args) {

        var passwordInput1 = 50;
        var passwordInput2 = 50;
        var passwordInput3 = 50;
        var passwordInput4 = 90;

        boolean gate1 = passwordInput1 == passwordInput2;
        boolean gate2 = passwordInput3 == passwordInput4;

        var finalGate = gate1 && gate2;

        System.out.println(finalGate);
    }

}
