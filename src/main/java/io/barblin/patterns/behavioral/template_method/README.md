The Template Method pattern is a behavioral design pattern that defines the basic structure of an algorithm in a superclass, but lets subclasses override specific steps of the algorithm without changing its overall structure. Here are some common uses of the Template Method pattern:

- Reuse of code: The Template Method pattern promotes code reuse by allowing the base class to define a common algorithm for a family of related classes. Subclasses can then implement their specific parts of the algorithm without having to duplicate the common code.


- Encapsulation: The Template Method pattern encapsulates the overall algorithm in a single method, which simplifies the implementation and maintenance of the code. This also helps to ensure that the algorithm is consistent across all subclasses.


- Flexibility: The Template Method pattern provides a framework for creating similar but different algorithms. By using the same basic algorithm structure, different subclasses can implement the algorithm in different ways to achieve different results.


- Extension: The Template Method pattern allows the algorithm to be extended without changing its overall structure. New subclasses can be added to the family of related classes to extend the algorithm's functionality.


- Polymorphism: The Template Method pattern leverages polymorphism to provide a consistent interface for a family of related classes. This allows clients to interact with the classes using a common interface, making the code more flexible and easier to maintain.

Overall, the Template Method pattern is useful when you have a group of related classes that share a common algorithm, but have some variations in the way that the algorithm is implemented. By encapsulating the algorithm in a template method, the pattern promotes code reuse, encapsulation, flexibility, extension, and polymorphism.

[Give it a try](./../../../../../../../test/java/io/barblin/patterns/behavioral/template_method/TemplateMethodTest.java)