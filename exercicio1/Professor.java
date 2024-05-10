
/**
 * Escreva uma descrição da classe Professor aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Professor 
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    String nome, email;
    int titulacao;
    
    public Professor(String nome, String email, int titulacao)
    {
        // Atribui valores para as variáveis da instancia (objeto)
        this.nome = nome;
        this.email = email;
        this.titulacao = titulacao;
    }

    /*
     * Método que exibe informações sobre a Casa
     */
    public void exibeInformacoes()
    {
        System.out.println("Professor:");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Titulação: " + titulacao);
    }
}
