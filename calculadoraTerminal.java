package tareas;

import java.util.Scanner;

public class calculadoraTerminal {  
// Giorgio Baglieri 29.599.848
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char operador = ' ';
        char salir = ' ';
        float n1, n2, res;

        System.out.println(".: CALCULADORA JAVA :. \n");

        while(true){
            System.out.print("Digite el operador (+, -, *, /): ");
            operador = input.next().charAt(0); 
            
            switch(operador){
                case '+':
                System.out.println("Realizando la operacion: n1 + n2 = res");
                System.out.print("Digite el primer operando: ");
                n1 = input.nextFloat();
                System.out.print("Digite el segundo operando: ");
                n2 = input.nextFloat();
                res = n1 + n2;
                System.out.println("El resultado es: " + res);
                res = 0;
                break;


                case '-':
                System.out.println("Realizando la operacion: n1 - n2 = res");
                System.out.print("Digite el primer operando: ");
                n1 = input.nextFloat();
                System.out.print("Digite el segundo operando: ");
                n2 = input.nextFloat();
                res = n1 - n2;
                System.out.println("El resultado es: " + res);
                res = 0;
                break;


                case '*':
                System.out.println("Realizando la operacion: n1 * n2 = res");
                System.out.print("Digite el primer operando: ");
                n1 = input.nextFloat();
                System.out.print("Digite el segundo operando: ");
                n2 = input.nextFloat();
                res = n1 * n2;
                System.out.println("El resultado es: " + res);
                res = 0;
                break;

                case '/':
                System.out.println("Realizando la operacion: n1 / n2 = res");
                System.out.println("PRECAUCION: no ingrese O2 = 0");
                System.out.print("Digite el primer operando: ");
                n1 = input.nextFloat();
                System.out.print("Digite el segundo operando: ");
                n2 = input.nextFloat();
                if(n2 == 0){
                    System.out.println("DIVISOR NO VALIDO CANCELANDO OPERACION");
                    break;
                }
                res = n1 / n2;
                System.out.println("El resultado es: " + res);
                break;

                default:
                System.out.println("Ingrese un operador valido");

            }
            System.out.println();
            System.out.println("Desea detener la ejecucion? (N/S): ");
            salir = input.next().charAt(0);
            System.out.println();

            if(salir == 'S' || salir == 'N'){
                System.out.println("Finalizando ejecucion");
                break;
            }

        }

        input.close();
    }

}