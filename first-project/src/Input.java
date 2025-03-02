import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String film = scanner.nextLine();
        System.out.println(film);

        System.out.println("Ano de lançamento: ");
        int releaseYear = scanner.nextInt();
        System.out.println(releaseYear);

        System.out.println("Avaliação do filme: ");
        double grade = scanner.nextDouble();
        System.out.println(grade);
    }
}
