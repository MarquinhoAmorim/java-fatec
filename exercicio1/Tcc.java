
/**
 * Escreva uma descrição da classe Tcc aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Tcc 
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    String titulo;
    int ano;
    float notas;
    String situacao;
    
    public Tcc(String titulo, int ano, float notas, String situacao)
    {
        // Atribui valores para as variáveis da instancia (objeto)
        this.titulo = titulo;
        this.ano = ano;
        this.notas = notas;
        this.situacao = situacao;
    }

    /*
     * Método que exibe informações sobre a Casa
     */
    public void exibeInformacoes()
    {
        System.out.println("Tcc:");
        System.out.println("Titulo: " + titulo);
        System.out.println("Ano: " + ano);
        System.out.println("Notas: " + notas);
        System.out.println("Situacao: " + situacao);
    }
    
}
