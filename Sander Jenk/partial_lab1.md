

# 1.6.2.3 Examples for Mancala
(this point didn't contain a task)
# 1.6.3.3 User stories for Mancala
## Extend the four examples from Section 1.6.2.3 to scenarios.
1. Player 1 picks up the pebbles in one of his buckets
2. Player 1 then starts redistributing pebbles counter-clock-wise in to the following buckets
3. If the last pebble lands in Player 1-s own house, then Player 1 can move again
4. If the last pebble lands in an empty pit, then all the pebbles from the opposite side count as Player 1-s points


## Come up with two (conceptually different, not only different names) scenarios for Mancala.

### First scenario
State of the game:  
---|1|0|1|2|0|0--- Player 1   
16------------18   
---|3|5|0|0|1|1--- Player 2 (This player's turn)
1. Player 1 threatens to score 6 points the next turn by moving the pebble in the 4. bucket.
2. Player 2 moves the pebbles in his/her 2. bucket in anticipation and thus denying Player 1's attempt

### Second scenario
State of the game:  
---|1|0|6|2|0|1---Player 1  
14------------13  
---|2|0|0|0|7|2---Player 2 (This player's turn)

1. Player 1 threatens to move pebble in his/her 1st bucket and scoring 8 points in the next turn
2. Player 2 in anticipation moves the pebbles in his 6th bucket, thus adding 1 pebble to Player 1's 1st bucket and denying this scoring opportunity

• Give a scenario for trying to make an invalid move and the system rejecting
this.

1. Player starts his/her move by picking up the pebbles in his/her store
2. The system doesn't allow the player to pick up the pebbles in his/her store
3. The system forces player to restart his/her move

## Give a scenario for describing the last three turns of a Mancala game making the game ending in a tie.
State of the game:  
---|0|0|0|0|1|1---Player 1  
22------------21  
---|0|0|0|0|2|1---Player 2 (This player's turn)

1. Player 2 moves the pebble in his/her 6th bucket.
2. Player 2 moves the pebbles in his/her 5th bucket.
3. Player 2 moves the pebble in his/her 6th bucket, thus ending the game by clearing all buckets on his/her side and gaining 24. points. 2 remaining pebbles in Player 1's side count as Player 1's points and thus he/she also collects 24 points.