# Solution for Java Hometask 3

## Description
This repository contains a Java project with the solution for the Java Hometask 3.  
The project was created with the Eclipse IDE for Java Developers - 2023-09.  
The repository should be cloned and the project imported into a workspace with the wizard of eclipse.  

## Personal details
Name: Leander Hackmann  
Mat.-Nr.: 7217912

## Short description of the solution
The project contains the abstract class "Engine" that contains the attribute "serialNumber" of type String.  
The variable is defined as private and corresponding getters and setters are implemented to ensure a safe way of accessing the value.  
Also there are two constructors implemented. One witout arguments to allow an initialization with empty values and a one with arguments
to allow setting the values at initialization.  
All following classes were built like this, with private attributes, getters and setters and two analog working constructors.  
Based on the abstract superclass "Engine", three classes called "CombustionEngine", "ElectricEngine" and "HybridEngine" were created.  
All contain a to their type matching additional attribute: "displacement" in "CombustionEngine", "electricPower" in "ElectricEngine" and both in "HybridEngine".  
Inside the constructors of the derived classes, the function "super()" is called either without or with arguments, to properly initialize
the attribute "serialNumber" of the superclass.  
  
Also an additional class called "Manufacturer" with only one attribute, containing the name of a manufacturer, was created.  
After this, another abstract class "Vehicle" was created, containing a the attributes "name" of the type String and "manufacturer" of the
type "Manufacturer". There is also an abstract method called "ShowCharacteristics()" prepared.  
Inside the constructor of "Vehicle", the constructor of "Manufacturer" gets called to initialize the field "manufacturer" with an object
with an empty name when the constructor gets called witout arguments or with the supplied name, when the constructor gets called with arguments.  
From this abstract superclass, three more classes called "ICEV", "BEV" and "HybridV" are derived.
They contain an additional attribute called "engine" representing the matching engine, so in "ICEV" this attribute is of the type
"CombustionEngine", in "BEV" of the type "ElectricEngine" and in "HybridV" of the type "HybridEngine".  
Also the abstract method "ShowCharacteristics()" of the superclass "Vehicle" gets implemented to print out the number and
the corresponding attributes of the different engine types.  
  
The class "Main" contains the main method and therefore the entry-point of the program.  
First, an array of the type "Vehicle" with the length of five elements is created.  
The elements of the array are then filled with objects of the type "ICEV", "BEV" or "HybridV" containing example values.  
After filling the array, the method "ShowCharacteristics()" of all objects gets called by iterating over all elements via
a for-loop. The differences of the output show, that the different implementations of "ShowCharacteristics()" inside the
classes derived from "Vehicle" are getting called and saving the objects of different types in one array is possible because
of their shared origin.