import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        double grade;

        
        for(int i = 0; i < 3; i++) {
            System.out.println("Avaliação do filme: ");
            
            grade = scanner.nextDouble();
            average += grade;
        }

        System.out.println("Média de Avaliações: " + (average / 3) / 2);
    }
}
