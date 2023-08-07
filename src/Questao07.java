import java.util.Scanner;
public class Questao07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, aux;
        System.out.println("Digite o valor de A:");
        a = input.nextInt();
        System.out.println("Digite o valor de B: ");
        b = input.nextInt();
        aux = a;
        a = b;
        b = aux;
        System.out.printf("O novo valor de A é %d\nO novo valor de B é %d\n", a, b);
    }
}