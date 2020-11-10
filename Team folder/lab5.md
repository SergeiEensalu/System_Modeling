# Building a Search Engine
![image](images/lab5/Search%20Engine.png)

The search engine is drawn based on searching portfolio data. We can search based on keyword like "reflection","research" etc. We can also search based on tag and texts.
This search engine would not be helpful if we wanted to build a competitor to the new Qwant or DuckDuckGo because the search engine made by Qwant and DuckDuckGo have
spent 5-10 years for developing and is developed by expert research personnel.The system developed by us have been developed in small time span and there may be chance of vulnerabilities, so our system cannot be proposed as alternative to Qwant or DuckDuckGo.


# Mancala Usecase Diagrams

High-level diagram:
![image](images/lab5/lab5_mancala_highlevel.PNG)

Low-level diagram:
![image](images/lab5/lab5_mancala_lowlevel.PNG)

In team discussion we reached the conclusion that the low-level use-case diagram
could be helpful for development but when choosing between this and a
respective component diagram, the latter might be more suitable for development purposes.
However, for initial design decisions, use case diagrams are a good starting point.

# Mancala personas

## Helmut, the casual social player
<img src="https://i.pinimg.com/originals/c8/21/a9/c821a968366fbb604619476753e377f9.jpg" width="200" />

### Profile
Helmut is a 32-year old man living in Põlva and has recently relocated there and has not made a lot of friends yet. He likes puzzle games and having a few beers in the evening.
### Motivations
Helmut likes playing puzzle games on Miniclip, but enjoys the social aspect of online gaming the most. Games can only stimulate Helmut for so long before it gets boring. Politely trash talking the opponent and finding excuses when losing brings extra excitement for Helmut and keeps him engaged for longer.

## Joosep, the child entertaining himself when parents aren't home yet
<img src="https://cdn.onebauer.media/one/media/5d4b/ec2e/e091/dba7/778b/160f/home-alone-again.jpg?quality=50&width=1800&ratio=16-9&resizeStyle=aspectfill&format=jpg" width="200" />

### Profile
Joosep is a 11-year old child who has a few hours of free time after school when his parents aren't home yet. He likes playing RuneScape and other online games. His favourite class in school is math and lately he's been interested in math based games.
### Motivations
Joosep has not been paying much attention in English class, so he does not understand languages other than Estonian. He finds it hard to navigate menus in games that are only available in English. He also likes to sing his favourite songs to his opponents.

## Changes made based on personas
Based on Helmut's preferences, we decided to add a messaging service to the game, which allows you to speak to your opponent. Based on Joosep's motivations, we decided to make the menus as intuitive as possible so that non-English speaking players can play without any problems. We also decided to add an option to mute the opponent because of Joosep's singing tendencies. 

# ATM Money Withdrawal Usecase

High-level diagram: 

![image](images/lab5/lab_5_ATM_highlevel.png)

Low-level diagram:

![image](images/lab5/lab_5_ATM_lowlevel.png)

In team discussion we reached the conclusion that the low-level use-case diagram
could be helpful for development but when choosing between this and a
respective component diagram, the latter might be more suitable for development purposes.
However, for initial design decisions, use case diagrams are a good starting point.

# ATM Money Withdrawal Personas
#Scenario 1
<img src="https://www.squidge.org/~peja/aliassmithandjones/benww2.jpg" width="200"/>

Thomas Edision <br />
Age : 40 <br />
Works as a primary school teacher <br />
Father of two children <br />

As a father of two children, he mostly buy gift for his children and wife. Since he is always busy, he managed to buy gift by withdrawing money from atm.
He always need to remember the time for withdrawing the money. 

#Scenario 2
<img src="https://cdn.vox-cdn.com/thumbor/LzHo4JSAD1T4N8C_1Ou4eop7vNU=/0x0:4989x3329/1200x800/filters:focal(2067x841:2865x1639)/cdn.vox-cdn.com/uploads/chorus_image/image/58889141/usa_today_10665675.0.jpg" width="200"/>

Samuel Jones Smith <br />
Age : 30 <br />
Works as a garrage worker <br />
Father of three children <br />

As a father of three children, he mostly have to pay education fee for his three children. He has taken loan from bank  to buy laptop so that his children can study online since education system has fully shifted to online mode due to COVID-19. Since he is always busy in his works, he has chance to forget the amount to be paid at the bank. Also, he needs to fulfills the daily basic need of his children . So, he have to withdraw money from ATM daily. 

Discussion:
Regarding Thomas Edision,bank system should send him some kind of reminder note so that he is able to remember his daily scheduling in ATM booth by tracking his daily
withdrawal.
Regarding Samuel,considering his situation bank should give him remainder note in his mobile regarding his loan paying date recurring in each month for a year. Also, Bank should motivate him by introducing an easy credit system with recurring payments to pay the money back with his current schedule.

Thus,Bank should introduce a system to remind user of their daily atm usuage patterns and also introduce easy credit system with recurring payments so that person like Samuel can be motivated. So, introducing such system will help bank to improve their performance rather than manual one.



# Mancala Controller and Tests

Refer to the "Mancala Controller and Tests" folder. The relevant tests are located
in java/net/ulno/fulib/GameTest.java.
