public class PilhaVetor {
    private int dados[];
    private int topo;
    private int capacidade;

    // Construtores
    public PilhaVetor() {
        this(10);
    }
    public PilhaVetor(int capacidade) {
        this.dados = new int[capacidade];
        this.topo = 0;
        this.capacidade = capacidade;
    }
    public boolean estaCheia() {
        return this.topo == this.capacidade;
    }
    public boolean estaVazia() {
        return this.topo == 0;
    }
    public void push(int i) {
        //Atribui primeito inclementa depois (++)
        this.dados[this.topo++] = i;
    }
    public int pull() {
        return this.dados[--this.topo];
    }
    public int tamanho() {
        return this.topo;
    }
    public int consultaTopo() {
        return this.dados[this.topo-1];
    }
    @Override
    public String toString() {
        String sPilha = "Pilha: ";
        if (this.estaVazia()) {
            sPilha = sPilha + "está vazia.";
        }
        else {
            sPilha = sPilha + "Capacidade: " + this.capacidade + " Tamanho: " + this.tamanho() + "\n";
            for (int i = this.topo-1; i>=0; i--) {
                sPilha = sPilha + this.dados[i] + " ";
            }
        }
        sPilha = sPilha + "\n";
        return sPilha;
    }
}