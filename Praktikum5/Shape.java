package praktikum5.soal1;

/**
 *
 * @author USER
 */
public abstract class Shape {
    protected String shapeName;
    
    //---------------------------------
    // Constructor : Sets up the shape
    //---------------------------------
    
    public Shape(String name) {
        shapeName = name;
    }
    
    //---------------------------------
    // Return the surface area of the shape
    //---------------------------------
    
    protected abstract double area();
    
    //---------------------------------    
    // Return the shape as a string
    //---------------------------------
    
    public String toString() {
        return shapeName;
    }
}
