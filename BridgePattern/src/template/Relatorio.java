package template;

import strategy.PosProcessador;

/**
 *
 * @author AndersonLuis
 */
public abstract class Relatorio
{
    private PosProcessador posProcessador;
    
    public void setPosProcessador(PosProcessador posProcessador)
    {
        this.posProcessador = posProcessador;
    }
    
    public void gerarRelatorio()
    {
        buscarDados();
        calcular();
        exportar();
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
    
    public void posProcessar()
    {
        posProcessador.posProcessar();
    }
}