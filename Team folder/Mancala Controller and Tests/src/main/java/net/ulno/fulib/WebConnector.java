package net.ulno.fulib;

import com.google.gson.Gson;
import org.json.JSONObject;

import static spark.Spark.*;

public class WebConnector {

    public static void run(Game game) {
        port(40080);
        get("/player", (req, res) -> {
            JSONObject json = new JSONObject();
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

        get("/gamestate", (req, res) -> {
            JSONObject json = new JSONObject();
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
            return json.toString();
        });

        post("/playturn", (request, response) -> {
            response.type("application/json");
            Gson gson = new Gson();
            Turn turn = gson.fromJson(request.body(), Turn.class);
            JSONObject json = new JSONObject();
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
