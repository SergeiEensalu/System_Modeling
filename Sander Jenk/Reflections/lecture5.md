# Lecture 4
## Homework
### Group 1 use case diagram movie
1. Strongest argument  
Help understand functional requirements; bridge between software developers and end users
2. Movie Thoughts  
The example was a bit long and there wasn't a need for it.
### Group 3 use case diagram movie
1. Strongest argument
Easy to use; Helps design tests
2. Movie Thoughts
I'm not sure if I agree with the "prevents bad UX" pro. Doesn't really make sense
### Group 11 use case diagram movie
1. Strongest argument
Time consuming; Getting needless data(?); Easily outdated; False information
2. Movie Thoughts
I don't really agree with many of the points in this movie. Most seem to be problems if the diagrams are really badly done, but I think these diagrams are not that hard to make or maintain and they are understandable for everyone and difficult to misinterpret
### Group 11 use case diagram movie
1. Strongest argument
Persona modeling is expensive; doesn't display non functional aspects; logic and linear which;leaves details out; 
2. Movie Thoughts
I agree with the fact that persona modeling is expensive and time consuming. I don't agree with the leaves details out (point about code having loops and if-else statements, that are not displayed in the diagram), it is not supposed to be that detailed
### Personal thoughts about the component diagram
1. Personal pro  
I think that the main pro is that it is a good high level diagram, that is understandable for users and non-technical people
2. Personal con  
It can get visually messy, when you have extended use cases and extended actors etc and a lot of use cases, lines tend to overlap etc
3. Makes sense to use  
Makes sense to use when explaining the system to non-technical people
4. Doesn't make sense to use  
If you don't need a high level diagram and if the target audience for the diagram are developers only etc.

## Lecture
### Survey
1. initial developers - because I think the diagrams are most valuable as a basis for initial development
2. software testers - I think testers have to know the system as well as anyone and diagrams probably help them a lot, developers are capable of working in a "bubble" (take a task description and just figure stuff out without understanding everything)
3. maintaining software developers - they are probably involved with the project in a later stage and it probably comes in handy to have diagrams around to introduce the system to new developers and just for developers to look stuff up

* I think we basically agreed 
### Breakout, component diagram diagram, group 5
* I provided a pro: use case diagrams are understandable for both developers and non technical people. 
* I also provided a con that it can get visually messy in bigger systems and with a lot of lines and include/extend relations which was challenged with a point that said to just implement multiple diagrams for different parts of the system, which I considered a good solution. 
* I also argued against a point that it is difficult to update these diagrams. I think they are quite easy to update since updates don't usually come in huge chunks and it is a relatively simple diagram.

### Feedback for the lecture
Again, no criticism for todays lecture, it was interesting. Also our breakout went very smoothly and there were a lot of good points. Survey was also interesting, especially because there were a lot of different opinions, which was surprising. As always, the coding example is too technical for this course and for people who haven't worked with java or python a lot.

### Group 5 exercise (thanks a lot, group 5 😠)

| Use case              | Answers to natural language questions                                                                             |
|-----------------------|-------------------------------------------------------------------------------------------------------------------|
| Actor                 | User                                                                                                              |
| Preconditions         | Search page is opened                                                                                             |
| Postcondition         | First section of the search contains answer to the question                                                       |
| Main success scenario | User googles "what is the capacity of emirates stadium" First section of the loaded page contains answer "60,260" |
| Alternate scenario    | User googles "How annoying is Group 5"  First section of the loaded page contains answer "Very annoying"                   |


| Use case              | Search for places                                                                                                                                  |
|-----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------|
| Actor                 | User                                                                                                                                               |
| Preconditions         | Search page is opened                                                                                                                              |
| Postcondition         | First section of the page includes most relevant places to the search with google maps links                                                       |
| Main success scenario | User googles "telliskivi restaurants" First section of the loaded page contains restaurants: Lendav Taldrik, F-hoone and their links to google maps |

| Use case              | Search for website                                                  |
|-----------------------|---------------------------------------------------------------------|
| Actor                 | User                                                                |
| Preconditions         | Search page is opened                                               |
| Postcondition         | First answer is the website, that matches the search most precisely |
| Main success scenario | User googles "github" First answer is for the site "github.com"     |