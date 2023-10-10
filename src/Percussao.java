//Davi Calheiros Quintella Souto

public class Percussao
{
    private String tipoPercussao;
    private double peso;

    public Percussao()
    {
        super();
        this.tipoPercussao="Acustico";
        this.peso = 10;
    }

    public Percussao(String tipoPercussao, double peso)
    {
        this.tipoPercussao = tipoPercussao;
        this.peso = peso;
    }

    public String getTipoPercussao()
    {
        return tipoPercussao;
    }

    public void setTipoPercussao(String tipoPercussao)
    {
        this.tipoPercussao = tipoPercussao;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }
}
