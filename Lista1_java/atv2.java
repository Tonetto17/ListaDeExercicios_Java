
package atividades_java;
import java.util.Scanner;
public class atv2{
    public static void main(String[] args){
        Scanner tec= new Scanner(System.in);
        int idade1=0, idade2=0, idade3=0, idade4=0, idade5=0;
        System.out.print("Digite a quantidade de idade: ");
        int quant=tec.nextInt();
        for(int i=1; i<=quant; i++){
            System.out.print("Digite a idade: ");
            int idade=tec.nextInt();
            if(idade<0){
                System.out.print("Erro");
            }else if(idade>=0 && idade<=15){
               idade1+=1;
            }else if(idade>=16 && idade<=30){
                idade2+=1;
            }else if(idade>=31 && idade<=45){
                idade3+=1;
            }else if(idade>=46 && idade<=60){
                idade4+=1;
            }else if(idade>60){
                idade5+=1;
            }
        }
        System.out.println();
        System.out.println("Idade de o a 15: "+ idade1);
        System.out.println("Idade de 16 a 30: "+ idade2);
        System.out.println("Idade de 31 a 45: "+ idade3);
        System.out.println("Idade de 46 a 60: "+ idade4);
        System.out.println("Idade de 60 ou mais: "+ idade5);
        
        
    }
}
