//Davi Calheiros Quintella Souto

public class Violao extends Instrumento
{
    private String modeloViolao;

    public Violao()
    {
        super();
        this.modeloViolao="Folk";
    }

    public Violao(double preco, int quantidade, int codProduto, boolean promocao, String marca, String modeloViolao)
    {
        super(preco, quantidade, codProduto, promocao, marca);
        this.modeloViolao = modeloViolao;
    }

    public String getModeloViolao()
    {
        return modeloViolao;
    }

    public void setModeloViolao(String modeloViolao)
    {
        this.modeloViolao = modeloViolao;
    }
}
