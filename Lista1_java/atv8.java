package atividades_java;
import java.util.Scanner;
public class atv8{
    public static void main(String[] args){
        Scanner tec= new Scanner(System.in);
        int resp=1, cont=1, tab=0, n=0;
        while(resp==1){
            System.out.println("Digite o número para a tabuada: ");
            n= tec.nextInt();
            while(cont<=10){
                tab=n*cont;
                System.out.println(n+"X"+cont+"="+tab);
                cont++;
            }
            cont=1;
            System.out.println("Deseja realizar a tabuada novamente? 1-Sim/ 2-Não: ");
            resp= tec.nextInt(); 
        }
        System.out.println();
        System.out.println("Fim do programa");
        
    }
}
