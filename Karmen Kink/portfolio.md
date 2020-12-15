# Software architecture vs code
Think and answer the following questions (and keep a digital document of this for your portfolio):
- Which types of diagrams are mentioned in the talk?
The commonly seen types that software companies tend to produce: boxes, the airline route map, the “generally true” diagrams which state the obvious, etc. Also, UML diagrams
- What is the standard for modeling software mentioned in the movie?
UML (Unified Modeling Language)
- Why is nobody using it?
Too complex, too low-level, agile developers don’t use it (although they should)
- What is the model-code gap and what is the problem with it?
The models depict different things than what the code includes. It usually comes from the fact that we organize our code with regard to classes, namespaces, etc., but we use different structures in the models.
- What do you personally think about layers for modeling software?
I think it might not always be possible to isolate the layers as the layered architecture suggests, therefore it is not the best approach every time, but there are definitely cases where it is beneficial.
- How do you think about Systems Modeling after watching this movie?
I see more benefit in modeling the architecture than I did before – the lecture made me think about how we structure our code and think about it.
- Anything else remarkable from the movie, we should share/discuss?

# September 8 class + lab
## Introduction
From Systems Modeling, I expect to learn how to reasonably structure a software development cycle, to learn about design patterns, how to create documentation that is useful (diagrams). I have created some diagrams and use cases previously, not much experience with modeling though

My name is Karmen and I’m not actually in SE Master’s but in Computer Science instead. 

*Note: did not have time to answer the rest of the personal questions*

What is software architecture?
https://codeburst.io/software-architecture-the-difference-between-architecture-and-design-7936abdd5830

“In simple words, software architecture is the process of converting software characteristics such as flexibility, scalability, feasibility, reusability, and security into a structured solution that meets the technical and the business expectations.”

Examples:
https://searchapparchitecture.techtarget.com/tip/Pros-and-cons-of-monolithic-vs-microservices-architecture

Group members: Ott Saar, Chioma Nkem-Eze, Martin Põhjakivi, Mike, Rabindra Dahal

## Concrete vs abstract
| Concrete | Abstract |
| -------- | -------- |
| Physical | Theoretical |
| Explicit | Implicit |
| Word | Meaning |
| Action | Intent |
| News article | Information |

# Preparation for September 15 class
**Object Diagrams**

Pro arguments:
1.	Concrete, allows to exemplify the structure of a system in a way that is easier to digest than an abstract diagram
2.	Well suited for representing a certain part of the system, scope can be adjusted easily

Makes sense to use for modelling the system at a particular point in time, e.g. if it is
necessary to show the initial state for some application

Contra arguments:
1.	Attributes and values might be not that intuitive for non-CS people
2.	Quite narrow is terms of usage possibilities, only meant for specifying the data structures of a system

Doesn't make sense to use for a high-level view because object diagram provides one static
view of a system

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

# Preparation for September 22 class
**Class Diagrams**

Pro arguments:
1.	The structure of the system can be represented quite comprehensively before starting development (via class attributes, relationships, types)
2.	Rather easy to maintain and update by adding, removing or editing attributes/relationships/methods

Makes sense to use for illustrating data models for any kind of systems

Contra arguments:
1.	General readability probably worse for non-developers than for developers (all the different relationships, methods vs attributes, etc.)

Doesn't make sense to make class diagrams too detailed for non-developer target audience

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

# September 22 class + lab
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

