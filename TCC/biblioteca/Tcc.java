package biblioteca;



public class Tcc
{
   // variáveis da instância que representam as características do Tcc
    private String titulo;
    private int ano;
    private String situacao;
    private float nota;
    
    // Novo atributo inserido devido a agregação entre Tcc e Aluno
    private Aluno aluno;
    
    // Novo atributo inserido devido a agregação entre Tcc e Banca
    private Banca banca;
    
    /**
    * Método Construtor responsável por criar objetos do tipo Tcc
    */
    public Tcc(String titulo, int ano, String situacao, float nota)
    {
        // atribui valores para as variáveis da instância (objeto)
        this.titulo = titulo;
        this.ano = ano;
        this.situacao = situacao;
        this.nota = nota;
    }
    
    /**
    * Método que exibe informações sobre o Tcc
    */
    public void exibeInformacoes( )
    {
        System.out.println("Informações sobre Tcc:");
        System.out.println("Título: "+titulo);
        System.out.println("Ano: "+ano);
        System.out.println("Situação: "+situacao);
        System.out.println("Nota: "+nota);
        
        // Exibe quem é o Aluno responsavel pelo Tcc
        if (aluno == null) System.out.println("Tcc não tem aluno vinculado");
            else System.out.println("Este Tcc é de " + aluno.getNome());
            
        // Exibe quem é o Aluno responsavel pelo Tcc
        if (banca == null) System.out.println("Tcc não possui banca vinculada");
            else {
                Professor[] profs = banca.getProfessores();
                if (profs[0] == null) System.out.println("Tcc possui banca porém semprofessores vinculados");
                else System.out.println("Os Professores da Banca são: " + profs[0].getNome() + " e " + profs[1].getNome() );
            }
    }
    /**
    * Método que vincula o Aluno ao Tcc
    */
    public void vincularAluno(Aluno a)
    {
    aluno = a;
    }
    /**
    * Método que vincula a Banca ao Tcc
    */
    public void vincularBanca(Banca b)
    {
    banca = b;
    }
}
