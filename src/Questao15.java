import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 50;
        float a = 0f;
        do{
            a += input.nextFloat();
        }while(--count > 0);
        System.out.println("A média dos 50 números é = " + a/50f);
    }
}
