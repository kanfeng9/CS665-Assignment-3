| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Zhiling Li                 |
| Date         | 03/05/2024                 |
| Course       | Spring                     |
| Assignment # | 3                          |

# Assignment Overview

## Project Description

This project implements an Email Generation application designed to send personalized emails to different segments of customers including Business, Returning, Frequent, New, and VIP customers. The application showcases the use of Object-Oriented Design Patterns, specifically the Factory Method, to create customer objects of various types and generate tailored email messages based on the customer segment.

### Features

- **Customer Type Differentiation**: Implements separate classes for each customer type (Business, Returning, Frequent, New, VIP) to handle personalized email generation.
- **Personalized Email Generation**: Generates customized email content for each type of customer, enhancing the user experience and engagement.
- **Extensible Design**: The design allows for easy addition of new customer types and personalized messages without altering the core logic.

### Implementation Details

- **Customer Classes**: Abstract `Customer` class with derived classes for each customer type, each overriding a method to generate a personalized email message.
- **Factory Class**: A `CustomerEmailFactory` class to encapsulate the logic of creating customer instances based on type.
- **Unit Testing**: Comprehensive JUnit tests to verify the functionality of personalized email messages for each customer type.

## Code Structure

- `customer` package: Contains the `Customer` abstract class and its subclasses (`BusinessCustomer`, `ReturningCustomer`, `FrequentCustomer`, `NewCustomer`, `VIPCustomer`).
- `CustomerType` enum: Defines the types of customers supported by the application.
- `CustomerEmailFactory` class: Implements the Factory Method pattern to create instances of customer subclasses.
- `EmailGenerationTest` class: Contains JUnit tests for verifying email message generation logic.

## Conclusion

The Email Generation application successfully demonstrates an efficient solution for sending personalized emails to various customer segments. By leveraging design patterns and object-oriented principles, the application achieves a high level of modularity, extensibility, and maintainability.



# GitHub Repository Link:

https://github.com/kanfeng9/cs665-assignment-3

# Implementation Description

## Flexibility

The design of the Email Generation application emphasizes flexibility, particularly in how new types of customer objects can be added or removed with minimal impact on existing code. This flexibility is achieved through the use of the **Factory Method** design pattern, encapsulated within the `CustomerEmailFactory` class. This pattern allows for the creation of customer objects based on the customer type without specifying the exact class of the object that will be created.

Adding a new customer type involves defining a new subclass of `Customer` and extending the `CustomerType` enum and the factory method to handle the new type. This approach ensures that the addition or removal of customer types requires changes only in localized areas of the code, adhering to the **Open/Closed Principle**.

## Simplicity and Understandability

Simplicity and understandability are key considerations in the application's design. Each class and method has a single, well-defined responsibility, following the **Single Responsibility Principle**. For example, the `Customer` class hierarchy focuses solely on customer-related information and behaviors, while the `CustomerEmailFactory` handles the creation of customer objects based on types.

Furthermore, the use of docblock comments and meaningful naming conventions enhances the readability and maintainability of the code, making it easier for others to understand and work with the application.

## Avoiding Duplicated Code

Avoiding duplicated code is crucial for maintaining a clean, efficient, and error-free codebase. In this application, the abstraction provided by the `Customer` class and its subclasses ensures that common behaviors are defined once and inherited by all subclasses, significantly reducing code duplication.

For instance, the method to generate a personalized email message is declared abstract in the `Customer` class and individually implemented in each subclass. This approach allows for shared behavior (getting customer name and email) while enabling specific message generation for each customer type without duplicating code.

The avoidance of duplicated code not only makes the application more maintainable but also reduces the risk of inconsistencies and errors that can arise from having multiple copies of similar logic.

## Use of Design Patterns

The primary design pattern used in this application is the **Factory Method** pattern, implemented through the `CustomerEmailFactory` class. This pattern was chosen for its ability to define an interface for creating an object but allow subclasses to alter the type of objects that will be created. This aligns perfectly with the need to create different types of customer objects based on dynamic input, such as customer type identifiers.

By encapsulating the object creation process, the Factory Method pattern provides a flexible and scalable solution that can easily accommodate new customer types as the application evolves. It exemplifies how design patterns can be effectively leveraged to address specific design challenges, such as flexibility and extensibility, in software development.


# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/)
on your system.

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a
standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains
information about the project, such as its dependencies, the build configuration, and the plugins used for building and
packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the
dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that
builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to
use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports,
and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile

Type on the command line:

```bash
mvn clean compile
```

## JUnit Tests

JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the
behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is
annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the
code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and
easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code
they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all
required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time
changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for
manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```

## Spotbugs

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool
that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems
or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and
other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately
obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to
meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the
development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues
later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential
security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.

## Checkstyle

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source
tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as
well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on
any issues or violations of the coding standards defined in its configuration. This includes issues like code style,
code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices,
making it easier for other developers to read and maintain. It can also help to identify potential issues before the
code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a
wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing
tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser.

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




