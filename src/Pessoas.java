public class Pessoas implements Comparable<Pessoas>{
    private final String nome;
    private final String genero;

    public Pessoas(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }


    @Override
    public int compareTo(Pessoas pessoas) {
        return this.nome.compareTo(pessoas.getNome());
    }

    public String getNome() {
        return nome;
    }
    public String getGenero(){
        return genero;
    }
}
