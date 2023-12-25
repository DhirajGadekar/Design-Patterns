public class ProblemInLazy {
    private static ProblemInLazy pl;
    private ProblemInLazy() {

    }

    // Method 1 :
    // public synchronized static ProblemInLazy getLazy() {

    //     if(pl == null) {
            
    //         pl = new ProblemInLazy();
    //     }
    //     return pl;
    // }

    // Method 2 :

    public static ProblemInLazy getLazy() {

        if(pl == null) {

            synchronized(ProblemInLazy.class) {
                if(pl == null) {
                    pl = new ProblemInLazy();
                }
            }
        }
        return pl;
    }
}
