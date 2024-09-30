import java.io.*;
import java.util.*;

public class Serialization {
    public static void saveWorm(Object obj) {
        try{
            FileOutputStream file = new FileOutputStream("worm.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(obj);

            out.close();
            file.close();

        } catch(IOException ex) {
            System.out.println("Exception has been caught");
        }
    }
    
    public static void saveOwl(Object obj) {
        try{
            FileOutputStream file = new FileOutputStream("owl.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(obj);

            out.close();
            file.close();

        } catch(IOException ex) {
            System.out.println("Exception has been caught");
        }
    }
    
    public static Pet downloadWorm() {
        try{
            FileInputStream file = new FileInputStream("worm.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            Pet worm = (Worm) in.readObject();

            in.close();
            file.close();

 
            return worm;
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        } catch(ClassNotFoundException ex){
            System.out.println("Class not found exception has been caught");
        } 
        return null;
    }
    
        public static Pet downloadOwl() {
        try{
            FileInputStream file = new FileInputStream("owl.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            Pet owl = (Owl) in.readObject();

            in.close();
            file.close();


            return owl;
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        } catch(ClassNotFoundException ex){
            System.out.println("Class not found exception has been caught");
        } 
        return null;
    }
}