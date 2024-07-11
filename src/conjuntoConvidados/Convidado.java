package conjuntoConvidados;

public class Convidado {
    //atributos
    private String nome;
    private int codigoDeConvite;

    public Convidado(String nome, int codigoDeConvite) {
        this.nome = nome;
        this.codigoDeConvite = codigoDeConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoDeConvite() {
        return codigoDeConvite;
    }

    @Override
    public String toString() {
        return "Convidado: " +
                "nome= '" + nome + '\'' +
                ", codigoDeConvite= " + codigoDeConvite +
                "\n";
    }
}
