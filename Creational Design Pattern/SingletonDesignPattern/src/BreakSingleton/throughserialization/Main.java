package BreakSingleton.throughserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = null;
        try {

            FileOutputStream fos = new FileOutputStream("singleton.do");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);

            fos.close();
            oos.close();
        } catch(Exception e) {

            e.printStackTrace();
        }

        try {

            FileInputStream fis = new FileInputStream("singleton.do");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            s2 = (Singleton)ois.readObject();

            fis.close();
            ois.close();
        } catch(Exception e) {

            e.printStackTrace();
        }

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
