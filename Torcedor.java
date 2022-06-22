public class Torcedor {
    String id_torcedor;
    String nome;
    int quantidade_de_camisas;

    public Torcedor(){

    }

    public Torcedor(String id_torcedor, String nome, int quantidade_de_camisas){
        setId_torcedor(id_torcedor);
        setNome(nome);
        setQuantidade_de_camisas(quantidade_de_camisas);
    }    

    private void setId_torcedor(String id_torcedor) {
        this.id_torcedor = id_torcedor;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setQuantidade_de_camisas(int quantidade_de_camisas) {
        this.quantidade_de_camisas = quantidade_de_camisas;
    }

    public String getId_torcedor() {
        return id_torcedor;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade_de_camisas() {
        return quantidade_de_camisas;
    }
}