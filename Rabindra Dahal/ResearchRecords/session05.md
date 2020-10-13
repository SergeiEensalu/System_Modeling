# Research Records - Session 05

# Understanding from the movie resources regarding pros and cons of use case diagram and persona modeling
# Use case Diagram 
 - Use case diagram is one of the UML diagram that belongs to behavioral diagram.
 - It depicts the typical behaviour of the system.
 - It is very useful diagram because it allows us to design a system from the perspective of end user.
 - It is a powerful tool for communicating user desired system behaviour in the language of the user by specifying all externally visible system behavior.
 - Generally, use case diagram are not very detailed.
 - They contain just the central information that helps outline the following:
    - It helps to represent the goals of the system user interactions.
    - It helps to define and organize the functional requirements in the system.
    - It helps to specify the context and requirements of a system and model the basic flow of events in the use case.
 - It helps to capture functional requirements of the system.
 - Alternative paths capturing helps to reveal additional system features.
 - Help to analyze the scope of the system.
 - Powerful tools for communicating the desired system behavior in the language of the user.
 - Use case diagrams hint at scenarios that might go wrong.
 - Use cases focus on the users of the system, not the system itself.
 - Used more in domain driven modeling.
 - Very popular in story driven modeling.

# Main Components of Use case diagram
 - Boundary - It contains use case of the system.
            - The scope of a system can be represented by a system boundary.
            - The use cases of the system are placed inside the system boundary while actors who interact with the system are put outside.
 - Actor - They are the ones with roles who interact with the system. For example: Customer, User,Person etc.
         - Used to represent users of the system.
         - It can be anything that needs to exchange information with the system.
 - Use case - They are the service or functionality provided by the system. It make up the total requirements.
 - Relations - It shows the interactions between actor and the system. Actor and use cases can be associated to indicate that the actor particiaptes in that use case.
             - Therefore an association corresponds to a sequence of actions between the actor and use case in achieving the use case.
    -Types of relations : 1. Include 2. Extend 3. Generalization
        - Include Relation - They are used when one use case is needed by another inorder to perform tasks. It is represented by <<include>>.
        - Extend Relatio -  They are used when there is an alternative options for a certain use case. It is represented by <<extend>>.
        - Generalization - It is used for the one use case associated with another use case.
# Steps for drawing use case diagram
 1. Identify the actors of the system.
 2. Identify possible use cases i.e asking what actors need from the system.
    - In the library, actors need to pick up the books, returns book, get the library cards, reserve rooms and use the internet.
 3. Identify common functionality that can be reused across the system.
    - If two or more of the users use cases show more functionality then you can take the functionality and add it to separate use cases.
 4. Identify generalizations
    - We should identify whether any actors associated with similar use cases who triggers cases unique to them then you can generalize that particular actor.

# Persona Concept
 - Persona concept is about archetypical user of the system. Eg. Person who will interact with it.
 - Persona are more than a user.
 - It is a fiction that tries to define a public images of one's personality , a set of demographic sterotypes who help to solve the software architecture and 
   in design questions. 
 - Persona storm was introduced by Alan Cooper who is also known as father of visual basic.
 - If we want to design an effective software ,we have to design it for a specific person. For eg. When we develop a bank system then we can represent the 
   customer actor where customer is just a role. Mean while we will have to represent several different personas with a customer role to bring an idea to life
   by developing personas with real names personalities, motivations and often even a photo.
 - Therefore, a good persona is highly personalized .
 - Personas can be easily mismatched with actors. However, unlike actors , personas are not rules , which people say.
 - This approach is incredibly useful when you do not have easy access to real users. 
 - Flaw of averages means that plans based on assumptions about average conditions usually go wrong. So, this is where personas can help you out.
 - Actor vs persona
    - Unlike actors, personas are not roles which people play, in use case modeling actors represent the roles that users can take with respect to the system.
    - Personas are different because they describe an archetypical instance of an actor. In an use case model we would have a passenger actor yet with personas 
      we would instead describe different tyoes of passengers to help bring the idea to life.
 - Since personas is usually a specific user of a system and users of a system can also be considered as stakeholders. Creating personas can help identify stake
   holders and empathize to their point of view. Thus, persona modeling can sometimes help you overcome bad stakeholders analysis.
 - It is very important to base your personas on actual research and not just make them up because then they cease to serve their purpose.
 - Personas are concise and visual.
 - A common layout is a single page including a photograph, name and social or professional details.

