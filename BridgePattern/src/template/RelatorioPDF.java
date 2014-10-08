package template;

/**
 *
 * @author AndersonLuis
 */
public class RelatorioPDF extends Relatorio
{
    @Override
    protected void exportar()
    {
        System.out.println("Exportar para PDF");
    }
}