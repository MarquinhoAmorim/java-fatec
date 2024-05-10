package biblioteca;


public class Professor  // Professor herda de Pessoa
{
   // variáveis da instância que representam as características do Professor
    private String nome;
    private String titulacao;
    private String email;
    
    /**
    * Método Construtor responsável por criar objetos do tipo Professor
    */
    public Professor(String nome, String titulacao, String email)
    {
        // atribui valores para as variáveis da instância (objeto)
        this.nome = nome;
        this.titulacao = titulacao;
        this.email = email;
    }
    
    /**
    * Método que exibe informações sobre o Professor
    */
    public void exibeInformacoes( )
    {
        System.out.println("Informações sobre o Professor:");
        System.out.println("Nome: "+nome);
        System.out.println("Titulação: "+titulacao);
        System.out.println("Email: "+email);
    }
    
    /**
    * Método acessor do atributo nome
    */
    public String getNome() {
        return nome;
    }
}
