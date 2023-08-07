import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o código do produto(XXX):");
        String code = input.nextLine();
        if(code.equals("001"))
            System.out.println("Parafuso");
        else if (code.equals("002"))
            System.out.println("Porca");
        else if (code.equals("003"))
            System.out.println("Prego");
        else
            System.out.println("Diversos");
    }
}
