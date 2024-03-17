package atividades_java;
import java.util.Scanner;
import java.util.Random;
public class atv9{
    public static void main(String[] args){
        Scanner tec= new Scanner(System.in);
        Random rand= new Random();
        int numAleatorio= rand.nextInt(10);
        int n=0;
        do{
           System.out.print("Digite um número: ");
           n=tec.nextInt();
        }while(n!=numAleatorio);
        System.out.print("Você acertou o número!!");
        System.out.print("O número é: "+ numAleatorio);
    }
}
