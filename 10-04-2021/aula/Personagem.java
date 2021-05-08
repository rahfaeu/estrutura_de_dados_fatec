public class Personagem {
    private String nome;
    private int fome;
    private int forca;
    private int sono;

    // Construtores (com sobrecarga) > sobrecarga de construtores
    public Personagem(String nome, int fome, int forca, int sono) {
        this.setNome(nome);
        this.setFome(fome);
        this.setForca(forca);
        this.setSono(sono);
    }
    public Personagem(String nome) {
        this.setNome(nome);
        this.setFome(1);
        this.setForca(1);
        this.setSono(1);
    }
    
    public Personagem() {};


    // Métodos de acesso = getters
    public String getNome() {
        return this.nome;
    }

    public int getFome() {
        return this.fome;
    }

    public int getForca() {
        return this.forca;
    }

    public int getSono() {
        return this.sono;
    }

    // Métodos modificadores = setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setForca(int forca) {
        if (forca >= -5 && forca <= 5) {
            this.forca = forca;
        }
    }

    public void setFome(int fome) {
        if (fome <= 0 && fome <= 8) {
            this.fome = fome;
        }
    }

    public void setSono(int sono) {
        if (sono >= 0 && sono <= 10) {
            this.sono = sono;
        }
    }

    void dormir() {
        this.setSono(this.getSono()-2);
        this.setForca(this.getForca()+1);
    }

}
