package conjuntoConvidados;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class ConjuntoConvidados {
    Scanner scan = new Scanner(System.in);

    //atributo
    private Set<Convidado> convidados;

    public ConjuntoConvidados(){
        this.convidados = new HashSet<>();
    }

    public void addConvidado(String nome, int codigoDeConvite){
        this.convidados.add(new Convidado(nome, codigoDeConvite));
    }

    //removendo convidado pelo codigo de convite
    public void removerConvidado(){
        System.out.print("informe o codigo de convite: ");
        int codigo = scan.nextInt();
        boolean encontrado = false;
        for(Convidado c : convidados){
            if(codigo == c.getCodigoDeConvite()){
                convidados.remove(c);
                System.out.println("Convidado '" + c.getNome() + "' removido com sucesso!");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Convidado nao encontrado!");
        }
        scan.close();
    }

    //quantodade de convidados
    public int contarConvidados(){
        return this.convidados.size();
    }

    //exibindo convidados
    public void exibirConvidados(){
        System.out.println(convidados);
    }

}
