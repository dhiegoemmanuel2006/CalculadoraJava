package dhiego.AppSpring;

import lombok.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Calculadora {
    private List<String> resultados = new ArrayList<>();


    public void somar(){
        Double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro numero: ");
        num1 = sc.nextDouble();
        System.out.println("Segundo numero: ");
        num2 = sc.nextDouble();
        String resultado = num1 + " + " + num2 + " = " + (num1 + num2);
        System.out.println(resultado);
        resultados.add(resultado);
    }
    public void subtrair(){
        Double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro numero: ");
        num1 = sc.nextDouble();
        System.out.println("Segundo numero: ");
        num2 = sc.nextDouble();
        String resultado = num1 + " - " + num2 + " = " + (num1 - num2);
        System.out.println(resultado);
        resultados.add(resultado);
    }
    public void multiplicar(){
        Double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro numero: ");
        num1 = sc.nextDouble();
        System.out.println("Segundo numero: ");
        num2 = sc.nextDouble();
        String resultado = num1 + " x " + num2 + " = " + (num1 * num2);
        System.out.println(resultado);

        resultados.add(resultado);
    }
    public void dividir(){
        Double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro numero: ");
        num1 = sc.nextDouble();
        System.out.println("Segundo numero: ");
        num2 = sc.nextDouble();
        String resultado = num1 + " + " + num2 + " = " + (num1 / num2);

        System.out.println(resultado);
        resultados.add(resultado);
    }

    public void imprimirResultado(){
        System.out.println("Operações realizadas: ");
        for(int i=0; i<resultados.size(); i++){
            System.out.println((i+1) + ". " + resultados.get(i));
        }
    }
}
