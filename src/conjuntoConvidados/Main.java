package conjuntoConvidados;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.addConvidado("Jose", 123456);
        convidados.addConvidado("Zeca", 859635);
        convidados.addConvidado("Maria", 987456);
        convidados.addConvidado("Leticia", 365847);
        convidados.addConvidado("Carlos", 562489);
        convidados.addConvidado("Isabel", 714597);

        convidados.exibirConvidados();
        System.out.println("Existem " + convidados.contarConvidados() + " Convidados\n");

        convidados.removerConvidado();
        System.out.println("Existem " + convidados.contarConvidados() + " Convidados\n");

        convidados.exibirConvidados();
    }
}