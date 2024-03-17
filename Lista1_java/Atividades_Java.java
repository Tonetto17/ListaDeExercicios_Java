package atividades_java;
public class Atividades_Java{
    public static void main(String[] args){
        int total=0;
        System.out.print("Mostrando os numeros pares de 100 até 500");
        for(int i=100; i<=500;i++ ){
            if(i%2==0){
                total+=i;
            }
        }
        System.out.print(total);
    }
}
