# Matching exercise

* Allowed object diagrams:  A, C

B is not allowed because an object of class C is associated with two objects
of class B which is not allowed according to the 0...1 cardinality association
on the class diagram. D and E are not allowed because objects of class C
are associated with another object of class C which is not documented on the class diagram.

* Invalid elements: diagram B: c connected with two B objects, D: c and c2; E: c and c2

* On diagram A, link between c and b1 should be "has". On diagram B, the link between b1 and b2 could be labelled with "contains",
and between c and b1 "has", between c and b2 "has". On diagram C, link between c and b1
should be "has". On diagram D, link between c and b1 should be "has".

* Object diagram confirming to the given class diagram:

# Table and things
Object diagram:

Class diagram:

# Mancala
The following class diagram depicts the classes of a Mancala
game - Player, PebbleContainer, House, and Bucket. House and
Bucket both inherit from PebbleContainer. The aggregation
between Player and House is one to one, meaning that one player
can have exactly one house and one house can belong to exactly
one player. The aggregation between Player and Bucket is one to six,
meaning that one player can have exactly six buckets and one
bucket can belong to exactly one player.

![image](images/lab3mancala.png)