package template;

import nullObject.NaoFazNada;
import strategy.PosProcessador;

/**
 *
 * @author AndersonLuis
 */
public abstract class Relatorio
{
    private PosProcessador posProcessador = new NaoFazNada();
    
    public void setPosProcessador(PosProcessador posProcessador)
    {
        this.posProcessador = posProcessador;
    }
    
    public void gerarRelatorio()
    {
        buscarDados();
        calcular();
        exportar();
        posProcessar();
    }
    
    private void buscarDados()
    {
        System.out.println("Buscando dados ...");
    }
    
    private void calcular()
    {
        System.out.println("Calculando ...");
    }
    
    protected abstract void exportar();
    
    private void posProcessar()
    {
        posProcessador.posProcessar();
    }
}