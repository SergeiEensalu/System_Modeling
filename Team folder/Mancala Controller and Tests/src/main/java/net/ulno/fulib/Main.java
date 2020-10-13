package net.ulno.fulib;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        House house1 = new House();
        House house2 = new House();
        Player player1 = new Player().setName("Mary").setHouse(house1);
        player1.setId(1);
        Player player2 = new Player().setName("John").setHouse(house2);
        player2.setId(2);
        Game game = new Game(player1, player2);
        game.startGame(null, null);
        WebConnector.run(game);
        System.out.println("Webconnector started");

/*        Gson gson = new Gson();
        Turn turn = new Turn();
        turn.setPlayerId(1);
        turn.setBucketId(0);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:40080/playturn"))
                .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(turn)))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response);*/
    }
}
