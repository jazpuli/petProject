import java.io.*;
import java.util.*;
public class Worm implements Pet, Serializable {
    private Attribute happinessAttribute;
    private Attribute hungerAttribute;
    private Color color;
    
    public Worm(){
        happinessAttribute = new Happiness();
        hungerAttribute = new Hunger();
        color = Color.PINK; 
    }

    public void makeSound() {
    System.out.println("The worm says: ***");
    }
    
    public Color getColor() {
        return Color.PINK;
    }
    
    public Attribute getHunger() {
        return hungerAttribute;
    }
    
    public Attribute getHappiness() {
        return happinessAttribute;
    }
    
    public void play() {
        System.out.println("The worm is writhing playfully");
        happinessAttribute.incrementValue();
    }
    
    public void feed() {
        System.out.println("The worm is being fed");
        hungerAttribute.incrementValue();
    }
}