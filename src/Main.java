import java.util.Scanner;

public class Main {
    public static void main(String[]args){

       // Crie um programa para que receba do usuário o salário e vale-refeição e exiba no console;

        Scanner scn = new Scanner(System.in);

        double salario;
        double valeRefeicao;

        System.out.print("informe o seu salario\n");
        salario = scn.nextDouble();

        System.out.print("informe o seu vale refeicao \n");
        valeRefeicao = scn.nextDouble();

        System.out.println(salario);
        System.out.println(valeRefeicao);



    }
}
