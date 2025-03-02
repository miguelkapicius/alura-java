public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Screen Match");
        System.out.println("Filme: Top Gun Maverick");

        int year = 2022;
        boolean includedInPlan = true;
        double average = (9.0 + 6.5 + 7.0) / 3;
        int classification = (int) (average / 2); // casting double --> int
        String synopsis = "Filme de aventura";

        System.out.println("Ano de Lançamento: " + year);
        System.out.println("Disponível no Plano: " + (includedInPlan? "Sim" : "Não"));
        System.out.println("Avaliação: " + classification);
        System.out.println("Sinopse: " + synopsis);
    }

}
