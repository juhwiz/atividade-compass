import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.Console;

public class Funcionario {
    
    private ArrayList<String> nomes = new ArrayList<String>(); 
    private ArrayList<Double> salarios = new ArrayList<Double>(); 
    private int porcentagem = 0; // Guarda a porcentagem do desconto ou bônus
    private ArrayList<Double> bonus = new ArrayList<Double>();
    private ArrayList<Double> desconto = new ArrayList<Double>(); 
    private ArrayList<Double> salarioLiquido = new ArrayList<Double>();
    

    Scanner s = new Scanner(System.in);
    Console c = System.console();

    public void setDados(int i){

        System.out.println("Digite o nome do funcionário");
        this.nomes.add(c.readLine());
        
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

    public List<String> getNome(){

        return this.nomes;
    } 

    public List<Double> getSalario(){
        return this.salarios;
    }

    public List<Double> getBonus(){
        return this.bonus;
    }

    public List<Double> getDesconto(){
        return this.desconto;
    }

    public List<Double> getSalarioLiquido(){
        return this.salarioLiquido;
    }
}
