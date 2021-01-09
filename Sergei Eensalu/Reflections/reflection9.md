# Reflections of week 9

## Lecture Reflection
Ulno again talked about the project that we have to do. This project is not just writing code, in this project it is required to follow all the rules of software development, starting from planning, creating all diagrams, roles in a team, sprints, implementing a front end and testing and the application must work in both the desktop and mobile versions.
I'm a little scared
## Lab Reflection
in this practice we started working in a large new group. We assigned roles and worked together actively on event storming

### Scrum roles 
Architecture owners do: 
- Facilitate creation of the architecture
- Coach other team members
- Mentoring team members in organizational architectural guidance and roadmaps 

Scrum master do: 
- Clearing obstacles
- Establishing an environment where the team can be effective
- Addressing team dynamics
- Ensuring a good relationship between the team and product owner as well as others outside the team
- Protecting the team from outside interruptions and distractions.

Product owner do: 
- Defining the vision
- Managing the product backlog
- Prioritizing needs
- Overseeing development stages
- Anticipating client needs

## Deployment diagram opinion
Deployment diagrams are important for visualizing, specifying, and documenting embedded, client/server, and distributed systems and also for managing executable systems through forward and reverse engineering.
A deployment diagram is just a special kind of class diagram, which focuses on a system's nodes. 


My team prepared the video cons of deployment  diagrams.

Video: https://www.youtube.com/watch?v=MCfVisq2csc&t=441s
## Slides text


### Slide 2:
A deployment diagram is a UML diagram type that shows the execution architecture of a system, including nodes such as hardware or software execution environments, and the middleware connecting them, so in short: how software and hardware work together

### Slide 3: 
Deployment diagrams belong to the branch of structural diagrams in the UML hierarchy, since they are used to describe an aspect of the system’s structure.

### Slide 4:
During this presentation, we will first walk you through the elements that make up deployment diagrams, and their notations. Then we will provide some guiding questions that might be helpful when creating your own deployment diagrams. Next, we will introduce an exemplary deployment diagram for inspiration. After that, we will bring out the many benefits that using these diagrams brings. Finally, we will shortly recap the main points.
### Slide 5:
In this section we will cover all the notations in deployment diagrams like nodes, artifacts, deployment specifications and different relationships between them.
### Slide 6
The first notation we will cover is nodes. Nodes are deployment targets with computational resources upon which artifacts may be deployed. We will get to what artifacts are in a later part of the presentation. There are 2 types of nodes in the deployment diagram universe: Devices and execution environments. They are depicted as three dimensional shapes or as images in some cases. Database nodes can be displayed as cylinders. Device represents a node that exists physically and contains computational resources with processing capability like an application server, database server computer or a mobile phone. On the diagram they should have the device stereotype written on them like shown in the first example. Execution environments on the other hand offer execution environments for artifacts that are deployed on them. Surprising, right? The stereotype for them is optional.

### Slide 7
Nodes can exchange messages and signals with each other via a communication path, which is an association between 2 nodes. The connection type can be specified but this association should not contain any information about the data being transmitted. Since devices are physical deployment targets, they can be connected with a physical connection, for example Ethernet, like shown on the left. For execution environments the protocol can be displayed, like in the other example.
### Slide 8
We have made our way to artifacts. An artifact is an UML classifier that represents some physical entity, a piece of information that is used or is produced by a software development process. Artifact is a source of a deployment to a node. So to put it simply:  A particular artifact instance is deployed to a node instance. Artifacts can be text documents, source files, scripts, libraries and executables. They are displayed as rectangles with a page icon on the top right corner and that can be marked with the artifact stereotype. There are many more specific standard stereotypes defined for artifacts in the UML language, like file and subclasses of file like script and library. 

### Slide 9 
And now the most important part of the deployment diagram - the deployment itself! A deployment is a dependency relationship which describes allocation or deployment of an artifact to a deployment target. Deployment could be shown as a dependency that is drawn from the artifact to the deployment target and is labeled with the «deploy» stereotype. Another way is shown on the bottom right, where an artifact is drawn inside a node. Thirdly you can just list artifacts inside a node. 

### Slide 10
Deployment specification is an artifact that specifies a set of deployment properties of an artifact that is deployed on a node. So it is a general mechanism to parameterize a deployment relationship, as is common in various hardware and software technologies. Deployment specification is rendered as a rectangle with <<deployment spec>> stereotype and it can contain an optional list of deployment properties. Deployment specification can implement the deployment specification properties at instance level, which means that their properties contain actual values. In this case the deployment specification is called deployment descriptor.

