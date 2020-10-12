package net.ulno.fulib;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @Test
    public void startGame() {
        Player player1 = new Player();
        Player player2 = new Player();
        Game game = new Game(player1, player2);
        game.startGame(null, null);
    }

    @Test
    public void test1() {
        /*
         * In this scenario, Mary chooses bucket 1 (with index 0).
         * Since there are 3 pebbles in that bucket, the last one
         * lands in an empty bucket. This means that Mary can collect
         * all pebbles from the opposite bucket (that belongs to John)
         * and add the collected pebbles to her Kalah (house).
         */
        Player player1 = new Player().setName("Mary");
        Player player2 = new Player().setName("John");
        Game game = new Game(player1, player2);
        List<Integer> list1 = Arrays.asList(3, 4, 4, 0, 4, 4);
        List<Integer> list2 = Arrays.asList(4, 4, 4, 4, 4, 4);
        game.startGame(list1, list2);

//        Player currentPlayer;
//        Player opponent;
//        if (player1.getIsHisTurn()) {
//            currentPlayer = player1;
//            opponent = player2;
//        }
//        else {
//            currentPlayer = player2;
//            opponent = player1;
//        }
//
//        game.playTurn(currentPlayer, opponent, 0);
        game.playTurn(player1, player2, 0);
        assertEquals(4, player1.getHouse().getPebbleCount());
        assertEquals(0, player2.getBuckets().get(2).getPebbleCount());
    }

    @Test
    public void testEndGame() {
        Player player1 = new Player();
        Player player2 = new Player();
        Game game = new Game(player1, player2);
        List<Integer> list1 = Arrays.asList(3, 4, 4, 0, 4, 4);
        List<Integer> list2 = Arrays.asList(0, 0, 0, 0, 0, 1);
        game.startGame(list1, list2);
        assertTrue(game.isRunning());
        game.playTurn(player2, player1, 5);
        assertFalse(game.isRunning());
    }

    @Test
    public void test2() {
        /*
         * In this scenario, Mary chooses bucket 3 (with index 2).
         * Since there are 4 pebbles in that bucket, the last one lands
         * in her own Kalah (house). Therefore, she gets to play another turn.
         */
        Player player1 = new Player().setName("Mary");
        Player player2 = new Player().setName("John");
        Game game = new Game(player1, player2);
        List<Integer> list1 = Arrays.asList(3, 4, 4, 0, 4, 4);
        List<Integer> list2 = Arrays.asList(0, 0, 0, 0, 0, 1);
        game.startGame(list1, list2);
        game.playTurn(player1, player2, 2);
        assertTrue(player1.getIsHisTurn());

        WebConnector.run(game);
    }

    @Test
    public void test3() {
        Player player1 = new Player().setName("Mary");
        Player player2 = new Player().setName("John");
        Game game = new Game(player1, player2);
        game.startGame(null, null);
        while (game.isRunning()) {
            Player currentPlayer;
            Player opponent;
            if (player1.getIsHisTurn()) {
                currentPlayer = player1;
                opponent = player2;
            }
            else {
                currentPlayer = player2;
                opponent = player1;
            }
            List<Integer> validIndices = new ArrayList<>();
            for (int i = 0; i < currentPlayer.getBuckets().size(); i++) {
                if (currentPlayer.getBuckets().get(i).getPebbleCount() > 0) {
                    validIndices.add(i);
                }
            }
            Random rand = new Random();
            Integer chosenIndex = validIndices.get(rand.nextInt(validIndices.size()));
            game.playTurn(currentPlayer, opponent, chosenIndex);
        }

    }

    @Test
    public void test3_player1() throws IOException, InterruptedException {
        Player player1 = new Player().setName("Mary");
        player1.setId(1);
        Player player2 = new Player().setName("John");
        player2.setId(2);
        Game game = new Game(player1, player2);
        List<Integer> list1 = Arrays.asList(3, 4, 4, 0, 4, 4);
        List<Integer> list2 = Arrays.asList(0, 0, 0, 0, 0, 1);
        game.startGame(list1, list2);

        WebConnector.run(game);
        Gson gson = new Gson();
        Turn turn = new Turn();
        turn.setPlayerId(1);
        turn.setBucketId(0);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:40080/playturn"))
                .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(turn)))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response);
    }
}