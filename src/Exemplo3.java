import java.util.InputMismatchException;
import java.util.Scanner;


public class Exemplo3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo ao programa!");
        int numero = obtemNumeroZeroADez(entrada);
        int numero2 = obtemNumeroZeroADez(entrada);
        int numero3 = obtemNumeroZeroADez(entrada);
        int numero4 = obtemNumeroZeroADez(entrada);

        System.out.println("Repetindo!!!");
        System.out.println("O número 1 foi: " + numero);
        System.out.println("O número 2 foi: " + numero2);
        System.out.println("O número 3 foi: " + numero3);
        System.out.println("O número 4 foi: " + numero4);
    }

    private static int obtemNumeroZeroADez(Scanner entrada) {
        boolean erro = false;
        int numero = -1;
        while (erro || numero == -1) {
            try{
                System.out.println("Digite um número de zero a 10");
                numero = entrada.nextInt();
                while(numero > 10 || numero < 0) {
                    System.out.println("Digite um número de zero a 10");
                    numero = entrada.nextInt();
                }
                System.out.println("O número digitado foi: " + numero);
            }catch(InputMismatchException e){
                entrada.nextLine();
                System.out.println("É aceito somente números, tente novamente!");
                erro = false;
            }
        }
        return numero;
    }
}