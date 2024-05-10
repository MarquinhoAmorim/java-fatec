
/**
 * Escreva uma descrição da classe Casa aqui.
 * 
 * @author (Marco Amorim) 
 * @version (0.0.1)
 */
public class Casa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int sala, quarto, cozinha, banheiro;

    /**
     * Construtor para objetos da classe Casa
     */
    public Casa(int sala, int quarto, int cozinha, int banheiro)
    {
        // Atribui valores para as variáveis da instancia (objeto)
        this.sala = sala;
        this.quarto = quarto;
        this.cozinha = cozinha;
        this.banheiro = banheiro;
    }

    /*
     * Método que exibe informações sobre a Casa
     */
    public void exibeInformacoes()
    {
        System.out.println("Essa casa possui:");
        System.out.println("Quarto: " + quarto);
        System.out.println("Sala: " + sala);
        System.out.println("Cozinha: " + cozinha);
        System.out.println("Banheiro: " + banheiro);
    }
}
