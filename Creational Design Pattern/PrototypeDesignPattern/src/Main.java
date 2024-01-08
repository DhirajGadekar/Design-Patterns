
public class Main {
    public static void main(String[] args) {
    
        ConcretePrototype prototype = new ConcretePrototype("Original");

        ConcretePrototype clone1 = (ConcretePrototype) prototype.clone();
        clone1.setName("Clone 1");

        ConcretePrototype clone2 = (ConcretePrototype) prototype.clone();
        clone2.setName("Clone 2");

        System.out.println(clone1.getName()); 
        System.out.println(clone2.getName()); 
    }
}
