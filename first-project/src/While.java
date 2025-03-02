import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        double grade = 0;
        int total = 0;

        while(grade != -1) {
            System.out.println("Digite uma Avaliação para o filme ou -1 para encerrar: ");
            
            grade = scanner.nextDouble();

            if (grade != -1) {
                average += grade;
                total++;
            }
        }

        if(total >=1) System.out.println("Média de Avaliações: " + (average / total) / 2);
        
    }
}
