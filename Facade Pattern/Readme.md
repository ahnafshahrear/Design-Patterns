## Facade Design Pattern
- **[Ahnaf Shahrear Khan](https://github.com/ahnafshahrear)**
- **Computer Science & Engineering, University of Rajshahi**


### Description
- **It is a structural design pattern.**
- **Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system.**
- **The Problem: As systems or parts of systems become larger, they also become more complex. This is not necessarily a bad thing – if the scope of a problem is large, it may require a complex solution. However, client classes function better with a simpler interaction. The façade design pattern attempts to resolve this issue by providing a single, simplified interface for client classes to interact with a subsystem.**
- **A façade is a wrapper class that encapsulates a subsystem in order to hide the subsystem’s complexity; it acts as a point of
entry into a subsystem without adding more functionality in itself. The wrapper class allows a client class to interact with the subsystem through the façade.**
- **This can be explained through a number of steps:**
  - **Design the interface.**
  - **Implement the interface with one or more classes.**
  - **Create the façade class and wrap the classes that implement the interface.**
  - **Use the façade class to access the subsystem.**


### Class Diagram
![](FacadePatternClassDiagram.png)
