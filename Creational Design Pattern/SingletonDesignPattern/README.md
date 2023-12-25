# Singleton Design Pattern

## Overview

The Singleton design pattern ensures that a class has only one instance and provides a global point of access to that instance. It's commonly used when exactly one object is needed to coordinate actions across the system, such as managing a shared resource or controlling access to a limited resource.

![singleton-1](https://github.com/DhirajGadekar/Design-Patterns/assets/111908836/a6233812-7547-4954-821f-03d6a22764d4)

### Key Points

- **Single Instance**: Singleton classes have only one instance that is globally accessible throughout the application.
- **Global Access**: Provides a global access point to the single instance, allowing it to be easily accessed by other parts of the code.
- **Lazy Initialization**: Singleton instances can be created either eagerly (at the start) or lazily (when requested), depending on the implementation.
- **Thread Safety**: Various approaches exist to ensure thread safety during the creation of Singleton instances in multi-threaded environments.

## How It Works

### Eager Implementation

```java
public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        
        return instance;
    }
}
```
### Lazy Implementation

```java
public class Singleton {
    private static final Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

### Thread-Safe Implementation (Double-Checked Locking)

```java
public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```

### Use Cases
- **Resource Managers:** Database connection pools, file managers, etc., where a single instance ensures efficient resource utilization.
- **Configuration Settings:** Holding configuration settings that need to be accessed throughout the application.

### Best Practices
- **Lazy Initialization:** Use lazy initialization for better resource management unless eager initialization is specifically required.
- **Thread Safety:** Ensure thread safety in multi-threaded environments when implementing Singleton.
- **Consider Alternatives:** Consider alternatives like dependency injection frameworks for managing single instances.

### Breaking the Singleton Pattern
The Singleton pattern can be broken if not implemented correctly:
1. **Reflection:** Using reflection, it's possible to access the private constructor of a Singleton class and create another instance.
2. **Serialization and Deserialization:** During deserialization, if not handled properly, it might create a new instance, violating the Singleton pattern.
3. **Synchronization Issues:** Improper synchronization in a multi-threaded environment can lead to multiple instances being created due to race conditions.

## Contributor :  

<table>
  <tr>
    <td align="center"><a href="https://github.com/DhirajGadekar"><img src="https://avatars.githubusercontent.com/u/111908836?v=4" width="100px;" alt="Dhiraj Gadekar"/><br/><sub><b>Dhiraj Gadekar</b></sub></a><br/>
</tr>
</table>
Contributions are welcome! If you have any suggestions, improvements, or additional examples related to the Singleton pattern, feel free to open an issue or submit a pull request.

## Feedback

If you have any feedback, please reach out to us at **<a href="https://mail.google.com/mail/u/3/#inbox?compose=CllgCJTHWNbjZQFnRQlzTNlRVSXcTdxfZVrbtCvTZWPTxTWwgDHTpnckBglPXzNWwkPgMBkrZSq" target="_blank">Email</a>**
