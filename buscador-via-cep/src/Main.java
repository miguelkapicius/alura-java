import br.com.alura.buscador.models.Address;
import br.com.alura.buscador.models.AddressResponse;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Gson gson = new Gson();
        Scanner input = new Scanner(System.in);
        List<Address> addresses = new ArrayList<>();
        int option = 1;

        while (option != 0) {

            System.out.println("Digite o CEP que deseja buscar:");
            String cep = input.next();

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/")).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            AddressResponse addressResponse = gson.fromJson(response.body(), AddressResponse.class);

            Address address = new Address(addressResponse);
            addresses.add(address);

            System.out.println("Digite 0 para sair ou 1 para continuar");
            option = input.nextInt();
        }

        System.out.println(addresses);

    }
}