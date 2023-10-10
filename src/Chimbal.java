//Davi Calheiros Quintella Souto 2267845

public class Chimbal extends Percussao
{
    private String modeloChimbal;

    public Chimbal ()
    {
        super();
        this.modeloChimbal="HiHat";
    }

    public Chimbal(String tipoPercussao, double peso, String modeloChimbal) {
        super(tipoPercussao, peso);
        this.modeloChimbal=modeloChimbal;
    }

    public String getModeloChimbal()
    {
        return modeloChimbal;
    }

    public void setModeloChimbal(String modeloChimbal)
    {
        this.modeloChimbal = modeloChimbal;
    }
}
