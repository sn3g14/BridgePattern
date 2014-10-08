package template;

/**
 *
 * @author AndersonLuis
 */
public class RelatorioXLS extends Relatorio
{
    @Override
    protected void exportar()
    {
        System.out.println("Exportar para XLS");
    }
}