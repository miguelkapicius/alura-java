public class Conditional {
    public static void main(String[] args) {

        int year = 2022;
        boolean includedInPlan = true;
        String planType = "plus";

        if(year >= 2024) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if(includedInPlan || planType.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve adquirir o plano");
        }
        
    }
}
