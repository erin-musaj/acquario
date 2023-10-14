public class Main {
    public static void main(String[] args) {
        Pesce furly = new Pesce("furly", "caffeinomane");
        System.out.println(furly.toString());
        Pesce[] array = new Pesce[]{new Pesce("mattia", "corridore"), new Pesce("elio", "pugilista"),new Pesce("anna", "giovannina")};
        Acquario silverHand = new Acquario(array);
        try{
            Acquario test = new Acquario(silverHand);
            System.out.println(test.toString());
            System.out.println(test.removePesce(2).toString());
            System.out.println(test.toString());
            test.addPesce(new Pesce("Marco", "Polo"));
            System.out.println(test.toString());
            test.setPesce(0,new Pesce("Boh", "non so") );
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}