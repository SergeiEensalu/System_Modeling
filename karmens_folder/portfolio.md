### Software architecture vs code
Think and answer the following questions (and keep a digital document of this for your portfolio):
- Which types of diagrams are mentioned in the talk?
The commonly seen types that software companies tend to produce: boxes, the airline route map, the “generally true” diagrams which state the obvious, etc. Also, UML diagrams
- What is the standard for modeling software mentioned in the movie?
UML (Unifies Modeling Language)
- Why is nobody using it?
Too complex, too low-level, agile developers don’t use it (although they should)
- What is the model-code gap and what is the problem with it?
The models depict different things than what the code includes. It usually comes from the fact that we organize our code with regard to classes, namespaces, etc., but we use different structures in the models.
- What do you personally think about layers for modeling software?
I think it might not always be possible to isolate the layers as the layered architecture suggests, therefore it is not the best approach every time, but there are definitely cases where it is beneficial.
- How do you think about Systems Modeling after watching this movie?
I see more benefit in modeling the architecture than I did before – the lecture made me think about how we structure our code and think about it.
- Anything else remarkable from the movie, we should share/discuss?

### September 8 class + lab
#### Introduction
From Systems Modeling, I expect to learn how to reasonably structure a software development cycle, to learn about design patterns, how to create documentation that is useful (diagrams). I have created some diagrams and use cases previously, not much experience with modeling though

My name is Karmen and I’m not actually in SE Master’s but in Computer Science instead. 

*Note: did not have time to answer the rest of the personal questions*

What is software architecture?
https://codeburst.io/software-architecture-the-difference-between-architecture-and-design-7936abdd5830

“In simple words, software architecture is the process of converting software characteristics such as flexibility, scalability, feasibility, reusability, and security into a structured solution that meets the technical and the business expectations.”

Examples:
https://searchapparchitecture.techtarget.com/tip/Pros-and-cons-of-monolithic-vs-microservices-architecture

Group members: Ott Saar, Chioma Nkem-Eze, Martin Põhjakivi, Mike, Rabindra Dahal

#### Concrete vs abstract
| Concrete | Abstract |
| -------- | -------- |
| Physical | Theoretical |
| Explicit | Implicit |
| Word | Meaning |
| Action | Intent |
| News article | Information |

### Reflections on September 8 class + lab
Lecture:

The lecture was rather introductory and did not delve deep into a specific topic. I liked that the lecturer dedicated time for introducing himself and the teaching assistant, plus we could consider our own expectations for the course. This gave me a better starting point for the weeks ahead.

Lab:

The organization was a bit hectic, but this is understandable for the first sessions. We managed to gather our group and started working on our repository and divided the tasks for next time.

### Preparation for September 15 class
**Object Diagrams**

Pro arguments:
1.	Concrete, allows to exemplify the structure of a system in a way that is easier to digest than an abstract diagram
2.	Well suited for representing a certain part of the system, scope can be adjusted easily

Contra arguments:
1.	Attributes and values might be not that intuitive for non-CS people
2.	Quite narrow is terms of usage possibilities, only meant for specifying the data structures of a system

**Group 5 video on pros**

What are main points I learned from movie:
-	An object diagram includes objects with valued attributes (as opposed to a class diagram which does not have values for attributes and is more abstract)
-	An object diagram can represent a certain state of a system

What did I like/dislike:
-	Liked that speakers express themselves calmly and clearly
-	Liked that the video is well formatted (nice visuals and background music)
-	Liked that an example was given that the course students can relate to

How would the usage affect my own past, current, and potential future projects:
-	I could use object diagrams for prototyping a system before starting development
-	I could use object diagrams for showing a specific part of my system with example attribute values to explain the structure to the client

**Group 3 video on cons**

What are main points I learned from movie:
-	Object diagrams are difficult to read when trying to depict a large system at once
-	Refactoring object diagrams is time-consuming and thus expensive
-	There can be a significant model-code gap between object diagrams and code

What did I like/dislike:
-	Liked the speaker window that shows all speakers in the video
-	Liked the memes/pictures in the presentation
-	Disliked the occasional background noise

**Group 1 video on cons**

What are main points I learned from movie:
-	Object diagrams do not help that much with setting project architecture straight
-	Object diagrams can outdate easily, thus need regular maintenance and review

What did I like/dislike:
-	Liked the references at the beginning
-	Disliked the color scheme for some text on slides which made the text difficult to read

How would the usage affect my own past, current, and potential future projects:
-	Can be used for low level descriptions, higher levels need more abstraction

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

