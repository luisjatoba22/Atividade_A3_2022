import java.util.ArrayList;

public abstract class Personagem {
    private String nome;
    private String editora;
    private int pf;
    private int pe;

    // Criando o Array de personagens
    private ArrayList<Poder> poderes = new ArrayList<Poder>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getPf() {
        return pf;
    }

    public void setPf(int pf) {
        this.pf = pf;
    }

    public int getPe() {
        return pe;
    }

    public void setPe(int pe) {
        this.pe = pe;
    }

    public void AdicionarPoder(Poder p) {
        this.poderes.add(p);
    }

    public void RemoverPoder(Poder p) {
        this.poderes.remove(p);
    }

    // Constutor Personagem
    public Personagem(String nome, String editora, int pf, int pe) {
        this.nome = nome;
        this.editora = editora;
        this.pf = pf;
        this.pe = pe;
    }
}
