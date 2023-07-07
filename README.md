
# <span style="color:cyan">Singleton Pattern</span>

## <span style="color:pink">What is the Singleton Pattern?</span>

### <span style="color:lightgrey">The Singleton Pattern is a creational design pattern that ensures that only one instance of a class is created throughout the lifetime of an application. It provides a global point of access to the same instance of an object.

### In our code, the Leaderboard class is a Singleton class. It has a private constructor, which prevents the creation of new instances of the class from outside the class. The class also has a private static instance variable instance, which is the single instance of the Leaderboard class that is shared across the entire application.

### The getInstance() method is a static method that returns the single instance of the Leaderboard class. If the instance variable is null, it creates a new instance of the Leaderboard class and assigns it to the instance variable. If the instance variable is not null, it simply returns the existing instance.

## <span style="color:pink">Why is it used?</span>

### <span style="color:lightgrey">The Singleton Pattern is used to ensure that only one instance of a class is created throughout the lifetime of an application. This is useful when we need to share a single resource, such as a database connection or a configuration file, across multiple parts of the application. It also simplifies object creation by hiding the complexity of object creation from the client code.

## <span style="color:pink">How does it work?</span>

### <span style="color:lightgrey">1- Create a private constructor:
Create a private constructor for the class to prevent the creation of new instances of the class from outside the class.

### <span style="color:lightgrey">2- Create a private static instance variable:
Create a private static instance variable for the class to store the single instance of the class.

### <span style="color:lightgrey">3- Create a static method to access the single instance:
Create a public static method that returns the single instance of the class. If the instance variable is null, create a new instance of the class and assign it to the instance variable. If the instance variable is not null, simply return the existing instance.

### <span style="color:lightgrey">4- Use the single instance:
Use the single instance of the class as required by the application. In the code provided, the addScore() method is used to add scores to the leaderboard, and the toString() method is used to get a string representation of the leaderboard.

## <span style="color:pink">Why is it considered a code smell in most cases?</span>

### <span style="color:lightgrey">The Singleton Pattern can be considered a code smell in most cases because it violates the Single Responsibility Principle (SRP) and makes it harder to test and maintain code.

### The Singleton Pattern combines two responsibilities into one class: the responsibility of creating an object and the responsibility of providing access to that object. This can lead to a violation of the SRP, which states that a class should have only one reason to change. If either of these responsibilities changes, the entire class needs to be modified.

### In addition, the Singleton Pattern makes it harder to test and maintain code because it creates a global state that is shared across the entire application. This global state can introduce unexpected dependencies between different parts of the code, making it harder to reason about and test individual components in isolation.

### Instead of using the Singleton Pattern, it is often better to use Dependency Injection (DI) to provide objects with the resources they need to function properly. DI separates the concerns of object creation and object usage, making it easier to test and maintain code. It also makes it easier to swap out different implementations of a resource, such as a database connection or a configuration file, without modifying the client code.
