package BreakSingleton.throughserialization;

import java.io.Serializable;
import BreakSingleton.throughreflection.AlreadyExistException;

public class Singleton implements Serializable {
    private static Singleton s;
    private Singleton() {

        if(s != null) {

            throw new AlreadyExistException("Instance already exist");
        }
    }
    public static Singleton getInstance() {

        if(s == null) {

            synchronized(Singleton.class) {
                
                if(s == null) {

                    s = new Singleton();
                }
            }
        }
        return s;
    }
    public Object readResolve() {

        return s;
    }
}
