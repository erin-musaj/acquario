public class Main {
    public static void main(String[] args) {
        Pesce furly = new Pesce("furly", "caffeinomane");
        System.out.println(furly.toString());
        Pesce[] array = new Pesce[]{new Pesce("furly", "caffeinomane"), new Pesce("furly", "caffeinomane"),new Pesce("furly", "caffeinomane")};
        Acquario silverHand = new Acquario(array);
        System.out.println(silverHand.toString());
        System.out.println(array[1].toString());
        try{
            Acquario test = new Acquario(silverHand);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}