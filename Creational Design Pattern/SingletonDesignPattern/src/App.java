public class App {

    public static void main(String[] args) {
        
        // Eager eager1 = Eager.getEager();
        // Eager eager2 = Eager.getEager();

        // System.out.println(eager1.hashCode());
        // System.out.println(eager2.hashCode());

        // Lazy lazy1 = Lazy.getLazy();
        // Lazy lazy2 = Lazy.getLazy();

        // System.out.println(System.identityHashCode(lazy1));
        // System.out.println(System.identityHashCode(lazy2));

        Runnable r1 = () -> {
            
            System.out.println(ProblemInLazy.getLazy().hashCode());
        };
        Runnable r2 = () -> {

            System.out.println(ProblemInLazy.getLazy().hashCode());
        };
        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
