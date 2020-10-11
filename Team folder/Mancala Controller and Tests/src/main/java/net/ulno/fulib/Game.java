package net.ulno.fulib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    public Player player1;
    public Player player2;
    private Player winner;

    public boolean isRunning() {
        return isRunning;
    }

    private boolean isRunning;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame(List<Integer> counts1, List<Integer> counts2) {
        if (counts1 == null || counts2 == null || counts1.size() != 6 || counts2.size() != 6) {
            player1.withBuckets(
                    new Bucket().setId(0).setPebbleCount(3),
                    new Bucket().setId(1).setPebbleCount(3),
                    new Bucket().setId(2).setPebbleCount(3),
                    new Bucket().setId(3).setPebbleCount(3),
                    new Bucket().setId(4).setPebbleCount(3),
                    new Bucket().setId(5).setPebbleCount(3)
            );
            player2.withBuckets(
                    new Bucket().setId(0).setPebbleCount(3),
                    new Bucket().setId(1).setPebbleCount(3),
                    new Bucket().setId(2).setPebbleCount(3),
                    new Bucket().setId(3).setPebbleCount(3),
                    new Bucket().setId(4).setPebbleCount(3),
                    new Bucket().setId(5).setPebbleCount(3)
            );
        } else {
            List<Bucket> bucketList1 = new ArrayList<Bucket>();
            List<Bucket> bucketList2 = new ArrayList<Bucket>();
            for (int i = 0; i < counts1.size(); i++) {
                bucketList1.add(new Bucket().setId(i).setPebbleCount(counts1.get(i)));
                bucketList2.add(new Bucket().setId(i).setPebbleCount(counts2.get(i)));
            }
            player1.withBuckets(bucketList1);
            player2.withBuckets(bucketList2);
        }

        player1.setHouse(new House());
        player2.setHouse(new House());
        player1.setIsHisTurn(true);
        this.isRunning = true;
    }

    public void playTurn(Player player, Player opponent, int value) {
        player.setIsHisTurn(true);
        Bucket currentBucket = player.getBuckets().get(value);
        int pebbleCount = currentBucket.getPebbleCount();
        currentBucket.setPebbleCount(0);
        int currentId = value + 1;
        boolean keepTurn = false;
        while (pebbleCount > 0) {
            if (currentId <= 5) {
                Bucket curBucket = player.getBuckets().get(currentId);
                int oldCount = curBucket.getPebbleCount();
                curBucket.setPebbleCount(oldCount + 1);
                if (pebbleCount == 1 && oldCount == 0) {
                    captureOpposite(player, opponent, currentId);
                }
            } else if (currentId == 6) {
                int currentCount = player.getHouse().getPebbleCount();
                player.getHouse().setPebbleCount(currentCount + 1);
                if (pebbleCount == 1) {
                    keepTurn = true;
                }
            } else if (currentId >= 7 && currentId < 13) {
                int numBucket = currentId - 7;
                Bucket curBucket = opponent.getBuckets().get(numBucket);
                curBucket.setPebbleCount(curBucket.getPebbleCount() + 1);
            } else {
                int currentCount = opponent.getHouse().getPebbleCount();
                opponent.getHouse().setPebbleCount(currentCount + 1);
            }

            pebbleCount--;
            currentId++;
        }

        if (!keepTurn) {
            player.setIsHisTurn(false);
            opponent.setIsHisTurn(true);
        }

        boolean pebblesLeft1 = false;
        for (Bucket bucket:player.getBuckets()) {
            if (bucket.getPebbleCount() > 0) {
                pebblesLeft1 = true;
                break;
            }
        }
        boolean pebblesLeft2 = false;
        for (Bucket bucket:opponent.getBuckets()) {
            if (bucket.getPebbleCount() > 0) {
                pebblesLeft2 = true;
                break;
            }
        }
        if (!pebblesLeft1 || !pebblesLeft2) {
            endGame();
        }
    }

    private void captureOpposite(Player player, Player opponent, int currentId) {
        Bucket oppositeBucket = opponent.getBuckets().get(5 - currentId);
        int oldCount = oppositeBucket.getPebbleCount();
        oppositeBucket.setPebbleCount(0);
        House house = player.getHouse();
        house.setPebbleCount(house.getPebbleCount() + oldCount);
    }

    public Player getNextPlayer() {
        if (this.player1.getIsHisTurn()) {
            return this.player1;
        }
        return this.player2;
    }

    public Player getOpponent() {
        if (this.player1.getIsHisTurn()) {
            return this.player2;
        }
        return this.player1;
    }

    public void endGame() {
        int player1Score = 0;
        for (Bucket bucket:player1.getBuckets()) {
            int oldCount = bucket.getPebbleCount();
            player1Score += oldCount;
            bucket.setPebbleCount(0);
        }
        int player2Score = 0;
        for (Bucket bucket:player2.getBuckets()) {
            int oldCount = bucket.getPebbleCount();
            player2Score += oldCount;
            bucket.setPebbleCount(0);
        }
        player1.getHouse().setPebbleCount(player1.getHouse().getPebbleCount() + player1Score);
        player2.getHouse().setPebbleCount(player2.getHouse().getPebbleCount() + player2Score);

        if (player1.getHouse().getPebbleCount() > player2.getHouse().getPebbleCount()) {
            this.winner = player1;
        } else if (player1.getHouse().getPebbleCount() < player2.getHouse().getPebbleCount()) {
            this.winner = player2;
        }

        this.isRunning = false;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public List<Player> getPlayers() {
        return Arrays.asList(this.player1, this.player2);
    }
}
