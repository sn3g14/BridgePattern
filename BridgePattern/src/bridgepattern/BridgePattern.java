package bridgepattern;

import strategy.Crypt;
import template.Relatorio;
import template.RelatorioPDF;

/**
 *
 * @author AndersonLuis
 */
public class BridgePattern
{
    public static void main(String[] args)
    {
        Relatorio relatorio = new RelatorioPDF();
        relatorio.setPosProcessador(new Crypt());
        
        relatorio.gerarRelatorio();
        relatorio.posProcessar();
    }    
}