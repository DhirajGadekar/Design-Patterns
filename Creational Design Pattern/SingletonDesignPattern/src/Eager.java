public class Eager {
    
    private static Eager eager = new Eager();
    private Eager() {

    }
    public static Eager getEager() {
        
        return eager;
    }
}
