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





   

