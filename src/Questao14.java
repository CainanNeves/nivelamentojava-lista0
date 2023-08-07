import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 50;
        float a = 0f;
        while(count-- > 0){
            a += input.nextFloat();
        }
        System.out.println("A média dos 50 números é = " + a/50f);
    }
}
