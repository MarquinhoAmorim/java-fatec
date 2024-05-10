package biblioteca;


/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aluno // Aluno herda de Pessoa
{
    // variáveis da instância que representam as características do Aluno
    private String nome;
    private String ra;
    
    // Novo atributo inserido devido a associação entre Aluno e Curso
    private Curso curso;        
    
    /**
    * Método Construtor responsável por criar objetos do tipo Aluno
    **/
    public Aluno(String nome, String ra)
    {
        // atribui valores para as variáveis da instância (objeto)
        this.nome = nome;
        this.ra = ra;
    }
    
    /**
    * Método que exibe informações sobre o Aluno
    */
    public void exibeInformacoes( )
    {
        System.out.println("Informações sobre Aluno:");
        System.out.println("Nome: "+nome);
        System.out.println("Ra: "+ra);
        
        // Exibe o nome do curso onde aluno está matriculado
        if (curso == null) System.out.println("Aluno não está matriculado em Curso");
        else System.out.println("Aluno está matriculado no curso " + curso.getNome());
    }
    
    /**
    * Método acessor do atributo nome
    */
    public String getNome()
    {
        return nome;
    }
    
    /**
    * Método que matricula Aluno em Curso
    */
    public void fazMatricula(Curso c) {
        // adiciona referência do objeto do tipo Curso ao atributo curso
        curso = c;
        
        // invoca método auxiliar na classe Curso para adicionar aluno na lista de matriculados do curso
        // this referencia o objeto atual do tipo aluno onde se está executando o método fazMatricula
        c.matricAluno( this );
    }
}
