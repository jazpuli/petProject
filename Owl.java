import java.io.*;
import java.util.*;
public class Owl implements Pet, Serializable {
    private Attribute happinessAttribute;
    private Attribute hungerAttribute;
    private Color color;
    
    public Owl() {
        happinessAttribute = new Happiness();
        hungerAttribute = new Hunger();
        color = Color.BROWN; 
        
    }
        
    
    public void makeSound() {
    System.out.println("The owl says: hoot hoot");
    }
    
    public Color getColor() {
        return Color.BROWN;
    }
    
    public Attribute getHunger() {
        return hungerAttribute;
    }
    
    public Attribute getHappiness() {
        return happinessAttribute;
    }
    
    public void play() {
        System.out.println("The owl is flying playfully");
        happinessAttribute.incrementValue();
    }
    
    public void feed() {
        System.out.println("The owl is being fed");
        hungerAttribute.incrementValue();
    }
}