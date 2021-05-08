public class TestePersonagem {
    public static void main(String[] args) {
        int i;
        Personagem p1; // Declarando
        p1 = new Personagem(); // Instanciando = Construindo
        System.out.println("p1: " + p1.getNome() + "\nForca: " + p1.getFome());

        Personagem p2 = new Personagem(); // Bloco construtor de inicialização
        System.out.println("p2: " + p2.getNome() + "\nForca: " + p2.getFome());

        p1.setFome(10);
        p1.setSono(-3);

        p2.setFome(15);
        p2.setForca(-20);

        System.out.println("Sono de p1: " + p1.getSono());
        System.out.println("Fome de p1: " + p1.getFome());

    }
}