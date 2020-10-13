## Lab 1 work 
 - [Full Lab 1](/Team%20folder/lab1.md)

# 1.6.2.6 ATM Money Withdrawal

- Consider the software for an automated teller machine (ATM). Take especially \
 a closer look at the parts being triggered when withdrawing money from an account \
 Give eight examples of situations in this process.
 
   - Security check. Check the PIN code entered by the user
   - Show options for operations between which the user can choose
   - Insert amount of money that user want to withdraw
   - Сheck if the limit and money balance on the card allow you to withdraw such an amount
   - Check the availability of bills and calculate which bills are better for the user (for example, when withdrawing 100 euro, you can give one 100 euro banknote or two 50 euros each and this will be better than 20 times 5 euros)
   - Withdraw money from the account
   - Give money to the user
   - Return bank card


## Scenarios
- Security check. Check the PIN code entered by the user
   - The user inserts the bank card into the ATM
   - ATM  asks for a PIN code. User enter
   - ATM check the PIN code
   - Success screen
   - The user is redirected to the screen of operations
   
- Show options for operations between which the user can choose
   - The user is prompted to put money into the account, withdraw money from the account, check the balance and make a money transfer
   - The user chooses to withdraw money from the account
   - The user is redirected to the screen of withdraw money from the account

- Insert amount of money that user want to withdraw
   - ATM ask the user for the amount he wants to withdraw
   - The user enters the amount
   - The user clicks ok

- Сheck if the limit and the amount on the card allow you to withdraw such an amount
   - Show a loading screen for user
   - ATM check the limit of card
   - ATM check the money balance of bank account

- Check the availability of bills and calculate which bills are better for the user (for example, when withdrawing 100 euro, you can give one 100 euro banknote or two 50 euros each and this will be better than 20 times 5 euros)
   - Show a loading screen for user
   - ATM check calculates the bills that will be given to the user

- Withdraw money from the account
   - Show a loading screen for user
   - Withdraw money from the account
   
- Give money to the user
   - The user sees information about the amount that was withdrawn from the account
   - The user takes a money from a ATM
   - The user sees success message
   - The user is redirected back to the screen of operations

- Return bank card
   - User takes a bank card from ATM
   - ATM is ready to start new operation with new user


### Exercise 1.6.1.1
1.	Abstract: idea, comfort, dream, feeling, pain, happiness, noise, cold, mindset, social norm
Concrete: execution, cup of coffee, a tear, stomach ache, a smile, tire screech, an ice cube, a politician, a rule of conduct
2. Table:

| Abstract | Concrete |
| -------- | -------- |
| Cold  | An ice cube |
| Noise | Tire screech |
| Meaning | Word |
| Intent | Action |
| Information | News article |
| Pain | Stomach ache |
| Happiness | A smile |
| Social norms | A rule of conduct |
| Comfort | A cup of coffee |
| Idea | Execution |
3. Most concrete example for comfort: a 100 ml cup of Paulig coffee on a Saturday morning
4. Abstract – some high-level notion or idea that can encompass a range of examples but does not specify any explicitly

    Concrete – some low-level object or idea that represents a certain state of a certain element

    Example – a specification of some object/notion/idea that provides helpful illustration of a topic

    In the field of systems modeling, the abstract versus concrete differentiation is important because in some cases, the situation calls for an abstract representation of a system while in others, we would need a concrete description of a system state, e.g. to illustrate some aspects to the client. 

### Exercise 1.6.2.1
Four additional rules for Mau Mau:
1.	Before the start of the game, a player who is not the dealer cuts the deck 4 times. If they cut 1-3 significant cards, they are allowed to keep them if they want. However, if four cards where the cards are cut are found to be power cards, the deck needs to be reshuffled and the cut is repeated.
2.	When a player has only one card left, he must say “Mau” (even if it is an Ace); if that card is a Jack, he must say “Mau-Mau”. Failure means that the player must take a card.
3.	If an Ace is played, one other card must be played with it. If the player does not have another card, or cannot follow in suit or number, then the player must take a card from the pack. If your final card is an Ace, you cannot win on that turn.
4.	If the game is scored, and the winning card is a Jack, then all points against the losers are doubled.

Eight examples for Mau Mau situations:
1.	Mary plays an H9. John plays after Mary and can thus play either a 9 from any suit or any card from the suit of hearts or a Jack.
2.	John plays a DJ. He can now announce a suit which has to be played next. John announces spades. Tim plays after John and has to play any card from the suit of spades or another Jack.
3.	Tim plays an S8. This means that the next player, Judy, skips their turn and the turn goes again to Mary.
4.	Mary does not have an 8 of any suit nor any card from the suit of spades nor any Jack. She has to draw one card from the drawing stack. Mary draws an S10 and can play it right away, but she also has the right to keep it.
5.	John plays an SA and right after that also an SQ, because if an Ace is played, one other card must be played with it.
6.	Tim plays a DQ and is left with only one card. He says “Mau” because if he didn’t, he would have to draw a card. He doesn’t have a Jack, so “Mau” is sufficient.
7.	Mary plays a D8 and is left with only one card, a HJ. She says “Mau-Mau” because if she didn’t, she would have to draw a card.
8.	John plays a DA and is left with just one card, so he says “Mau”. Since he just played an Ace, he also plays his second card, thus he gets rid of all his cards and wins the game.



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




   

