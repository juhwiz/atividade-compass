public class User {
    private String user = "Mario";
    private String password = "Yoda";

    public Boolean comparaUsuario(String user, String senha){

        if(this.user.equals(user) && this.password.equals(senha) ){
            return true;
        } else {
            return false;
        }
        
    }

}
