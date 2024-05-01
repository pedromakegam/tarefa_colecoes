import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AlphabeticSort();
        ClassificacaoPorGenero();
    }

    public static void AlphabeticSort(){
        List<String> names = new ArrayList<>();
        Scanner nomes_input = new Scanner(System.in);
        for(int i = 0; i<3; i++){
            System.out.println("Digite o nome: ");
            names.add(nomes_input.nextLine());
        }
        Collections.sort(names);
        System.out.println("NOMES ORDENADOS EM ORDEM ALFABETICA" + names);
    }
    public static void ClassificacaoPorGenero(){
        List<Pessoas> pessoas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Scanner nome_input = new Scanner(System.in);
            System.out.println("Digite o nome: ");
            String nome = nome_input.nextLine();
            Scanner genero_input = new Scanner(System.in);
            System.out.println("Digite o genero: ");
            String genero = genero_input.nextLine();
            pessoas.add(new Pessoas(nome, genero));
        }
//        for (Pessoas pessoa : pessoas) {
//            if (pessoa.getGenero().equals("M")||pessoa.getGenero().equals("Masculino")) {
//                System.out.println("Pessoa do gênero masculino: " + pessoa.getNome());
//            } else if (pessoa.getGenero().equals("F") || pessoa.getGenero().equals("Feminino")) {
//                System.out.println("Pessoa do gênero feminino: " + pessoa.getNome());
//            }
//        }
        List<String> pessoas_do_sexo_masculino = new ArrayList<>();
        List<String> pessoas_do_sexo_feminino = new ArrayList<>();
        for (Pessoas pessoa:pessoas){
            if (pessoa.getGenero().equals("M")||pessoa.getGenero().equals("Masculino")){
                pessoas_do_sexo_masculino.add(pessoa.getNome());
            }else if (pessoa.getGenero().equals("F")||pessoa.getGenero().equals("Feminino")){
                pessoas_do_sexo_feminino.add(pessoa.getNome());
            }
        }

        System.out.println("Pessoas do sexo masculino: " + pessoas_do_sexo_masculino);
        System.out.println("Pessoas do sexo feminino: " + pessoas_do_sexo_feminino);

    }
}