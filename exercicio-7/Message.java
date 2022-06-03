import java.io.Console;
import java.util.Calendar;

public class Message {
    public static void main(String[] args) {
        Console c = System.console();
        User usuario = new User();

        Calendar c1 = Calendar.getInstance();
        int hora = c1.get(Calendar.HOUR_OF_DAY);
        

        System.out.println("Digite seu usuário: ");
        String user = c.readLine();

        System.out.println("Digite sua senha: ");
        String senha = c.readLine();

        Boolean validacao = usuario.comparaUsuario(user, senha);
        
        if(validacao == true){

            System.out.println("Login certo \n");
           if(hora >= 6 && hora < 12){
                System.out.println("Bom dia, você se logou no nosso sistema.");
            }
            if(hora >= 12 && hora < 18){
                System.out.println("Boa tarde, você se logou ao nosso sistema.");
            }
            if(hora >= 18 && hora <= 24 ){
                System.out.println("Boa noite, você se logou ao nosso sistema.");
            }
            if(hora >= 0 && hora < 6){
                System.out.println("Boa madrugada, você se logou ao nosso sistema.");
            }
        }
        else{
            System.out.println("Usuário e/ou senha incorretos.");
        }


    }
}
