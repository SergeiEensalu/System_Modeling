# Research Records - Session 04

# Understanding from the movie resources regarding pros and cons of component diagram
# Component Diagram 
 - Software objects categorized into larger components. A component represents a modular part of a system that encapsulates its contents and whose manifestation is replaceable within its environment.
 - It breaks down the actual system under sevelopment into various high levels of functionality.
 - Simplify high order view of a large system.
 - More modular i.e component can be interchanged and be used.
 - Components diagram composed of three parts:
   -Components
   -Interfaces
   -Ports
  - Interface Type
     -Provided Interface -> are set of public attributes and the relations must be provided by one of the component they are attached.
     -Required Interface -> are set of public attributes and the operations that are required by the component they are attached to.
 - Components can be wired together using interfaces to form subsystems with the use of a pole and a chocolate joint.
 - A port is an interaction point between a component and the surrounding environment. Ports are represented using a square in the border of a component.
 - Component diagram are represented by <<component>> keyword.

 # Subsystems in component diagrams
  - In essence it is a big component comprised of other components and interfaces.
  - Inherits the rules of a component .
  - The key difference is that a subsystem notation element has the keyword of <<subsystem>> instead of <<component>>.

# Uses
 - It can be used to create a roadmap for implementation of the system.
 - It can be used as communication tools between developer and the first stakeholder.
 - It helps to show the inter-relationships to interface.
 - It helps to model the components of the system.
 - It helps to model schema of database.
 - It helps to model the applications of an application.
 - It helps to model the system's source code.

# Five easy steps to draw component diagram
Step 1: We should figure out the purpose of the diagram and identify the artifacts that we need to represent in our diagram.
Step 2: After identification of relationship between the elements, create a mental layout of component diagram.
Step 3: When we draw the diagram, we should add component first and then group them within other component.
Step 4: Add other elements such as interfaces, dependencies etc. to the component diagram and complete it.
Step 5: Attach notes on different parts of your coomponent diagram to clarify certain details to others.


# Pros of component diagram
 - Useful to understand the system i.e main components of system, how system is decomposed ,how do these components interact with eachother from the static viewpoint of the services(interfaces) that they provide and require.
 - It simplify the high level view of the system.
 - It supports reverse engineering.
 - It is like a selfie of the software architecture. If we make and keep it beautiful, it will increase the quality of the software and reduce the costs of maintenance.
 - It portrays the organization of the components inside the system.
 - Helps to understand the code 
    -Give an overview of the systems components and how they relate to one another.
    -Help developer understand the exact behaviour that each piece of the software provides.
 - Good for wide range of applications.
    -Can describe software systems that are implemented in different architectural styles.
    -They are not programming language specific.

# Cons of class diagram
 - Component diagram paradigm are difficult to represent dynamic system that have to adapt updating conditions and applied solutions might solve the problem by introduciing the complexity.
 - Component diagrams are neither abstract nor the real systems.
 - Not usable to show component diagram to stakeholders who donot know it.
 - Component diagram donot have enough information for implementing stuff. so, we should take help from object and class diagram to implement.
 - More complex, more noisy and difficult to read.
 - In simpler systems, class diagram might be enough.
 - Hard to do well i.e. what details to show and what to hide. It is easy to provide too many irrelevant details.
 - Impossible to show unmet requirements.
 

# Finding
- Component diagram are difficult to understand and design so we should go for component diagram for larger system only. The smaller system are understandable via class diagram also.
- Stakeholders should have knowledge of UML diagram to uderstand component diagrams.
