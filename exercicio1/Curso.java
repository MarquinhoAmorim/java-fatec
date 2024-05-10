
/**
 * Escreva uma descrição da classe Curso aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Curso 
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    String nome, sigla, area;
    
    public Curso(String nome, String sigla, String area)
    {
        // Atribui valores para as variáveis da instancia (objeto)
        this.nome = nome;
        this.sigla = sigla;
        this.area = area;
    }

    /*
     * Método que exibe informações sobre a Casa
     */
    public void exibeInformacoes()
    {
        System.out.println("Este curso possui:");
        System.out.println("Nome: " + nome);
        System.out.println("Sigla: " + sigla);
        System.out.println("Area: " + area);
    }
}
