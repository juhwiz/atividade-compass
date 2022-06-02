import java.lang.reflect.Array;
import java.io.IOException;
import java.io.Console;

public class quiz{
    public static void main(String[] args) throws IOException, InterruptedException{
        
        String[] perguntas = {"Quanto é 7*7?", 
                              "Quanto é 16/2", 
                              "Quanto é o valor de pi?", 
                              "Qual é os 3 primeiros números da sequencia de Fibonacci?", 
                              "Qual é o nome do cachorro da Yasmin?"};
        String[] respostas = {"49", "8", "3,14", "1, 1, 2", "Thor"};
        int acertos = 0;
        int erros = 0;
        
        Console c = System.console();

        // Perguntar o nome
        System.out.println("Qual é o seu nome, jogador?");
        String nome = c.readLine();

        //For para perguntas
        for(int i = 0; i < perguntas.length; i++){
            System.out.println(perguntas[i]);
            String usuarioResposta = c.readLine();

            if(usuarioResposta.equals(respostas[i])){
                acertos += 1;
                System.out.println("Você acertou!\n");
            }
            else{
                erros += 1;
                System.out.println("Você errou...\n");
            }

        }

        System.out.println("\nUsuário " + nome + "\nAcertos: "+ acertos + "\nErros: " +  erros + "\n\nGood Game\n");


    }
}