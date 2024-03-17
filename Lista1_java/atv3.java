package atividades_java;
import java.util.Scanner;
public class atv3{
    public static void main(String[] args){
        Scanner tec= new Scanner(System.in);
        int soma=0;
        System.out.print("Digite o primeiro número: ");
        int num1= tec.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2=tec.nextInt();
        for(int i=num1; i<=num2; i++){
            System.out.print(i+ " ");
            soma+=i;
            if(i==num2){
                System.out.print("="+ soma);
            }
        }

        
        
    }
}