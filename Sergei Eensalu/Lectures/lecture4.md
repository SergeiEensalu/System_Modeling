# Lecture 4


### What do you this is the advantage of "Domain modeling" vs Class and Object modeling?

With domain-driven design, everybody uses the same vocabulary and terminology and shares a model with the team.

If the behaviour or data flow can change in the future, the whole diagram may need to be remodelled, so might be expensive to maintain its integrity

Domain model is more abstract (no attributes and properties) so it could be more simple to read and easier to understand a system (also quicker).


### What will be confusing here and lead to bad design?

We could confuse this way of modeling with class and object modeling. We are going to mix these three and get something not so understandable.


## Methods in Class Diagrams

### What about them? Do we want to "quack" and "poop"?
### Data odeling vb  functionality/business logic modeling?
### Do we want methonds unrealated to data mdoeling?
### Why?



## Breakout Group Nr 4


### First Person Pro Notes
Component Diagram is useful when we have to make design of some device, which has input output socket e.g. Camera, Mobile phones.

### Second Person Con Notes
It is impossible to show unmet requirements, like a missing component, so you just need to keep them in mind.

### Third Person Pro Notes
Allows a senior developer to group classes together based on common purpose so that the developer and others can look at a software development project at a high level

### Fourth Person Con Notes
The diagrams are very technical and difficult to understand unless you have a technical background. They are also difficult to model correctly, because there are a lot of different ways to represent the same relationships between components

### Moderator Summary Notes
--

### Round 1 Person Challenge/Question Notes
Do component diagrams need to have information about if the component is already implemented in code?

### Round 1 Person Comment/Defense/Answer Notes
It would be better to have this kind of information, but component diagrams are not meant to be representative of this. They only give the implementation details and not the status of their implementation

### Round 2 Person Challenge/Question Notes
Why are component diagrams useful for physical devices?

### Round 2 Person Comment/Defense/Answer Notes
Physical devices have inputs and outputs. Sockets specifically are more often found in physical devices. These diagrams are quite representative of how a physical hardware system looks like

### Round 3 Person Challenge/Question Notes
Is the component diagram just a less specific version of a circuit diagram?

### Round 3 Person Comment/Defense/Answer Notes
It is possible to see them as a more abstract representation of circuit diagrams, if used in the context of physical hardware. However, component diagrams can be used for more than just hardware and can be used to model software components too.


### Free discussion to find best points for and against
Maybe component diagrams are better for functional programming languages and front-end javascript libraries, but class diagrams more relevant for OOP languages?

It’s hard to see component diagrams be useful for bigger systems, since they are a bit too confusing.

These component diagrams make little sense for smaller systems. They are relevant only for larger systems with many components interacting with each other.

### 2 Best For
Point 1: Component Diagram is useful when we have to make design of some device, which has input output socket e.g. Camera, Mobile phones.

### Point 2: Allows a senior developer to group classes together based on common purpose so that the developer and others can look at a software development project at a high level

### 2 Best Against
Point 1: It is impossible to show unmet requirements, like a missing component, so you just need to keep them in mind.

### Point 2: The diagrams are very technical and difficult to understand unless you have a technical background. They are also difficult to model correctly, because there are a lot of different ways to represent the same relationships between components




