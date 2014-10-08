package strategy;

/**
 *
 * @author AndersonLuis
 */
public class Crypt implements PosProcessador
{
    @Override
    public void posProcessar()
    {
        System.out.println("Posprocessamento criptografado");
    }
}