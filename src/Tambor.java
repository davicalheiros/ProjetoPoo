//Davi Calheiros Quintella Souto

public class Tambor extends Percussao
{
    private String modeloTambor;

    public Tambor ()
    {
        super();
        this.modeloTambor="Caixa";
    }

    public Tambor(String tipoPercussao, double peso, String modeloTambor)
    {
        super(tipoPercussao, peso);
        this.modeloTambor = modeloTambor;
    }

    public String getModeloTambor()
    {
        return modeloTambor;
    }

    public void setModeloTambor(String modeloTambor)
    {
        this.modeloTambor = modeloTambor;
    }
}
