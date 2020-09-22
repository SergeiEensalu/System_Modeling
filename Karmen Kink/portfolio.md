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


