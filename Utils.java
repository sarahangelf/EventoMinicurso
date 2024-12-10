package brasil.sousa.ifpb;

public class Utils {

    public static boolean verificarEmail(String email){

        if(email.contains("@academico.edu.br")){
            return true;
        }else{
            return false;
        }
    }
}
