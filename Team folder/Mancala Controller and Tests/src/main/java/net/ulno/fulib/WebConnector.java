package net.ulno.fulib;

import com.google.gson.Gson;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.*;

public class WebConnector {

    public static void run(HashMap<Integer, Game> games) {
        port(40080);

        post("/game", (req, res) -> {
            Game newGame = new Game();
            games.put(newGame.getId(), newGame);
            JSONObject json = new JSONObject();
            json.put("result", "OK");
            return json.toString();
        });

        get("/games/:id/:name/:playerNumber", (req, res) -> {
            Integer gameId = Integer.valueOf(req.params(":id"));
            Game game = games.get(gameId);
            String playerName = req.params(":name");
            Player player = new Player().setName(playerName);
            int playerNumber = Integer.parseInt(req.params(":playerNumber"));
            if (playerNumber == 1) {
                game.setPlayer1(player);
            }
            else {
                game.setPlayer2(player);
            }
            JSONObject json = new JSONObject();
            json.put("result", "OK");
            return json.toString();
        });

        get("/player/:id", (req, res) -> {
            JSONObject json = new JSONObject();
            Integer gameId = Integer.valueOf(req.params(":id"));
            Game game = games.get(gameId);
            Player player = game.getNextPlayer();
            json.put("id", player.getId());
            json.put("name", player.getName());
            json.put("houseScore", player.getHouse().getPebbleCount());
            for (Bucket bucket : player.getBuckets()) {
                JSONObject bucketObj = new JSONObject();
                bucketObj.put("pebbleCount", bucket.getPebbleCount());
                bucketObj.put("id", bucket.getId());

                json.accumulate("buckets", bucketObj);
            }
            json.put("result", "OK");
            return json.toString();
        });

        get("/gamestate/:id", (req, res) -> {
            JSONObject json = new JSONObject();
            Integer gameId = Integer.valueOf(req.params(":id"));
            Game game = games.get(gameId);
            for (Player player : game.getPlayers()) {
                JSONObject json1 = new JSONObject();
                json1.put("id", player.getId());
                json1.put("name", player.getName());
                json1.put("houseScore", player.getHouse().getPebbleCount());
                for (Bucket bucket : player.getBuckets()) {
                    JSONObject bucketObj = new JSONObject();
                    bucketObj.put("pebbleCount", bucket.getPebbleCount());
                    bucketObj.put("id", bucket.getId());

                    json1.accumulate("buckets", bucketObj);
                }
                json.accumulate("players", json1);
            }
            json.put("winner", game.getWinner());
            json.put("isRunning", game.isRunning());
            System.out.println(json.toString());
            return json.toString();
        });

        post("/playturn/:id", (request, response) -> {
            response.type("application/json");
            Integer gameId = Integer.valueOf(request.params(":id"));
            Gson gson = new Gson();
            Turn turn = gson.fromJson(request.body(), Turn.class);
            JSONObject json = new JSONObject();
            Game game = games.get(gameId);
            Player player = game.getNextPlayer();
            Player opponent = game.getOpponent();
            if (player.getId() == turn.getPlayerId()) {
                game.playTurn(player, opponent, turn.getBucketId());
                json.put("result", "OK");
            }
            else {
                json.put("result", "Wait");
            }
            return json.toString();
        });
        options("/*",
                (request, response) -> {

                    String accessControlRequestHeaders = request
                            .headers("Access-Control-Request-Headers");
                    if (accessControlRequestHeaders != null) {
                        response.header("Access-Control-Allow-Headers",
                                accessControlRequestHeaders);
                    }

                    String accessControlRequestMethod = request
                            .headers("Access-Control-Request-Method");
                    if (accessControlRequestMethod != null) {
                        response.header("Access-Control-Allow-Methods",
                                accessControlRequestMethod);
                    }

                    return "OK";
                });
        before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));
    }
}
