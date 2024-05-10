
/**
 * Escreva uma descrição da classe Banca aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Banca 
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    String data;
    boolean parecer;
    
    public Banca(String data, boolean paracer)
    {
        // Atribui valores para as variáveis da instancia (objeto)
        this.data = data;
        this.parecer = parecer;
    }

    /*
     * Método que exibe informações sobre a Casa
     */
    public void exibeInformacoes()
    {
        System.out.println("Banca:");
        System.out.println("Data: " + data);
        System.out.println("Presença: " + parecer);
    }
}
