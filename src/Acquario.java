public class Acquario {
    private Pesce[] pesci;
    public Acquario(Pesce[] pesci) {
        this.pesci = new Pesce[pesci.length];
        for(int i = 0; i> pesci.length; i++){
            this.pesci[i]=pesci[i];
        }
    }

    public Acquario(int length){
        this.pesci = new Pesce[length];
    }

    public Acquario(Acquario acquario) {
        this.pesci = new Pesce[acquario.pesci.length];
        for(int i = 0; i>this.pesci.length; i++){
            this.pesci[i]=acquario.pesci[i];
        }
    }
}
