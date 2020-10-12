package net.ulno.fulib;

import org.fulib.FulibTools;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MancalaTest {
    @Test
    public void test1() {

        List<Bucket> buckets = Arrays.asList(
                new Bucket().setId(1).setPebbleCount(1),
                new Bucket().setId(2).setPebbleCount(0),
                new Bucket().setId(3).setPebbleCount(1),
                new Bucket().setId(4).setPebbleCount(2),
                new Bucket().setId(5).setPebbleCount(0),
                new Bucket().setId(6).setPebbleCount(0)
        );
        House house = new House().setPebbleCount(1);

        Player player = new Player().setName("player1").withBuckets(buckets).setHouse(house).setIsHisTurn(false);

        FulibTools.objectDiagrams().dumpSVG("initial_1", player);
    }

    @Test
    public void test2() {

    List<Bucket> buckets = Arrays.asList(
                new Bucket().setId(1).setPebbleCount(3),
                new Bucket().setId(2).setPebbleCount(5),
                new Bucket().setId(3).setPebbleCount(0),
                new Bucket().setId(4).setPebbleCount(0),
                new Bucket().setId(5).setPebbleCount(1),
                new Bucket().setId(6).setPebbleCount(1)
        );
        House house = new House().setPebbleCount(0);
        Player player = new Player().setName("player2").withBuckets(buckets).setHouse(house).setIsHisTurn(true);

        FulibTools.objectDiagrams().dumpSVG("initial_2", player);
    }

    @Test
    public void test3() {

        List<Bucket> buckets = Arrays.asList(
                new Bucket().setId(1).setPebbleCount(1),
                new Bucket().setId(2).setPebbleCount(0),
                new Bucket().setId(3).setPebbleCount(1),
                new Bucket().setId(4).setPebbleCount(2),
                new Bucket().setId(5).setPebbleCount(0),
                new Bucket().setId(6).setPebbleCount(0)
        );
        House house = new House().setPebbleCount(2);
        Player player = new Player().setName("player1").withBuckets(buckets).setHouse(house).setIsHisTurn(true);

        FulibTools.objectDiagrams().dumpSVG("after_1", player);
    }

    @Test
    public void test4() {

        List<Bucket> buckets = Arrays.asList(
                new Bucket().setId(1).setPebbleCount(3),
                new Bucket().setId(2).setPebbleCount(0),
                new Bucket().setId(3).setPebbleCount(1),
                new Bucket().setId(4).setPebbleCount(1),
                new Bucket().setId(5).setPebbleCount(2),
                new Bucket().setId(6).setPebbleCount(2)
        );
        House house = new House().setPebbleCount(0);
        Player player = new Player().setName("player2").withBuckets(buckets).setHouse(house).setIsHisTurn(false);

        FulibTools.objectDiagrams().dumpSVG("after_2", player);
    }
}