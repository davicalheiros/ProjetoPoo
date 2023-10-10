//Davi Calheiros Quintella Souto

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura
{
    public String entDados(String rotulo)
    {

        System.out.println(rotulo);

        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(teclado);

        String ret ="";

        try
        {
            ret = buff.readLine();
        }
        catch(IOException ioe){
            System.out.println("\nERRO de sistema: RAM - TECLADO");
        }

        return ret;
    }

    public void clearConsole()
    {
        try
        {
            Runtime.getRuntime().exec("cls");
        }

        catch (final Exception e)
        {
            System.out.println("Erro");
        }
    }
}