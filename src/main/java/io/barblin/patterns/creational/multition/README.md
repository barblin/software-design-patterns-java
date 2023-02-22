The Multiton pattern is a variation of the Singleton pattern, which ensures that a class has only one instance and provides a global point of access to that instance. However, instead of having only one instance, the Multiton pattern allows for multiple instances of a class, each with a unique key or identifier. Here are some common uses of the Multiton pattern:

- Limited number of instances: The Multiton pattern is useful when you want to limit the number of instances of a class that can be created. For example, you might want to limit the number of database connections or thread pools that can be created.


- Global point of access: Like the Singleton pattern, the Multiton pattern provides a global point of access to instances of a class. This makes it easy to access instances from anywhere in the code.


- Encapsulation of instances: The Multiton pattern encapsulates instances of a class in a separate object, which makes it easier to modify the creation process or add additional functionality to the instances.


- Caching: The Multiton pattern can be used for caching instances of a class that are expensive to create. This can improve performance by reducing the number of times that instances need to be created.


- Flexibility: The Multiton pattern allows for multiple instances of a class, each with a unique identifier. This provides more flexibility than the Singleton pattern, which only allows for one instance.


Overall, the Multiton pattern is useful when you want to limit the number of instances of a class that can be created, but still need a global point of access to those instances. By encapsulating instances in a separate object, the Multiton pattern makes it easy to modify the creation process or add additional functionality to the instances. Additionally, the ability to have multiple instances with unique identifiers provides more flexibility than the Singleton pattern.

[Give it a try](./../../../../../../../test/java/io/barblin/patterns/creational/multition/MultitionTest.java)