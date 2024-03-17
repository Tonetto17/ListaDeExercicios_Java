package atividades_java;
import java.util.Scanner;

public class atv4{
    public static void main(String[] args){
        int soma=0;
        System.out.print("Programa que mostra a soma de 20 números: ");
        for(int i=0; i<=20; i++){
            if(i%2==0){
                System.out.print(i+"+");
                soma+=i;
            }
        }
        System.out.print("="+soma);
    }
}