Note to self: [link](https://www.youtube.com/watch?v=OO9Hgf35S6k&feature=youtu.be) to coding part of the lecture (generating classes from code, fulib)

# Preparation for September 29 class
**Component Diagrams**

Pro arguments:
1.	Good way to visualize the relations between different parts of the system (the big picture)
2.  High-level mapping, simplifies decision-making about system structure

Makes sense to use in the implementation phase of a system (helps to model the software artifacts)

Contra arguments:
1.	Targeted towards developers, not easy to grasp for others, although meant for communication
2.  Possibly high maintenance costs

Doesn't make sense to use for simple systems where class diagrams might do the job

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

# September 29 class + lab

Domain modeling advantage: allows to show how the system would function in real life without
implementation details getting in the way
Disadvantage: introduces the model-code gap (as opposed to class diagrams)

Methods in class diagrams:
Using/including methods in class diagrams depends on whether the goal is to
model just the structure of the system, or the functionality as well. Also,
when including methods, we could limit ourselves to just the unique ones (e.g. 
excluding getters and setters) - but how to filter out the uniques?

## Note-taking log from breakout rooms:

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

## Fulib code and diagram generation
What was the most unexpected feature you saw me implementing and why?
In this presentation there actually wasn't anything very unexpected for me

What was the hardest part to follow and why?
It was okay to follow, better than the last in-class code demonstration

# Preparation for October 6 class
**Use Case Diagrams & Personas**

Pro arguments:
1.	Well suited for exemplifying the system from the users' viewpoint
2.  Simple to create and interpret
3.  Use case diagrams allow to describe what stakeholders exactly do (how a process goes)
4.  Beneficial in the planning phase when requirements must be captured

Makes sense to use for understanding and communicating user requirements

Contra arguments:
1.	One use case diagram has a very limited scope. In order to describe the system from many angles,
we need a bunch of use case diagrams
2.  It is possible to make even use case diagrams too complex by including too many elements and associations

Doesn't make sense to use when personas are not based on research

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

## Interactive exercise from group 5 video:

List of possible use cases:
1) Look for search suggestions while typing
2) Use regular search
3) Use "I'm feeling lucky" feature
4) Look for information about Google
5) Use voice search

# October 6 class + lab
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

# Preparation for October 13 class
**Sequence diagrams**

Pro arguments:
1.	Well suited for representing the behavior and interactions of parts of a system
2.  Helpful for developers, especially when different parts are developed by different groups of people
(can specify in advance how the interactions should look like)

Makes sense to use in case of large projects to ensure a global understanding of the interactions
between parts of a system

Contra arguments:
1.	One sequence diagram has limited scope (often used as a complement to a use case diagram which is
also limited)
2.  Although their goal is to provide a more low-level view of a use case, they cannot hold all
necessary details and still remain legible

Doesn't make sense to use for capturing a large part of a system at once (becomes illegible
with too many elements)

**Group 13 video on pros**

What are main points I learned from movie:
-   Sequence diagrams show objects sequentially on horizontal axis and time on vertical axis
-	Sequence diagrams are able to represent elements such as conditionals, loops, parallel execution

What did I like/dislike:
-   Liked the various message types clearly brought out and explained

How would the usage affect my own past, current, and potential future projects:
-	Sequence diagrams can be a good way to specify a use case on a lower level than a use case
diagram does

**Group 10 video on pros**

What are main points I learned from movie:
-   The most common mistakes regarding the creation and use of sequence diagrams

What did I like/dislike:
-   Liked the fun way of communicating information
-   Liked common mistakes introduced

**Group 9 video on cons**

What are main points I learned from movie:
-   Sequence diagrams are unable to represent every possible condition (would lose
readability when trying to include everything)
-   Sequence diagrams can cause problems with horizontal spacing
-   Use case + short code snippet can deliver the message better than a sequence diagram

What did I like/dislike:
-   Liked the examples on how different types of notation can cause problems

**Group 14 video on cons**

What are main points I learned from movie:
-   Sequence diagrams can become very complex when it includes a large number of parties (lifelines)

What did I like/dislike:
-   Liked clear explanation of notations

# Preparation for October 20 class

**State diagrams**

Pro arguments:
1.	Well suited for representing the behavior of reactive systems (e.g. how the system reacts to certain events)
2.  Helpful for developers for modelling the states that an object can have during its life cycle

Makes sense to use for model-checking and ensuring correctness of the system

