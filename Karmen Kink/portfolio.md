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

### Preparation for September 22 class
**Class Diagrams**

Pro arguments:
1.	The structure of the system can be represented quite comprehensively before starting development (via class attributes, relationships, types)
2.	Rather easy to maintain and update by adding, removing or editing attributes/relationships/methods

Contra arguments:
1.	General readability probably worse for non-developers than for developers (all the different relationships, methods vs attributes, etc.)

**Group 7 video on pros**

What are main points I learned from movie:
-	The target audience should be able to process the abstract representation
-	Class diagrams can easily be mapped to code, especially for object-oriented languages
-	Method for encapsulating behavior to avoid maintenance problems

What did I like/dislike:
-	Liked the variety of examples presented in the video
- 	Liked that cardinalities were nicely explained
-	Liked the relevant tools presented (e.g. Sourcetrail)

How would the usage affect my own past, current, and potential future projects:
-	Could combine class and object diagrams (not into one, but use as complements of each other)

**Group 12 video on pros**

What are main points I learned from movie:
-	How to assign types (the common syntax, etc.)
-	Types of relationships in class diagrams (dependency, generalization or inheritance, association for static connections, aggregation, composition as a special type of aggregation)

What did I like/dislike:
-	Liked the gradual introduction from classes to class diagrams
-	Liked clear pronunciation
-	Liked the code-writing part where decorators were shown

**Group 2+6 video on cons**

What are main points I learned from movie:
-	In class diagrams, class names start with a capital letter and are not underlined (as opposed to object diagrams)
-	The many types of relationships can cause trouble with readability
-	Problems that inheritance can cause
-	Cardinalities with multiplicity can cause infinite cyclic associations

What did I like/dislike:
-	Liked that relationships are thoroughly explained
-	Liked the understandable and funny examples

### September 22 class + lab
Diagram #1:

The associations have arrowheads, something I haven't seen before in object diagrams. Overlaps with the instructor's opinion.

Diagram #2:

The object names and attributes duplicate the same information. Overlaps with the instructor's opinion.
Note: usually object name is first and class name second, object name is underlined and lowercase, and attributes
are expressed in the form e.g. value = 100, with the equals symbol.

Diagram #3:

The connections between objects don't seem too clear, probably due to the choice of which objects to include in the first place.

Diagram #4:

It's interesting that there are just transactions as well as a specific transaction (withdrawal).

### Preparation for September 29 class
**Component Diagrams**

Pro arguments:
1.	Good way to visualize the relations between different parts of the system (the big picture)
2.  High-level mapping, simplifies decision-making about system structure

Contra arguments:
1.	Targeted towards developers, not easy to grasp for others, although meant for communication
2.  Possibly high maintenance costs

**Group 14 video on pros**

What are main points I learned from movie:
-	Component diagrams allow to categorize objects into larger components

What did I like/dislike:
-	Liked the viewer-friendly introduction
-   Liked the step-by-step guide for drawing a component diagram
-   Disliked the rather poor audio quality (difficult to make out the words at times)

How would the usage affect my own past, current, and potential future projects:
-	In case of large projects, it can be very helpful to get an overview of the system 
and how the parts are connected (especially if the subparts are developed by separate teams)

**Group 4 video on pros**

What are main points I learned from movie:
-	Each of the components must be a modular part that encapsulates its contents
-   Provided versus required interfaces and their symbols
-   Various types of connections (dependency, composition, generalization, aggregation, etc.)

What did I like/dislike:
-	Liked the detailed explanations of connections
-   Liked the example about SmartID

**Group 12 video on cons**

What are main points I learned from movie:
-	Types of connections on component diagrams
-   It can be difficult to represent dynamic systems with component diagrams

What did I like/dislike:
-	Liked the hybrid diagram-code example, but was too fast at times

**Group 13 video on cons**

What are main points I learned from movie:
-	Component diagrams can sometimes be too abstract, but not concrete enough
-   For simpler cases, class diagrams might be sufficient
-   There are multiple ways to draw the same components, need to keep consistency in mind

What did I like/dislike:
-	Liked the structured overview of all contents of component diagrams
-   Liked the recap on drawing details

### September 29 class + lab

Domain modeling advantage: allows to show how the system would function in real life without
implementation details getting in the way
Disadvantage: introduces the model-code gap (as opposed to class diagrams)

Methods in class diagrams:
Using/including methods in class diagrams depends on whether the goal is to
model just the structure of the system, or the functionality as well. Also,
when including methods, we could limit ourselves to just the unique ones (e.g. 
excluding getters and setters) - but how to filter out the uniques?

