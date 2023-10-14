public class Acquario {

    private Pesce[] pesci;


    public Acquario(Pesce[] pesci) {
        this.pesci = new Pesce[pesci.length];
        for(int i = 0; i> pesci.length; i++){
            this.pesci[i]=pesci[i].clone();
        }
    }

    public Acquario(int length){
        this.pesci = new Pesce[length];
    }

    public Acquario(Acquario acquario) {
        this.pesci = new Pesce[acquario.pesci.length];
        for(int i = 0; i>this.pesci.length; i++){
            this.pesci[i]=acquario.pesci[i].clone();
        }
    }

    public void setPesce(int i, Pesce pesce) throws Exception{
        if(i<0 || i>=this.pesci.length){
            throw new Exception("Index invalid");
        } else {
            this.pesci[i]=pesce.clone();
        }
    }

    public void addPesce(Pesce pesce)throws Exception{
        int i = 0;
        while(this.pesci[i]!=null){
            i++;
        }
        if(i<0 || i>=this.pesci.length){
            throw new Exception("pesci is full");
        } else {
            this.pesci[i]=pesce.clone();
        }
    }

    public Pesce removePesce(int i) throws Exception {
        if(i<0 || i>=this.pesci.length){
            throw new Exception("Index invalid");
        }
        Pesce rit = this.pesci[i];
        this.pesci[i]=null;
        return rit;
    }
}
