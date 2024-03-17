package atividades_java;
import java.util.Scanner;
public class atv10{
    public static void main(String[] args){
        Scanner tec= new Scanner(System.in);
        String senha;
        boolean senhaValida = false;
        System.out.print("Crie uma senha: ");
        String senha1=tec. nextLine();

        do{
        System.out.print("Digite a senha novamente: ");
        senha=tec.nextLine();
        if(senha.equals(senha1)){
            senhaValida=true;
        }
                    
                    
        }while(!senhaValida);
        
        System.out.print("Seja bem vindo");
        
    }
}
