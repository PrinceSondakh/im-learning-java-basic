public class practiceJustForTesting {
    //Bruvh I confused about modulus thing 16 April 2022, I mean, yeaa I was using that in my entire college but maybe I never use it in entire project/program xD but I'm still curious LOL
    public static void main(String[] args) {
        var tipe ="";
        for(var counter = 1; counter <=100; counter++){
            if(counter % 2==0){
                tipe = "Genap";
            } else {
                tipe = "Ganjil";
            }
            System.out.println(counter + " bertipe " + tipe);
        }
    }
}
