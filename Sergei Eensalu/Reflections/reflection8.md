# Reflections of week 8

## Lecture Reflection
The lecture was in a classic format for this сщгкыу. 
ULNO also said that soon there will be some changes in the team and tasks, 
that our team will become larger. we were grouped and the teacher told everything that awaits us. 
With the team, we will have to carry out a large project that is very similar to a bank

## Lab Reflection
it was an additional lab for our small team to complete all our tasks. As usual, we met on 
Saturday morning and began to finish all that was left to be done

## Activity diagram opinion
in my opinion, activity diagrams are more suitable for implementing functions in code. Thanks to them, you can specifically see what logic should move to what place. In my thesis, I used a very large number of active diagrams.

## Group 6&2 Activity diagram props
https://www.youtube.com/watch?v=K5TLhecl1vc
- Demonstrate logic of algorithms
- Model software architecture elements
- Combine with use cases
- Parallel behaviour and multithreaded programming
- Easy to understand

## Group 8 Activity diagram  cons
https://www.youtube.com/watch?v=i9H_22RfxsU
- Not always object oriented
- Not great for complex conditional logic
- Glorified flow charts for sequential algorithms
- Stating the obvious

- In which contexts does Alberto use the term model or modeling during this presentation (try to at least find three - there are more)?
- How does Event Storming relate to the UML?
- What is the goal of Event Storming in terms of software development and understanding?
- What does Bruce Lee have to do with all this?
- optional (let's see if you can catch this): In which context does Alberto mention State Charts or State Machines (I think he mentions them only once, but pay attention)?


My team prepared the video cons of activity diagrams

## Slides text

Activity Diagram

### Slide 1
Hello, we are group 8. We are going to talk about activity diagrams and why they are useful. 

### Slide 2 (Structure of today’s presentation):
The structure of our presentation you can see on the slide. First of all Activity diagram in the UML hierarchy, next What is an activity diagram?
and their cons and in the final is conclusion

### Slide 3 (Activity Diagram in the UML hierarchy): 
In the hierarchy of UML diagrams, activity diagrams fall under the section of behavior diagrams. Along with other types such as state diagrams, sequence diagrams, use case diagrams etc., they are used to model the dynamics of a system. On the other hand, diagrams in the structure section are intended to model the arrangement of parts in the system.

### Slide 4 (What is an activity diagram?):
Activity diagrams describe how activities are interacted to provide a service which can be at different levels of abstraction. Basically that digramm is flowchart to represent the flow from one activity to another activity. 
Activity diagrams are often used in business process modeling. They can also describe the steps in a use case diagram.
Activity diagrams are graphical representations of workflows of stepwise activities and actions

### Slide 5 (Notation of activity diagram):
Activity diagrams are constructed from a limited number of shapes, connected with arrows. The most important shape types:
round-cornered rectangles represent actions;
diamonds represent decisions;
bars represent the start or end of concurrent activities;
a black circle represents the start (initial node) of the workflow;
an encircled black circle represents the end (final node).
 
Here we have an example of an activity diagram for an order processing system. At the very top, there’s a full black circle which denotes the starting point of the activity. An arrow leads from the initial node to the first action, “Receive order”. Such action symbols are the main building blocks of activity diagrams.
Below the first action, there’s a black bar with one incoming and two outgoing arrows. This is a fork symbol which means that the flow is now split into two concurrent flows. 
In the left flow, we have “Fill order” and in the right flow we have “Send invoice”, meaning that the processing system is handling these actions concurrently. 
From “Fill order”, a connector leads to a diamond-shaped decision symbol. This means that the next action depends on the condition which is described by the text on the connector.  
At the bottom, there’s another black bar with two incoming and one outgoing arrow. This is a join symbol, meaning that the two concurrent flows are again combined into one. After that, we have the final node which says that all flows are completed and the activity has ended.
In addition to the elements on this particular diagram, activity diagrams can include a number of other elements such as sent and received signals, interrupting edges, swimlanes, objects, time events, additional notes, and more.

### Slide 6
The first con of activity diagrams is that they are not always object oriented, which means that it can be unclear how activities map to underlying objects, making the diagram less useful for developers. Let’s take the student enrollment example on the right. Look at the activity Enroll in university and try to guess - which objects does this activity contain? We can guess that there might be a student object and probably department and programme, but this isn’t clear from just looking at the diagram. Although the actions are done on objects or by objects and there is a node type designated for objects, it is common to see activity diagrams with no explicit object nodes. In these cases, we can’t see how and which objects interact during the activity flow or how an object behaves over its lifetime.

### Slide 7
Although activity diagrams have the notation for conditional logic, it is still difficult to show conditional logic that is more complex than simple branching. Consider the example on the right. It displays a typical web store logic: putting products in the cart, checking out and choosing a payment method. There are 5 payment methods that differ slightly and this is how they look when forced to use the default conditional node. It gets quite messy, but the logic isn’t complicated. Maybe these conditions could be replaced with a “Choose payment method” activity, which would make the diagram simpler, but also creates one additional layer of abstraction between code and diagrams so I wouldn’t consider it a much better option. 

### Slide 8
The third con of activity diagrams is that they are glorified flow charts for sequential algorithms. Since most of the power of activity diagrams comes from displaying parallel behaviour, using them for use cases, where nothing gets executed in parallel is pointless and does not provide enough value to justify using them. Look at the example on the right. Do you need an activity diagram for explaining this process? You could fit all this information into a simple use case table, by having a main success scenario with the successful login attempt and an alternative scenario with incorrect login information, without having to waste resources on drawing a diagram. Activity diagrams are therefore redundant in these situations.

### Slide 9 
A lot of the time it is obvious what can and should happen in parallel. Just because you have a use case where something is done in parallel, doesn’t mean that you get a benefit by using an activity diagram. Consider an example where the system sends an invoice in parallel with processing an order. My guess is that the developer who will implement this feature knows by intuition that you can send the notification at the same time as the order is being processed. It is obvious and you don’t need a diagram to explicitly point that out. 

### Slide 10
In conclusion we can say that activity diagrams are not always object oriented. They don’t show complex conditional logic well and are not very useful when showing sequential algorithms. In many cases the parallel behavior displayed on activity diagrams is obvious and using the diagram doesn’t provide any value. Based on the stated cons, we can say that activity diagrams have a narrow use and since they do not map well to code, they are useful only in a complementary way.


## Slides images

![image](activity%20diagram/1.jpg)

![image](activity%20diagram/2.jpg)

![image](activity%20diagram/3.jpg)

![image](activity%20diagram/4.jpg)

![image](activity%20diagram/5.jpg)

![image](activity%20diagram/6.jpg)

![image](activity%20diagram/7.jpg)

![image](activity%20diagram/8.jpg)

![image](activity%20diagram/9.jpg)

![image](activity%20diagram/10.jpg)

![image](activity%20diagram/11.jpg)
