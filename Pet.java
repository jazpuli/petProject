public interface Pet {
    public void makeSound(); // interface method (does not have a body)
    public void play(); // interface method (does not have a body)
    public void feed(); 
    public Attribute getHappiness();
    public Attribute getHunger();
    public Color getColor();
    public enum Color {
        BLACK,
        BROWN,
        ORANGE,
        PURPLE,
        BLUE,
        PINK
    }
 
}
