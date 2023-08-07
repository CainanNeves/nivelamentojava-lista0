public class Questao13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if(i+j==7) {
                    System.out.println("Primeiro dado = " + i);
                    System.out.println("Segundo dado = " + j);
                }
            }
        }
    }
}
