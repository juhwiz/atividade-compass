import java.util.ArrayList;
import java.util.Scanner;
import java.io.Console;
public class ContaSalario{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Console c = System.console();
        
        int numeroFuncionarios = 0;
        ArrayList<String> nomes = new ArrayList<String>(); 
        ArrayList<Double> salarios = new ArrayList<Double>(); 
        int porcentagem = 0; // Guarda a porcentagem do desconto ou bônus
        ArrayList<Double> bonus = new ArrayList<Double>();
        ArrayList<Double> desconto = new ArrayList<Double>(); 
        ArrayList<Double> salarioLiquido = new ArrayList<Double>();

        System.out.println("Quantos funciónarios seram adicionados?");
        numeroFuncionarios = s.nextInt();
        

        for(int i = 0; i < numeroFuncionarios; i++){
            System.out.println("Digite o nome do funcionário");
            nomes.add(c.readLine());
            
            // System.out.println(nomes);

            System.out.println("Digite o salario desse funcionário");
            salarios.add(s.nextDouble());
            System.out.println("\n");

            // System.out.println(salarios);
            
            if(salarios.get(i) <= 1000.00) {
                
                porcentagem = 20;
                bonus.add((porcentagem * salarios.get(i)) / 100);
                desconto.add(0.0);
                salarioLiquido.add(salarios.get(i) + bonus.get(i));
            
            }
            if(salarios.get(i) > 1000.00 && salarios.get(i) <= 2000.00){
            
                porcentagem = 10;
                bonus.add((porcentagem * salarios.get(i)) / 100);
                desconto.add(0.0);
                salarioLiquido.add(salarios.get(i) + bonus.get(i));
            }
            if(salarios.get(i) > 2000.00){ 
             
                porcentagem = 10;
                desconto.add((porcentagem * salarios.get(i)) / 100);
                bonus.add(0.0);
                salarioLiquido.add(salarios.get(i) - desconto.get(i));
            }

        }

        for(int i = 0; i < numeroFuncionarios; i++){
            if(bonus.get(i).equals(0.0)){
                System.out.println("\nFuncionário(a) " + nomes.get(i) + 
                               "\nSalário " + salarios.get(i) + 
                               "\nDesconto " + desconto.get(i) + 
                               "\nSalário Líquido " + salarioLiquido.get(i) + "\n\n");
            } else {
                System.out.println("\nFuncionário(a) " + nomes.get(i) + 
                               "\nSalário " + salarios.get(i) + 
                               "\nBonus " + bonus.get(i) + 
                               "\nSalário Líquido " + salarioLiquido.get(i) + "\n\n");
            }
            
        }         
        





    }
}