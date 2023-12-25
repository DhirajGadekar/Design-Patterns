package BreakSingleton.throughreflection;

public class Singleton {
    
    private static Singleton s;
    private Singleton() {
        if(s != null) {

            throw new AlreadyExistException("Instance Already Exists");
        }
    }

    public static Singleton getIntance() {
        if(s == null) {

            synchronized(Singleton.class) {

                if(s == null) {

                    s = new Singleton();
                }
            }
        }
        return s;
    }
}
