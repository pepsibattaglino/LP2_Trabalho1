/**
 * Created by Giuseppe on 13/04/2017.
 */
public class Client {
    private String rg;
    private String name;
    private String fone;

    public Client(String rg, String name, String fone){
        this.rg = rg;
        this.name = name;
        this.fone = fone;
    }//---------------------------------------------------- Construtor



    //---------------------------------------------------- Getters e Setters
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
