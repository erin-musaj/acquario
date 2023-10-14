public class Pesce {
    private String nome;
    private String razza;
    private int id;
    private static int maxId;

    public Pesce(String nome, String razza) {
        this.nome = nome;
        this.razza = razza;
        this.id=this.maxId;
        maxId++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "{ nome = \"" + nome + "\" , razza = \"" + razza + "\" }";
    }

    public Pesce clone(){
        return new Pesce(this.nome, this.razza);
    }

}

