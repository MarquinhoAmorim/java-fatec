
/**
 * Escreva uma descrição da classe Soma aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Soma
{
   public static void main(String[] args) // método que inicia o programa
    {
        // converte os parametros em inteiros e os armazena em a e b
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = a + b; // realiza a soma 
        System.out.println("O resultado da soma é: " + c); // exibe a soma
    }
}
