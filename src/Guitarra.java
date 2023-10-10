//Davi Calheiros Quintella Souto

public class Guitarra extends Instrumento
{
    private String modeloGuitarra;
    private Corda corda;

    public Guitarra()
    {
        super();
        this.modeloGuitarra = "Les Paul";
        this.corda=new Corda();
    }

    public Guitarra(double preco, int quantidade, int codProduto, boolean promocao, String marca, String modeloGuitarra)
    {
        super(preco, quantidade, codProduto, promocao, marca);
        this.modeloGuitarra = modeloGuitarra;
        this.corda=new Corda();

    }

    public String getModeloGuitarra()
    {
        return modeloGuitarra;
    }

    public void setModeloGuitarra(String modeloGuitarra)
    {
        this.modeloGuitarra = modeloGuitarra;
    }


}
