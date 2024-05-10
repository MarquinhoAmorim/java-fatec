package biblioteca;


public class Coordenador extends Professor
{
    // variáveis da instância que representam as características do Coordenador
    private String ramal;
    private String cargaHoraria;
    
    /**
    * Método Construtor responsável por criar objetos do tipo Coordenador
    */
    public Coordenador(String nome, String sigla, String email, String ramal, String cargaHoraria)
    {
        // super é o sinônimo para o método construtor da superclasse
        super(nome, sigla, email);
        // atribui valores para as variáveis da instância (objeto)
        this.ramal = ramal;
        this.cargaHoraria = cargaHoraria;
    }
    
    /**
    * Método que exibe informações sobre o Coordenador
    */
    public void exibeInformacoes()
    {
        // super é referência para a superclasse
        super.exibeInformacoes();
        System.out.println("Informações sobre Coordenador:");
        System.out.println("Ramal: "+ramal);
        System.out.println("Carga Horária: "+cargaHoraria);
    }
}