#### Note-taking log from breakout rooms:

Notes for Group Nr 3

Moderator: Mike Camara

Note-Taker: Karmen Kink

Opening Notes

Mike, Karmen, Merlin, Raigo, Taavi, Vera

First Person Pro Notes

Component diagrams simplify the high-level view of the system. They allow to hide the internal details of components and focus on the whole

Second Person Con Notes

Creating a component diagram includes multiple decisions, difficult to decide what to include and what to exclude

Third Person Pro Notes

Component diagrams can be used to model databases (can help when designing databases)

Fourth Person Con Notes

Component diagrams are more complicated than e.g. class diagrams, the syntax takes time to learn. Also, they can be difficult to maintain and can lead to confusion because of the complexity

Moderator Summary Notes

Based on the previous arguments, there seems to be a tendency to think of component diagrams negatively. That could possibly be overturned by someone’s positive experience

Round 1 Person Challenge/Question Notes

How are component diagrams useful exactly?

Round 1 Person Comment/Defense/Answer Notes

Component diagrams can help to understand how subparts interact with each other, especially useful for large systems

Round 2 Person Challenge/Question Notes

It is rather difficult to evaluate the decision making process, having no practical experience with component diagrams

2 Best For

Point 1: The level of detail can be easily adjusted according to current needs (adaptability)

Point 2: Component diagrams allow to hide internal details and create a cleaner high-level view

2 Best Against

Point 1: Complicated to make good decisions on level of detail

Point 2: The notation requires some effort to learn, otherwise the diagrams can lead to misunderstanding and confusion

#### Fulib code and diagram generation
What was the most unexpected feature you saw me implementing and why?
In this presentation there actually wasn't anything very unexpected for me

What was the hardest part to follow and why?
It was okay to follow, better than the last in-class code demonstration

### Preparation for October 6 class
**Use Case Diagrams & Personas**

Pro arguments:
1.	Well suited for exemplifying the system from the users' viewpoint
2.  Simple to create and interpret
3.  Use case diagrams allow to describe what stakeholders exactly do (how a process goes)
4.  Beneficial in the planning phase when requirements must be captured

Contra arguments:
1.	One use case diagram has a very limited scope. In order to describe the system from many angles,
we need a bunch of use case diagrams
2.  It is possible to make even use case diagrams too complex by including too many elements and associations

**Group 1 video on pros**

What are main points I learned from movie:
-   A use case is not one diagram but one element on a use case diagram
-	Personas on use case diagrams should be highly personalized
-   When two or more use cases share functionality, this functionality should be separated to another use case

What did I like/dislike:
-   Liked the example with artists and relevant quotes used
-	Did not like the length of the video (10-15 minutes would be much better). Some speakers could have expressed themselves more concisely
and thus faster
-   Did not like the uneven audio quality (some speakers were much quieter than others)

How would the usage affect my own past, current, and potential future projects:
-	Use case diagrams could be a helpful starting point to identify optimal alternatives and to communicate system structure to stakeholders
from end user viewpoint

**Group 3 video on pros**

What are main points I learned from movie:
-	User stories are textual use case diagrams
-   Use case diagrams can be used for designing high-level tests
-   Use case diagrams can prevent poor UX design decisions

What did I like/dislike:
-	Liked that the pros were well illustrated

**Group 11 video on cons**

What are main points I learned from movie:
-	There are multiple possible causes of confusion in use case diagrams (e.g. actor names, crossing lines, extend/include
associations)
-   When gathering information for creating use case diagrams, the interviewer must be well prepared to collect
only necessary information

What did I like/dislike:
-	Liked the visuals (well designed)
-   Liked the structure (point by point with examples)

**Group 5 video on cons**

What are main points I learned from movie:
-	Personas should be based on thorough research. They are essentially archetypes of system users
-   Use case diagrams ignore the quality and performance of a system

What did I like/dislike:
-	Liked the clear argumentation

### October 6 class + lab
For whom are we building software architecture, or creating system models?
1)  software architects - they are the people who make the architecture decisions
that the system will be based on, thus they need to have a clear overview from
various angles on the desired outcome
2) initial software developers - they need to create the structure laid out by the
architecture in the first place, and in order to do that correctly, they need models
to refer to
3) customers / product owners - they play a crucial part in requirements elicitation
and are logically very interested in a functional and need-driven outcome, thus models
should be used to communicate processes and functionalities with them

After the general discussion, I would put more emphasis on software developers and a
little less on software architects, although I still think both can benefit from systems
modelling.