### Slide 11
There are 2 ways to display deployment specifications. They could be displayed using a regular dependency arrow pointing to a deployed artifact like shown on the bottom left example. Another way is to associate the deployment specification with the deployment, so connecting a dotted line from deployment spec with a deployment arrow. This is shown on the example on the right.

### Slide 12
Manifestation is an abstraction relationship which represents a concrete implementation of one or more model elements by an artifact or utilization of model elements in the construction of the artifact. So an artifact manifests one or more model elements. It is displayed with a dotted arrow from an artifact to a packageable element. Note that artifacts can manifest any packageable elements, not just components. Other examples would be classes, use cases, packages and so on. Manifestation is marked with <<manifests>> stereotype but other forms of manifestations can be indicated with different stereotypes, <<tool generated>> for example.

### Slide 13
Now that you are familiar with the elements and their notation, here are some guiding questions for you to consider when creating your own deployment diagrams. It would be a good idea to think about the scope of your system, which distribution architecture will be used, how robust the system needs to be, how it will be monitored, and what are the security requirements. This list is of course not exhaustive and there might be many more relevant aspects depending on your application

### Slide 14
The deployment diagram shows the structure of the runtime system
In the example you can see the Student Administration deployment diagram. 
This deployment diagram contains four nodes: Web Server, Application server and Mainframe and database with name University Database. Physical nodes labeled with the device name , to indicate that it's a physical device such as a computer or switch. 

Connections between nodes are represented with simple lines, and are assigned сommunication lines such as RMI and message bus to indicate the type of connection. Software on the web server is communicating via the RMI protocol over the connection to the software on the application server. 

Nodes can contain other nodes or software artifacts, in our case ApplicationServer node contains software node EJBContiner, where software elements are simply listed by their physical filenames.Developers are very interested in information that in this form

Database nodes are visualized as a drum, making it easier to distinguish on the diagram. 

### Slide 15
Deployment diagrams are very valuable for making architecture-related planning decisions. The aspects that require consideration when creating a deployment diagram, such as the scope of the system, legacy systems it needs to interact with, the distribution of nodes, response time requirements, etc., help to understand what is needed and find cost-efficient ways to deliver what is needed. Modeling these aspects of a system is a valuable tool for system architects aiming for performance, scalability, maintainability, and portability. Needless to say, considering these aspects from the beginning makes it much more likely for the system to meet business requirements such as the increasing number of users, response times, etc.
Deployment diagrams can even be used to approximate the required budget in terms of hardware requirements. This allows us to get realistic estimates early on and communicate them between the stakeholders.

### Slide 16
Deployment diagrams provide a good overview of hardware devices, software artifacts and their relationship in the deployment process. In the system of UML diagrams, this is the only diagram type that aims to specify the physical devices and instances used in a system and models their interactions. Component diagrams are their software-oriented counterpart - deployment diagrams are intended to show how these components are deployed in hardware. As such, deployment diagrams provide a convenient overview of the system’s hardware topology. This overview is also beneficial at later stages, e.g. for supporting or maintaining the system.
As an additional benefit, the nodes on a deployment diagram need not be limited to the internals of a system. External parties can also be shown if the system needs to interact with them. This further broadens the view and provides valuable information for system architects.

### Slide 17
Deployment diagrams bridge the knowledge between software developers and system engineers/administrators. They are designed to model many of the hardware aspects of a system sufficient for a software engineer to specify the platform on which the system's software executes and for a systems engineer to manage the system's hardware/software boundary.

### Slide 18
Deployment diagrams do not introduce a model-code gap as they do not focus on the logical components of the system. In terms of abstraction, deployment diagrams are closer to the physical level than other types of diagrams, and can be more directly used by stakeholders in decision-making and engineering. Therefore, there is less risk of misunderstandings and miscommunication coming from different people interpreting the same diagram in different ways.
Most of the UML diagrams are used to handle logical components but deployment diagrams are made to focus on the hardware topology of a system. Deployment diagrams are used by the system engineers.

### Slide 19
As the mentioned pros suggest, deployment diagrams have a wide range of applications. They can be used to assess the implications of distribution and resource allocations, provide a topology of hardware, plan the architecture of a system, including hardware costs and security aspects, and describe which hardware components deploy which software components.


[Sergei Eensalu README](/Sergei%20Eensalu/README.md)
