
/**
 * Escreva uma descrição da classe notas aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class notas
{
   public static void main(int[] notas)
   {
        double media, a = 0;
        int i = 0;
        
        for(i=0; i < 4;i++){
           a += notas[i];
        }
        
        media = a/i;
        
        if(media <= 4){
            System.out.println("Media: "+ media + " Reprovado");
        } else if(media <= 6){
            System.out.println("Media: "+ media + " DP");
        } else {
            System.out.println("Media: "+ media + " Aprovado");
        }
        
        
    }
}
