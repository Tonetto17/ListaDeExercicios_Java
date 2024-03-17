package atividades_java;
import java.util.Scanner;
public class atv7{
    public static void main(String[] args){
        Scanner tec= new Scanner(System.in);
        int soma=0;
        int n=0;
        do{
            System.out.print("Digite outro número: ");
            n=tec.nextInt();
            if(n%2==0){
                soma+=n;
            }           
        }while(n>=0);
        System.out.println();
        System.out.print("A soma dos números pares é: "+ soma);
        
    }
}