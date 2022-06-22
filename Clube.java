public class Clube {
    private String id_clube;
    private String nome;
    private int quantidade_de_titulos;

    public Clube(){

    }

    public Clube(String id_clube, String nome, int quantidade_de_titulos){
        setId_clube(id_clube);
        setNome(nome);
        setQuantidade_de_titulos(quantidade_de_titulos);
    }

    private void setId_clube(String id_clube) {
        this.id_clube = id_clube;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setQuantidade_de_titulos(int quantidade_de_titulos) {
        this.quantidade_de_titulos = quantidade_de_titulos;
    }

    public String getId_clube() {
        return id_clube;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade_de_titulos() {
        return quantidade_de_titulos;
    }
}
