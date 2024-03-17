
package atividades_java;
import java.util.Scanner;
public class atv5{
    public static void main(String[] args){
        Scanner tec=new Scanner(System.in);
        int cont=0;
        System.out.print("Digite um número: ");
        int n= tec.nextInt();
        while(cont<=n){
            System.out.print(cont+" ");
            cont+=1;
        }
    }
}

