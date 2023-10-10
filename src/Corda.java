//Davi Calheiros Quintella Souto
public class Corda
{
    private int qtdCordas;
    private String tipoCorda;

    public Corda()
    {
        this.qtdCordas=6;
        this.tipoCorda="Nylon";
    }

    public Corda(int qtdCordas, String tipoCorda)
    {
        this.qtdCordas = qtdCordas;
        this.tipoCorda = tipoCorda;
    }

    public int getQtdCordas()
    {
        return qtdCordas;
    }

    public void setQtdCordas(int qtdCordas)
    {
        this.qtdCordas = qtdCordas;
    }

    public String getTipoCorda()
    {
        return tipoCorda;
    }

    public void setTipoCorda(String tipoCorda)
    {
        this.tipoCorda = tipoCorda;
    }
}
