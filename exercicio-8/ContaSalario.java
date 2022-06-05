import java.util.Scanner;
public class ContaSalario{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        int numeroFuncionarios = 0;

        System.out.println("Quantos funciónarios seram adicionados?");
        numeroFuncionarios = s.nextInt();
        

        for(int i = 0; i < numeroFuncionarios; i++){
            
            funcionario.setDados(i);

        }

        for(int i = 0; i < numeroFuncionarios; i++){
            if(funcionario.getBonus().get(i).equals(0.0)){
                System.out.println("\nFuncionário(a) " + funcionario.getNome().get(i) + 
                               "\nSalário " + funcionario.getSalario().get(i) + 
                               "\nDesconto " + funcionario.getDesconto().get(i) + 
                               "\nSalário Líquido " + funcionario.getSalarioLiquido().get(i) + "\n\n");
            } else {
                System.out.println("\nFuncionário(a) " + funcionario.getNome().get(i) + 
                               "\nSalário " + funcionario.getSalario().get(i) + 
                               "\nBonus " + funcionario.getBonus().get(i) + 
                               "\nSalário Líquido " + funcionario.getSalarioLiquido().get(i) + "\n\n");
            }
            
        }         
        

    }
}