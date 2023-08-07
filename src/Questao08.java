import java.util.Scanner;
public class Questao08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int a = input.nextInt();
        if(a%2==0){
            System.out.printf("O número %d é par!", a);
        }else{
            System.out.printf("O número %d é impar!", a);
        }
    }

}
