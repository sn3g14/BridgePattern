package strategy;

/**
 *
 * @author AndersonLuis
 */
public class NoCrypt implements PosProcessador
{
    @Override
    public void posProcessar() 
    {
        System.out.println("Posprocessamento não criptografado");
    }
}