Contra arguments:
1.	Limited in scope (not very useful for non-reactive systems)
2.  Can become difficult to read when objects have a large number of possible states

Doesn't make sense to use for communication when a very detailed view is not needed 

**Group 9 video on pros**

What are main points I learned from movie:
-   State chart is an extended version of state machine
-   UML state charts are a combination of Harel statecharts and object-oriented principles
-   State charts include entry and exit actions
-   Superstates can include several substates

What did I like/dislike:
-   Liked the argumentation for each pro
-   Liked the examples about where state charts are used (especially safety-critical real-time systems)
-   Disliked the monotonous definitions part

How would the usage affect my own past, current, and potential future projects:
-	State charts can be used for checking the correctness of the system (clean and abstract
notation for defining requirements and design)
-   Another possible use is for finding errors and exceptions

**Group 11 video on pros**

What are main points I learned from movie:
-   Self-transitions are also possible
-   State charts can help test systems according to the required transition 
and end states
-   State charts can be used for automatic code generation

What did I like/dislike:
-   Liked the terms and concepts explained
-   Liked the real-life examples of turnstiles and traffic lights
-   Disliked the varied volume of different speakers

**Group 7 video on cons**

What are main points I learned from movie:
-   Finite State Machines are not sophisticated enough for modelling complex
modern systems
-   There must be a transition for each input to a state for the diagram to be
complete
-   State explosion can happen because the number of transitions and states
multiplies when new behavior is added. To tackle this, state charts can include
parallel states, hierarchy and guards. However, this notation takes some time to learn

What did I like/dislike:
-   Liked the introduction to Finite State Machines
-   Liked the examples for each of the cons

**Group 10 video on cons**

What are main points I learned from movie:
-   Substates are used to simplify complex flat state machines (they show
that some states are only possible within some specific context)
-   State diagrams are often confused with activity diagrams
-   It can be difficult to model concurrent systems using state diagrams

What did I like/dislike:
-   Liked the visuals
-   Liked the one-by-one explanation of notation elements
-   Liked the tone of the speakers (not monotonous)

# October 20 class + lab
Are state charts better than plain (and documented) code?

I would say the two complement each other. State charts can be used to communicate the
information to less technical stakeholders who benefit more from visuals than from trying
to dig into the code. 

Why would ulno fire people who use recursion?
It can be dangerous to use recursion because the state space is unbounded
and if we have limited resources (memory), the system can crash.

# Preparation for October 27 class
**Activity diagrams**

Our group prepared the con video for activity diagrams. We had several sessions of working
together and preparing the slides and script, after which we divided the parts between
ourselves and each prepared for presenting their part. We recorded our voice clips and then
merged them with the slide show into a video.

Pro arguments:
1.	Suitable for creating an understanding of the business process (modelling the workflow)
2.  Beneficial for representing parallel and multithreaded behavior

Makes sense to use for showing the workflow of complex systems that include parallelism

Contra arguments:
1.	Do not provide additional value for sequential algorithms
2.  Not always object-oriented, thus larger model-code gap and less benefit for developers

Doesn't make sense to use in too abstract notation which cannot be mapped to code if developers
are in the target group

**Group 2+6 video on pros**

What are main points I learned from movie:
-   Different kinds of actions (normal, operation, behavior)
-   A single action is undivisible and uninterruptible
-   Distinction between active participants and passive objects

What did I like/dislike:
-   The dog / murder robot / cleaning robot example
-   Applications explained
-   Mancala activity diagram as an example

How would the usage affect my own past, current, and potential future projects:
-	Can be used for understanding the workflow, analyzing use cases

**Event storming**

Lecture by Alberto Brandolini:

- In which contexts does Alberto use the term model or modeling 
during this presentation (try to at least find three - there are more)?

1. In event storming, big picture workshops are discussions that involve people from different
areas with the aim to model an entire business line with domain events
2. When elaborating on the exploration of domain events, he again mentions the goal to model the
business line
3. He mentions models when making the point of different stakeholders having different
expectations, which entails them requiring different models as well
4. He talks about process modelling and its differences with software design, saying that
we might have a consensus on the process, but it's more difficult to achieve a consensus
on the design

