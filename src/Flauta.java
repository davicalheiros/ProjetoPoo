//Davi Calheiros Quintella Souto

public class Flauta extends Sopro
{

    private String modeloFlauta;

    public Flauta()
    {
        super();
        this.modeloFlauta="Flauta Doce";
    }

    public Flauta(double preco, int quantidade, int codProduto, boolean promocao, String marca, String materialSopro, String afinacao, String modeloFlauta)
    {
        super(preco, quantidade, codProduto, promocao, marca, materialSopro, afinacao);
        this.modeloFlauta = modeloFlauta;
    }

    public String getModeloFlauta()
    {
        return modeloFlauta;
    }

    public void setModeloFlauta(String modeloFlauta)
    {
        this.modeloFlauta = modeloFlauta;
    }
}







