package bridgepattern;

import strategy.Crypt;
import strategy.NoCrypt;
import template.Relatorio;
import template.RelatorioPDF;
import template.RelatorioXLS;

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
        
        relatorio = new RelatorioXLS();
        relatorio.setPosProcessador(new NoCrypt());
        relatorio.gerarRelatorio();
        
        relatorio = new RelatorioPDF();
        relatorio.gerarRelatorio();
    }    
}