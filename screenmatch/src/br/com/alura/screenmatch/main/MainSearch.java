package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.exception.ConversionErrorException;
import br.com.alura.screenmatch.models.Title;
import br.com.alura.screenmatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        String search = "";
        List<Title> titles = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();


        while (!search.equalsIgnoreCase("sair")) {

            System.out.println("Busque o filme desejado:");
            search = input.next();

            if(search.equalsIgnoreCase("sair")) {
                break;
            }

            String address = "https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=3d33f15";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(address))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                //      Title myTitle = gson.fromJson(json, Title.class);
                TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
                System.out.println(myTitleOmdb);

                System.out.println(address);

                Title myTitle = new Title(myTitleOmdb);
                System.out.println(myTitle);

                titles.add(myTitle);

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algo deu errado na busca, verifique o endereço");
            } catch (ConversionErrorException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titles);
        FileWriter writer = new FileWriter("movies.json");
        writer.write(gson.toJson(titles));
        writer.close();
    }
}

