
/**
 * Escreva uma descrição da classe ExecutaAluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
class ExecutaAluno
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;
    

    public static void main(String args[])
    {
        // Váriavel fulano é do tipo "Aluno"
        Aluno fulano;
        // Cria objeto via método construtor e associa o objeto criado à 
        // variável fulano
        fulano = new Aluno("Fulano de Tal", "1234567");
        //  Mostra os valores que estão armazenados no objeto fulano
        // fulano.nome acessa a variável nome do objeto fulano
        // fulano.ra acessa a variável ra do objeto fulano
        System.out.println("Nome = " + fulano.nome +" - RA = " + fulano.ra);
    }
}