# Uses of Personas
 - Good for analytics
 - Personas is the natural modern extension to use case diagram. It sheds much mor light on the stakeholders and background stories.


# Cons of Personas
 - Expensive tool i.e it takes time and money to create personas.
 - Demands a proper validation ans large sets of data.
 - Personas are not real and cannot replace meetings with real users.
 - It can be difficult to get management support.

#Uses/purpose of use case diagram
 - Specify the context of a system.
 - Capture the requirements of a system.
 - Validate a systems architecture and generating test cases.
 - Represents the users and goals.
 - Provide an outside view of the by showing eternal and internal influences.

# Pros of Use Case diagram
 - It helps to understand functional requirements.
 - We have an ability to identify to identify alternative paths that can help optimize the system.
 - Excellent bridge between software developers and end users.
    - SRS documents tend to be long pages. It is hard for non-technical people to absorb context.
    - Easier due to illustration of use cases,actors,system boundary in front of them.
 - Removes the ambiguity .i.e removes the uncertainity from the system.
 - It helps to provides hints at scenarios that might go wrong. It focuses on the users of the system, not the system itself.
 - It helps to stop the desig mistakes at early stages and save a lot of time and money of the company.
 - It will help during project planning, writing the documentation and formation of test cases.
 - Easy to use. i.e We can take a white board and a draft with stakeholders.
 - Helps design tests 
     - Black box testing
     - High level design/test.
 - List features of an app.
 - Prevents bad User Experience practice.
    - Use case diagrams show us actual functionality and we can trace the actions of particular functionality. 
    

# Cons of Use case diagram
 - Helps to visualize the user experience and functional requirements but misses out on the usuability and non functional aspects of the system.
 - Ignores the quality and performance of the system which should be important criteria when discussing the system requirements.
 - Requires significant preparation to cover a complete set of use cases of a system.
 - In actual system, there are if-else logics,loops and multiple conditions. In use case diagrams, the logic is linear and summarized.
 - The use case diagram cannot solve how many use cases are enough problem. Therefore, having too few use cases, it might not cover all things system does. Also,
   having too many use cases can cause the diagram to be unreadable. Also, the diagram might not be descriptive enough for end users and developers.
 - It is bad to plan architectural design or release iterations based on number of use cases.
 - Deriving iteration plans based on use cases can create multiple variations of classes and objects.
 - Use cases have no specific ordering. i.e. relationships between each actions are not clear.
 - It is possible that too short text can be misinterpreted.
 - When should users do use case diagrams are functional rather than object oriented and can significantly compromise the benefits of object technology if 
   blindly added at the obect oriented development process.
 - Use cases should be only one of the several ways of capturing user requirements .
 - The model of objects classes and their semantic relationships should be consistent with but not totally driven by the use cases.
 - Designers should be aware of and minimize scattering their features of use cases, objects and classes.
 - They should exercise the great care to avoid the creation of particular redundant variants of classes especially of large projects involving multiple bills and 
   releases.
 - Use case diagram are time consuming because inorder to understand the user requirements , we should take interviews, gather information from the stakeholders  
   end users.
 - It can be easily outdated. So, we should sync and be updated regularly.
 - There is a chance of false information because use case diagram are drawn based on survey, interviews etc.
 - Misunderstanding for developers(based on persona and requirements documents.
 - Costly in maintenance due to inheritance hierarchies in incremental development.
 - Easily get carried away with associations and drawing too many use cases.
 - It's minimalistic nature and not defining all actors can misinform developers about important partsof the system context. 
 - One has to provide details and consistent with level of abstractions.


# Finding
- Although use case diagram are easier to understand by stakeholders, it can consume more time and effort of developers since they should read and understand the personas and requirements documents.
