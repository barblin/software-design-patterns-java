The Factory pattern is a creational design pattern that provides an interface for creating objects, but allows subclasses to alter the type of objects that will be created. Here are some common uses of the Factory pattern:

- Encapsulating object creation: The Factory pattern encapsulates object creation in a separate object, which makes it easier to modify the object creation process without affecting the rest of the code.


- Supporting different types of objects: The Factory pattern is useful when you need to create objects of different types, but you want to abstract the process of object creation away from the client code. This makes it easier to switch between different types of objects without changing the client code.


- Hiding implementation details: The Factory pattern can be used to hide implementation details of the objects being created. For example, you might have a factory that creates different types of database objects, but the client code doesn't need to know the details of how those objects are implemented.


- Promoting code reuse: The Factory pattern promotes code reuse by allowing you to encapsulate object creation in a single object, which can be reused by different parts of the code.


- Providing a common interface: The Factory pattern provides a common interface for creating objects, which makes it easy to switch between different types of objects without changing the code that uses them.


Overall, the Factory pattern is useful when you need to create objects of different types and you want to abstract the process of object creation away from the client code. By encapsulating object creation in a separate object, the Factory pattern promotes code reuse and makes it easy to switch between different types of objects without changing the code that uses them.

[Give it a try](./../../../../../../../test/java/io/barblin/patterns/creational/factory/FactoryTest.java)