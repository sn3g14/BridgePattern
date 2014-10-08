package strategy;

/**
 *
 * @author AndersonLuis
 */
public class Compactador implements PosProcessador
{
    @Override
    public void posProcessar() 
    {
        System.out.println("Posprocessamento compactado");
    }
}