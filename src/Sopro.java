//Davi Calheiros Quintella Souto

public class Sopro extends Instrumento
{
    private String materialSopro;
    private String afinacao;

    public Sopro()
    {
        super();
        this.materialSopro = "materialSopro";
        this.afinacao = "afinacao";
    }

    public Sopro(double preco, int quantidade , int codProduto, boolean promocao, String marca, String materialSopro, String afinacao)
    {
        super(preco,  quantidade,  codProduto,  promocao,  marca);
        this.materialSopro = materialSopro;
        this.afinacao = afinacao;
    }

    public String getMaterialSopro()
    {
        return materialSopro;
    }

    public void setMaterialSopro(String materialSopro)
    {
        this.materialSopro = materialSopro;
    }

    public String getAfinacao()
    {
        return afinacao;
    }

    public void setAfinacao(String afinacao)
    {
        this.afinacao = afinacao;
    }
}
