public class practice17ForLoop {
    //There are condition in For, if condition values=true then For will be loop if not then it would be dismissed
    /*
    * for(init statement; kondisi; post statement){
    * //block perulangan
    * }
    * init statement = only once execution
    * kondisi = pengecekan setiap perulangan, kalau true maka dieksekusi terus, kalau false maka berhenti
    * post statement = always execute at end of the looping
    *
    * init statement,kondisi, post statement are optionall.. if not included kondisi then the value is true
    ** * * * *    * */

    public static void main(String[] args) {

        /*1. LOOPING WITH CONDITION*/
        var counter = 1;

        for(; counter <= 10; ){
            System.out.println("Looping number "+ counter);
            counter++;
        }
        System.out.println(counter);

        //Dont try this
        //for(;;){
        //    System.out.println("Always looping");
        //}

        /*2. LOOPING with Init statement*/
        for(var counter2 = 1; counter2 <= 10; ){
            System.out.println("Looping 2 number "+ counter2);
            counter2++;
        }

        /*3. LOOPING with Post statement*/
        for(var counter3 = 1; counter3 <= 10; counter3++){
            System.out.println("Looping 3 number "+ counter3);
        }
    }
}



