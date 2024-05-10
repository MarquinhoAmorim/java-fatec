package biblioteca;


public class Executa
{
    // classe de teste do projeto tcc
    public static void main(String args[]) // método que inicia o teste
    {
        Aluno jose; // variável jose é do tipo Aluno
        Curso computacao; // variável computacao é do tipo Curso
        Coordenador carlos; // variável carlos é do tipo Coordenador
        Tcc trabalho; // variável trabalho é do tipo Tcc
        Banca banca; // variável banca é do tipo Banca
        Professor paulo; // variável paulo é do tipo Professor
        
        try {
        // cria objeto usando o método construtor e
        // associa o objeto criado a variável do tipo correspondente
        jose = new Aluno("Jose","111111");
        jose.exibeInformacoes(); // invoca um método sobre o objeto
        
        computacao = new Curso("Computação","COMP","exatas");
        computacao.exibeInformacoes(); // invoca um método sobre o objeto
        
        carlos = new Coordenador("Carlos","Doutorado","carlos@email.com","123","40");
        carlos.exibeInformacoes(); // invoca um método sobre o objeto
        
        trabalho = new Tcc("Orientação a Objetos", 2010, "Aprovado", 9);
        trabalho.exibeInformacoes(); // invoca um método sobre o objeto
        
        banca = new Banca("01/06/2010","Favorável");
        banca.exibeInformacoes(); // invoca um método sobre o objeto
        
        // Vincula uma banca ao tcc (Agregação)
        trabalho.vincularBanca( banca );
        trabalho.exibeInformacoes();
        
        paulo = new Professor("Paulo","Mestrado","paulo@email.com");
        paulo.exibeInformacoes(); // invoca um método sobre o objeto
        
        // Vincula um coordenador ao curso (Agregação)
        computacao.trocarCoordenador( carlos );
        computacao.exibeInformacoes(); // invoca um método sobre o objeto
        
        // Vincula um aluno ao tcc (Agregação)
        trabalho.vincularAluno( jose );
        trabalho.exibeInformacoes(); // invoca um método sobre o objeto
        
        // Vincula dois professores à Banca (Agregação)
        banca.vincularProfessor( paulo, carlos );
        banca.exibeInformacoes();
        
        // Exibe informações sobre o tcc
        trabalho.exibeInformacoes();
        
        // Matricula aluno jose no curso computacao
        jose.fazMatricula( computacao );
        jose.exibeInformacoes(); // invoca um método sobre o objeto
        
        // lista nomes de alunos matriculados no curso computacao
        computacao.listarAlunosMatriculados();
        
        
        } catch(Exception e) {
            // inserir aqui o tratamento das exceções
            // exibe a mensagem correspondente à exceção ocorrida
            System.out.println( e.getMessage() );
            
        } finally {
            // inserir aqui as últimas instruções a serem executadas após o bloco try
            // finaliza os objetos para liberar espaço de memória para outras alocações
            jose = null; // finaliza objeto do tipo Aluno
            computacao = null; // finaliza objeto do tipo Curso
            carlos = null; // finaliza objeto do tipo Coordenador
            trabalho = null; // finaliza objeto do tipo Tcc
            banca = null; // finaliza objeto do tipo Banca
            paulo = null; // finaliza objeto do tipo Professor
        }
    }
}
