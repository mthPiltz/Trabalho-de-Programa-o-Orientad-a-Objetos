public class Campeonato {
    String id_campenato;
    String nome;
    String estrutura;

    public Campeonato(){

    }

    public Campeonato(String id_campeonato, String nome, String estrutura){
        setEstrutura(estrutura);
        setId_campenato(id_campenato);
        setNome(nome);
    }

    private void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }

    private void setId_campenato(String id_campenato) {
        this.id_campenato = id_campenato;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstrutura() {
        return estrutura;
    }

    public String getId_campenato() {
        return id_campenato;
    }

    public String getNome() {
        return nome;
    }
}
