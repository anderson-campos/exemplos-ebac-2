import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, num3, num4, media, soma;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num1 = scanner.nextInt();

        System.out.print("Digite um numero: ");
        num2 = scanner.nextInt();

        System.out.print("Digite um numero: ");
        num3 = scanner.nextInt();

        System.out.print("Digite um numero: ");
        num4 = scanner.nextInt();

        soma = num1 + num2 + num3 + num4;
        media = soma / 4;

        System.out.println("O resultado da soma é: " + soma + ", e a média é " + media);

    }
}