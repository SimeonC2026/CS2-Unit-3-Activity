public class Pet {
    
    // 1. Declare INSTANCE VARIABLES
    private String name;
    private int age;
    private double weight;
    private String type;
    private boolean sterile;
    
    
    // 2. Define CONSTRUCTOR
public Pet (String initName, int initAge, double initWeight, String initType, boolean initSterile)
{
    name = initName;
    age = initAge;
    weight = initWeight;
    type = initType;
    sterile = initSterile;
}
    // 3. Define METHODS
    // getters
    public String getName () {
        return name;
    }
    public int getAge () {
        return age;
    }
    public double getWeight () {
        return weight;
    }
    public String getType () {
        return type;
    }
    public boolean getSterile () {
        return sterile;
    }
     
    // toString
    public String toString() {
        return "Name: " + name + "Age: " + age + "Weight: " + weight + "Type: " + type + "Sterile: " + sterile;
    }
    // setters
    public void setName (String newName) {
        this.name = newName;
    }
    public void setAge (int newAge) {
        this.age = newAge;
    }
    public void setWeight (double newWeight) {
        this.weight = newWeight;
    }
    public void setType (String newType) {
        this.type = newType;
    }
    public void setSterile (boolean newSterile) {
        this.sterile = newSterile;
    }
}