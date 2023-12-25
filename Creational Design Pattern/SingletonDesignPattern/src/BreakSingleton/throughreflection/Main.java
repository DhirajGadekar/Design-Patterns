package BreakSingleton.throughreflection;

import java.lang.reflect.Constructor;

public class Main {
    
    /**
     * @param args
     */
    public static void main(String[] args) {

        Singleton s1 = Singleton.getIntance();
        Singleton s2 = null;
        try {
            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            s2 = constructor.newInstance();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
