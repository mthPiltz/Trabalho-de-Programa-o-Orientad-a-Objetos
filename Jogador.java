public class Jogador{
    private String id_jogador;
    private String nome;
    private String idade;

    public Jogador(){

    }

    public Jogador(String id_jogador, String nome, String idade){
        setId_jogador(id_jogador);
        setIdade(idade);
        setNome(nome);
    }

    private void setId_jogador(String id_jogador) {
        this.id_jogador = id_jogador;
    }

    private void setIdade(String idade) {
        this.idade = idade;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getId_jogador() {
        return id_jogador;
    }

    public String getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}