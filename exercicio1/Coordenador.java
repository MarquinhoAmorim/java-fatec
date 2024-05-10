
/**
 * Escreva uma descrição da classe Coordenador aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Coordenador
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    int canal;
    float cargaHoraria;
    
    public Coordenador(int canal, float cargaHoraria)
    {
        // Atribui valores para as variáveis da instancia (objeto)
        this.canal = canal;
        this.cargaHoraria = cargaHoraria;
    }

    /*
     * Método que exibe informações sobre a Casa
     */
    public void exibeInformacoes()
    {
        System.out.println("Coordenador:");
        System.out.println("Canal: " + canal);
        System.out.println("Carga Horaria: " + cargaHoraria);
    }
}
