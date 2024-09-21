package dhiego.AppSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class StartCalculadora implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {


        Calculadora calculadora = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int opcao = 10;
        while(opcao != 0) {
            System.out.println("\tCALCULADORA\t");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Lista dos resultados");
            System.out.println("0 - Sair");
            System.out.print("Digite sua opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    calculadora.somar();
                    break;
                case 2:
                    calculadora.subtrair();
                    break;
                case 3:
                    calculadora.multiplicar();
                    break;
                case 4:
                    calculadora.dividir();
                    break;
                case 5:
                    calculadora.imprimirResultado();
                    break;
                case 0:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Insira um valor válido, por favor!");

            }
        }
    }
}
