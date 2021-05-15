public class TestePilhaGenerica {
    public static void main(String[] args) {
        PilhaVetorG<Carta> pilhaCartas = new PilhaVetorG<>();
        PilhaVetorG<Integer> pilhaInteiros = new PilhaVetorG<>();

        Carta c1 = new Carta ("copas", "valete");
        
        // Usando variável
        pilhaCartas.push(c1);
        // Direto
        pilhaCartas.push(new Carta ("espadas", "ás"));

        pilhaInteiros.push(23); //autoboxing
        pilhaInteiros.push(45); //Só pra lembrar

        System.out.println(pilhaCartas);
        System.out.println(pilhaInteiros);
    }
}
