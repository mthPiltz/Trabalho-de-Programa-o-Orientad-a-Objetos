public class Tecnico {
    String id_tecnico;
    String nome;

    public Tecnico(){

    }

    public Tecnico(String id_tecnico, String nome){
        setNome(nome);
        setId_tecnico(id_tecnico);
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setId_tecnico(String id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public String getId_tecnico() {
        return id_tecnico;
    }

    public String getNome() {
        return nome;
    }
}
