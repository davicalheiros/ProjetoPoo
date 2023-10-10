//Davi Calheiros Quintella Souto

public class Saxofone extends Sopro
{
    private String modeloSaxsofone;
    public Saxofone()
    {
        super();
        this.modeloSaxsofone = "Baritono";
    }

    public Saxofone(double preco, int quantidade , int codProduto, boolean promocao, String marca, String materialSopro, String afinacao, String modeloSaxsofone)
    {
        super(preco, quantidade, codProduto, promocao, marca, materialSopro, afinacao);
        this.modeloSaxsofone = modeloSaxsofone;
    }

    public String getModeloSaxsofone()
    {
        return modeloSaxsofone;
    }

    public void setModeloSaxsofone(String modeloSaxsofone)
    {
        this.modeloSaxsofone = modeloSaxsofone;
    }
}
