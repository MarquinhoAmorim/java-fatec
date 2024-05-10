package biblioteca;


public class Banca
{
    // variáveis da instância que representam as características da Banca
    private String data;
    private String parecer;
    // Novo atributo (vetor) inserido devido a agregação entre Banca e Professor
    private Professor[] professores = new Professor[2];
    
    /**
    * Método Construtor responsável por criar objetos do tipo Banca
    */
    public Banca(String data, String parecer)
    {
        // atribui valores para as variáveis da instância (objeto)
        this.data = data;
        this.parecer = parecer;
    }
    
    /**
    * Método que exibe informações sobre a Banca
    */
    public void exibeInformacoes( )
    {
        System.out.println("Informações sobre a Banca:");
        System.out.println("Data: "+data);
        System.out.println("Parecer: "+parecer);
        // Exibe quem são os Professores vinculados a Banca
        if (professores[0] == null) System.out.println("Não existem Professores vinculados à Banca");
        else System.out.println("Os Professores vinculados são: " + professores[0].
        getNome() + " e " + professores[1].getNome() );
    }
    
    /**
    * Método que vincula Professor a Banca
    */
    public void vincularProfessor(Professor p1, Professor p2)
    {
        // vincula Professores nas posicoes do vetor
        professores[0] = p1;
        professores[1] = p2;
    }
    
    /**
    * Método acessor do atributo Professor
    */
    public Professor[] getProfessores()
    {
        return professores;
    }
}
