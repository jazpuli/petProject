import java.io.*;
import java.util.*;
class Hunger implements Serializable, Attribute {
    HashMap<Integer, String> hungerMap;
    private Integer currentValue;
    
    public Hunger() {
        currentValue = 1;
        hungerMap = new HashMap<>();
        hungerMap.put(0, "Hungry");
        hungerMap.put(1, "Satisfied");
        hungerMap.put(2, "Full");
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
        return hungerMap.get(key);
    }

        
    public Integer getCurrentValue() {
        return currentValue;
    }
}