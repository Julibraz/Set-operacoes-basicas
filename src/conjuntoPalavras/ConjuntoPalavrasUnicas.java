package conjuntoPalavras;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class ConjuntoPalavrasUnicas {
    Scanner scan = new Scanner(System.in);
    //atributo
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas(){
        this.palavras = new HashSet<>();
    }

    //metodos
    public void addPalavra(){
        System.out.println("Digite 'fim' para encerrar");
        String palavra;
        do{
            System.out.print("digite uma palavra: ");
            palavra = scan.nextLine();
            this.palavras.add(palavra);
            System.out.println();
        }while(!palavra.equals("fim"));
    }

    public void removerPalavra(){
        System.out.print("digite a palavra a ser removida: ");
        String palavra = scan.nextLine();
        if(this.palavras.contains(palavra)) {
            this.palavras.remove(palavra);
            System.out.println("\nPalavra removida\n");
        }else {
            System.out.println("\nPalavra nao existente\n");
        }
    }

    public void verificarPalavra(){
        System.out.print("digite a palavra a ser verificada: ");
        String palavra = scan.nextLine();
        if(this.palavras.contains(palavra)) {
            System.out.println("\nPalavra existente");
        }else{
            System.out.println("\nPalavra nao existente");
        }
    }

    public void exibirPalavrasUnicas(){
        Set<String> palavrasUnicas = new HashSet<>();
        Set<String> palavrasRepetidas = new HashSet<>();

        for (String palavra : this.palavras) {
            if (!palavrasRepetidas.contains(palavra)) {
                if (palavrasUnicas.contains(palavra)) {
                    palavrasUnicas.remove(palavra);
                    palavrasRepetidas.add(palavra);
                } else {
                    palavrasUnicas.add(palavra);
                }
            }
        }

        //imprime as palavras que aparecem apenas uma unica vez
        System.out.println("\nPalavras que aparecem apenas uma vez no conjunto:");
        for (String palavra : palavrasUnicas) {
            System.out.println(palavra);
        }
    }

    //main
     public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.addPalavra();

        conjunto.verificarPalavra();

        conjunto.removerPalavra();

        conjunto.exibirPalavrasUnicas();
    }
}
