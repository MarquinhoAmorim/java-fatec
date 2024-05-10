
/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
class Aluno 
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;
    String nome,ra; // Atributos

    /**
     * Construtor para objetos da classe Aluno
     */
    public Aluno(String nome, String codigo) //Método construtor com dois parâmetros
    {
        this.nome = nome; // Atribui o valor do parâmetro nome à variável nome.
        ra = codigo; // atribui o valor do parâmetro à variável ra
    }
    
    void respondeChamada() // Método sem parâmetro e sem retorno (void)
    {
        System.out.println(nome + "está presente!"); // Mostra mensagem
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public int sampleMethod(int y)
    {
        // escreva seu código aqui
        return x + y;
    }
}