- How does Event Storming relate to the UML?

It has a similar goal (to model the processes), but tries to do so in a less
notational, more intuitive way and arrive at a solution. Event storming uses domain events
as the modelling language to allow storytelling which can seem more interesting to stakeholder.
Domain events can also be looked at from different levels (can have different perspectives
from the same foundations)

- What is the goal of Event Storming in terms of software development and understanding?

The goal is to understand the domain better from collecting input from different parties as well as
external factors, and putting it all together. Having this thorough understanding (the whole picture)
and consensus, we can design and develop software accordingly

- What does Bruce Lee have to do with all this?

He says that we know the modelling session is over when we reach the Bruce Lee state -
this means that we are confident in our understanding of the model and feel like we can
take on more requirements and additional complexity

- optional (let's see if you can catch this): In which context does Alberto mention 
State Charts or State Machines (I think he mentions them only once, but pay attention)?

He mentions state machines when talking about investigating aggregates, where the focus
is on behavior and not data

# Preparation for November 3 class
**Deployment diagrams**

Our group prepared the pro video for deployment diagrams. This time we had one session
of working together as we divided the parts between ourselves earlier on and each prepared 
for presenting their part. We recorded our voice clips and then merged them with the slide 
show into a video.

Pro arguments:
1.	Helpful tool for planning the physical architecture of a system (incl. costs)
2.  Provides a quick overview of the hardware topology which is beneficial both for
communication in the planning phase as well as later support and maintenance

Makes sense to use whenever architecture-related decisions need to be made or communicated

Contra arguments:
1.	Possibly unnecessary for simple systems
2.  In some cases, more flexible alternatives might suit better

Doesn't make sense to use when a simplistic high-level overview with little details is needed
(free-form diagrams might do the work as well or even better)

**Group 4 video on cons**

What are main points I learned from movie:
-   There is a separate stereotype <<security>>
-   1-n connections are not allowed? (I'm not sure about that because I did see cardinality
being used in some sources)

What did I like/dislike:
-   The first con was again about difficulties with understanding the diagrams,
which is the case with any modelling type if not thought through enough
-   Mixed abstraction levels (software-hardware) were mentioned as a con, 
while one of the main points of the deployment diagrams is to show where 
software artifacts are deployed in hardware
-   The Mancala example was quite a far stretch in my opinion - usually objects are
not represented like that on deployment diagrams. Instead, artifacts are shown, which
are like the "products" that the software program creates, e.g. there might be mancala.exe,
gamelog.txt, or filenames of the classes, and the diagram should show where these 
artifacts are deployed

How would the usage affect my own past, current, and potential future projects:
-   I believe that deployment diagrams are one of the most straightforward ones in the
UML hierarchy with direct benefits in most cases (unless the system is very simple,
which is rarely the case)

# November 3 class

Leaders and task examples:
1. Product owner - ensure coherent understanding of required functionality among team members
2. Scrum master - choose a tool to use for project management, add the team, give instructions
for using this tool; keep track of time limits during meetings
3. Architecture owner - review code produced by developers in terms of adhering to agreed
design patterns and architectural decisions

# Preparation for November 10 class

Reading the SDM paper:

One point that I'd like to see respected
from this paper in our own story modeling session in the next lab:

Providing example data for story steps - I agree with the paper in that this is
an intuitive way for the stakeholders / domain experts to describe the data that is being
handled in a high-level manner. It also helps developers when creating a data model later.

# November 10 class

Why do we want/need design patterns?

Using design patterns creates some common features (best practices) that are expected
from well-written code. This increases code reusability, maintainability, and creates
standards.

# November 17 class

Guest lecture by Marlon Dumas:

**One of the most important application domains for BPM:**

BPM could be very well suited in cases where it is crucial to have a fully
functioning flow of processes, e.g. booking appointments in a medical centre,
where each customer needs to be appointed a time as efficiently and
conveniently as possible.

**Where in this class would BPM be feasible?**

BPM could easily be integrated into our banking-related course project. It
could also be introduced when discussing activity diagrams, and the two could
be compared.

**How does BPM relate to flow-charts, activity diagrams, and statecharts?**

BPM has its own notation called Business Process Model and Notation (BPMN). It
allows to model a process using four core elements: activity, event, gateway, and
sequence flow. These elements are very similar to these of UML activity diagrams
and statecharts. The BPMN standardized notation is used more than UML activity 
diagrams for process modeling nowadays.

**Would it be easier to hand-code business processes than to model them?**

I still think that in case of complex systems, especially when several groups
of developers are working on different subparts of the problem, modelling the
system in a more low-level manner can be very helpful to ensure that all persons
involved are working towards the same goal and have the same bigger picture in mind.

**Visitor design pattern**

1. Problems/annoyances: creating new classes would be less convenient when using
visitor patterns, because then a new visit method would need to be added to each
visitor.
2. Example for bank project: we might benefit from the visitor pattern for adding
operations to 
3. What did I think about the example? - I found it interesting and could not
identify problems at first on my own. This is probably due to my not too large
Java coding experience.

# November 24 class

**Observer design pattern**

1. Problems/annoyances: forgetting or failing to deregister observers from a subject
2. Example for bank project: notifying users of incoming transactions
3. Example for other use cases: could be used for any scenario where users need to be notified
e.g. of a system update

**Command design pattern**
1. Problems/annoyances: can introduce more complexity into the code
2. Example for bank project: could use commands for creating transactions at some later point
in time
3. Example for other use cases: queuing commands and executing in a batch at a later time

**Preparation for Ncameo presentation**
1. What is Ncameo? 

Ncameo supplies solutions for digital transformation in logistics,
business operations, public sector, e-commerce and collaboration tools.

2. What are their services? 

They offer pre-built application that do not require coding
from the client's side. The clients can drag and drop components to create custom applications.

3. What are my expectations to them regarding Systems Modeling? 

Since Ncameo creates templates, not complete custom solutions, I would expect them to put quite a
 lot of effort into modeling the various different use cases in a detailed way, because they need
 to ensure that the components are relevant and that nothing crucial is missing.

**Ncameo presentation**
1. Most impressive/insightful aspect in Ncameos history and work: 

I found it interesting that
they don't divide their work into back-end and front-end, their developers work with the whole
tool end-to-end. 

2. Question regarding modeling elements in their practice: 

How does Ncameo approach systems
modeling in general? How do they decide on new templates and elements, how are (possible)
user requirements modeled?

3. How can Ncameo's no-code environment be helpful in our course project? 

Probably we could come up with a simple banking application much faster when using Ncameo's no
-code environment

4. Other:

# December 1 class

**Singleton design pattern**
1. Problems/annoyances: a singleton is essentially a global variable, independent of the state
of the program; needs to be treated with care when using multithreading (otherwise it could happen
that a singleton is still created more than once)
2. Example for bank project: maybe database connection?

**Factory design pattern**

*no discussion*

**Fulib on steroids**
1. How did you like working with Fulib in beginning of this class?
3

2. Explain your choice (why/what did you like, what did you dislike and why).
I didn't really know what to expect of it and it took a bit of time to understand its
advantages (being quite a systems-modeling-distant person until this course).

3. Which feature looks exciting for you to revisit using Fulib in a software modeling environment?
The mockups feature, since I didn't know previously that Fulib has it.

4. Write down one example where the use of Fulib would have simplified your work with your current final project.
I actually have used Fulib for the final project already. I used it to generate classes along
with the class diagrams. I found it to be very helpful for generating the class methods that
respect bidirectional referential integrity. However, I was not able to use the automatically produced
diagrams, because the formatting made them unusable (texts were overlapping with each other).

5. What are your two main reasons why you are not using Fulib anymore or would not use it again?
I wouldn't exclude using Fulib for other projects. It is useful for code generation and sometimes
for diagrams as well, but needs more flexibility for the latter.

6. Write down at least one point that you would like to see change to make Fulib more attractive 
for (students in) systems modeling?
I'd like the generated class and object (and possibly other) diagrams to be more flexible - i.e., it should
be possible to relocate elements on the diagrams and improve formatting manually where necessary. 
It could also support other languages than Java (e.g. Python), and have more complete documentation.

7. Would you have liked to do more work with Fulib to explore based on what you have seen right now?
Yes

8. Other particularities you spotted and want to share.

# December 8 class
**Summary of design patterns by Ishaya**

Top 2 design patterns:

1. Decorator pattern. I think decorators are a neat way to dynamically add 
functionality to objects without directly changing the underlying class
2. Builder pattern. I think builders can be very useful for creating objects
of classes that have many attributes and where otherwise a multitude of different constructors would 
be used

**Systems Modeling in Real Life by Adam Malik**
1. What was most impressive, particular, insightful in Adam's history and current way of work?

From his description, the last project he worked on (ERP in medical domain) sounded hectic and very
challenging (he mentioned no modularity, no possibilities for version control or testing). Also, 
the huge Miro board was impressive.

2. One question regarding architectural or modeling elements in his work

How long have you been working on the Miro board?  Which other modeling techniques have you tried?

3. What is Adam's opinion on No-code frameworks/development and do you share it or oppose it? Why?

He thinks that No-code frameworks are quite limited - when you need something extra, there will be
problems. I have the same feeling and I think that if you have a large and complex systems which
 needs to be flexible and extendable, then No-code is probably not a good choice.

4. What is Adam's opinion on modeling and working with modeling in the university context, what
 role did this play for his future career? Do you share or oppose his opinion - why?
 
Not sure if this is explicitly "in the university context", but I understand that Adam believes
that software and its parts need to be understandable, otherwise it will be discarded at some
point because it cannot be updated if it is not understood. He doesn't use UML, but uses other
techniques that actually have the same purpose. He says that the times he did use UML in
university taught him to think on a more abstract level and structure the systems.
 
5. Optional: any other question/remark

# December 15 class
**Final project presentations**
1. team1_11_7: liked the impressive operator work and visuals. did not like (that much) the 
   color scheme of the application (some numbers and texts were hard to read), and felt like the 
   long transaction ID-s and account numbers cluttered the visuals and made the process of 
   actually making the transaction rather cumbersome
   
2. team2_6_8: my own team

3. team3_12: liked that they used python and liked the thorough explanations. did not like the 
   layout of the video - it 
   would have 
   been better to watch if 
   the 
   mobile window was cut out of the browser window (as it was, the text was too small and the 
   space was wasted on the black background). since the presentation was shown straight from 
   pycharm, the user stories could have at least been illustrated a bit
   
4. team4_9: it was interesting to see the similarities between our own and their solution 
   (technologies used and components in the system). liked the user interface (the best so far 
   in my opinion) and their unique feature which is logical and useful. also liked how they 
   brought out the challenges and that they actually created subteams
   
5. team5_10: liked that they showed their people in the video. in a web-based course like this 
   where most of us don't even know how our team members look like (as was mentioned in one of 
   the videos), it's always nice to see real people. also liked the interface - readable, nice 
   (even some emphasis put on design, it seems). the unique feature was interesting but porbably 
   too time-consuming to actually be put to use. catching visuals in the presentation. the 
   presenter was very skilled with using his voice - the presentation could have been much drier
   if it wasn't for the good narrator
   
6. team13_14: liked the user interface and that transactions include descriptions (I feel like 
   most of the teams actually forgot about or knowingly ignored this feature). also liked that 
   they used transaction codes very similar to ours. the unique feature was also distinguishing, 
   as no other team implemented currency conversion.  