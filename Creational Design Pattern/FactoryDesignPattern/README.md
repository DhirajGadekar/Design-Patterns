# Factory Design Pattern

## Overview

The Factory design pattern is a creational pattern used to create objects without specifying the exact class of object that will be created. It defines an interface or abstract class for creating objects but allows the subclasses to alter the type of objects that will be created.

### Diagram 

![Factory](https://github.com/DhirajGadekar/Design-Patterns/assets/111908836/b3a16cb3-7847-43c9-8481-944f8f45399c)

### Key Points

- **Abstraction**: Provides an interface or abstract class for creating objects, allowing subclasses to alter the type of objects.
- **Encapsulation**: Encapsulates object creation logic, promoting loose coupling and enhancing code maintainability.
- **Centralized Creation**: Centralizes object creation logic, making it easier to manage and modify.
- **Flexible Object Creation**: Enables creating objects based on certain conditions or parameters without exposing the instantiation logic.

## How It Works

### Example Implementation

```java
// Interface for the product
interface Vehicle {
    void manufacture();
}

// Concrete implementations of Vehicle interface
// ... (Car, Bike classes implementing manufacture() method)

// Factory class to create different types of vehicles
class VehicleFactory {
    public Vehicle createVehicle(String vehicleType) {
        // Logic to create and return specific types of vehicles
    }
}
```
### Use Cases
- **Object Creation Scenarios:** When different objects need to be created based on runtime conditions or parameters.
- **Decoupling Object Creation:** To decouple the client code from concrete class instantiation, allowing flexibility in changing implementations.

### Best Practices
- **Abstraction:** Ensure the factory returns interfaces or abstract types for flexibility and maintenance.
- **SOLID Principles:** Stick to SOLID principles, especially Single Responsibility Principle, while designing factories.
- **Flexible Configuration:** Allow configuration parameters to influence object creation if needed.

### Breaking the Factory Pattern
- **Complex Factories:** Overly complex factories that handle multiple unrelated responsibilities can reduce maintainability.
- **Tight Coupling:** If the factory becomes tightly coupled with specific implementations, it loses flexibility.

## Contributor :  

<table>
  <tr>
    <td align="center"><a href="https://github.com/DhirajGadekar"><img src="https://avatars.githubusercontent.com/u/111908836?v=4" width="100px;" alt="Dhiraj Gadekar"/><br/><sub><b>Dhiraj Gadekar</b></sub></a><br/>
</tr>
</table>
Contributions are welcome! If you have any suggestions, improvements, or additional examples related to the Singleton pattern, feel free to open an issue or submit a pull request.

## Feedback

If you have any feedback, please reach out to us at **<a href="https://mail.google.com/mail/u/3/#inbox?compose=CllgCJTHWNbjZQFnRQlzTNlRVSXcTdxfZVrbtCvTZWPTxTWwgDHTpnckBglPXzNWwkPgMBkrZSq" target="_blank">Email</a>**
