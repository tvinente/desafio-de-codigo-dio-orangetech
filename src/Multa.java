// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   

import java.util.Scanner; 

public class Multa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        
        // TODO: Crie a condição necessária para verificar se o motorista, de acordo com a entrada, foi multado ou não.

        System.out.print("Velocidade: ");
        int velocidadeAtual = leitor.nextInt();
     
        if (velocidadeAtual <= 60){
            System.out.println( "Nao foi multado");
            
        } else {
            System.out.println( "Foi multado");
        }
            


           





        leitor.close();
    }
    
}
