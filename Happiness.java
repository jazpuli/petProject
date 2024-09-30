import java.io.*;
import java.util.*;
class Happiness implements Serializable, Attribute {
    
    HashMap<Integer, String> happinessMap;
    private Integer currentValue;
    
    public Happiness() { 
        currentValue = 1;
        
        happinessMap = new HashMap<>();
        happinessMap.put(0, "Unhappy");
        happinessMap.put(1, "Content");
        happinessMap.put(2, "Very happy");
    }
    
    public void incrementValue() {
        if(currentValue < 2){
            currentValue++;
        }
    }
    public void decrementValue() {
        if(currentValue > 0){
            currentValue--;
        }
    }
    public String getValue(Integer key) {
        return happinessMap.get(key);
    }

        
    public Integer getCurrentValue() {
        return currentValue;
    }
}