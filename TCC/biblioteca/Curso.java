package biblioteca;
import java.util.ArrayList; // importação da classe ArrayList da biblioteca util do Java

public class Curso
{
    // variáveis da instância que representam as características do Curso
    private String nome;
    private String sigla;
    private String area;
    
    // Novo atributo inserido devido à agregação entre Curso e Coordenador
    private Coordenador coord;
    
    // Novo atributo inserido devido a associação entre Aluno e Curso
    private ArrayList alunos = new ArrayList(); 
    
    /**
    * Método Construtor responsável por criar objetos do tipo Curso
    */
    public Curso(String nome, String sigla, String area)
    {
        // atribui valores para as variáveis da instância (objeto)
        this.nome = nome;
        this.sigla = sigla;
        this.area = area;
    }
    
    /**
    * Método que exibe informações sobre o Curso
    */
    public void exibeInformacoes()
    {
        System.out.println("Informações sobre Curso:");
        System.out.println("Nome: "+nome);
        System.out.println("Sigla: "+sigla);
        System.out.println("Area: "+area);
        // Exibe informacoes sobre o Coordenador do Curso
        if (coord == null) System.out.println("Curso não tem coordenador");
            else System.out.println("Curso tem coordenador e seu nome é " + coord.getNome());
            
        // Exibe a quantidade de alunos matriculados
        System.out.println("Quantidade de Alunos matriculados: " + alunos.size());
    }
    
    /**
    * Método que troca o Coordenador de Curso
    */
    public void trocarCoordenador(Coordenador c)
    {
        coord = c;
    }
    
    /**
    * Método que matricula Aluno no Curso adicionando um objeto do tipo Aluno no atributo
    aluno
    */
    public void matricAluno(Aluno a)
    {
        if (a != null) alunos.add(a); // adiciona se objeto não for null
    }
    
    /**
    * Método acessor do atributo nome do Curso
    */
    public String getNome()
    {
        return nome;
    }
    
    /**
    * Método que lista os Alunos matriculados no Curso
    */
   public void listarAlunosMatriculados()
    {
        // verifica se existem alunos matriculados
        if (alunos.size() == 0) System.out.println("Não existem alunos matriculados no curso");
        else {
            System.out.println("Lista de alunos matriculados no curso " + nome);
    
            // percorre toda a lista de alunos matriculados
            for(int aux = 0; aux < alunos.size(); aux++)
            {
                // pega o proximo objeto da lista de alunos para imprimir seu nome
                Aluno aluno = (Aluno)alunos.get(aux);
                System.out.println(" - " + aluno.getNome());
            }
        }
    }
}
