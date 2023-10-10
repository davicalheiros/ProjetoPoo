public abstract class Instrumento {
    private double preco;
    private int quantidade;
    private int codProduto;
    private boolean promocao;
    private String marca;

    public Instrumento()
    {
        this.preco = 1000;
        this.quantidade = 2;
        this.codProduto = 12345678;
        this.promocao = false;
        this.marca = "gibson";
    }
    public Instrumento(double preco, int quantidade, int codProduto, boolean promocao, String marca)
    {
        this.preco = preco;
        this.quantidade = quantidade;
        this.codProduto = codProduto;
        this.promocao = promocao;
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
