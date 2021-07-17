
public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
  private double radius;
  private double pi = super.PI;

  
  // no-args Constructor 
  public CircleFromSimpleGeometricObject() {
  }

  public CircleFromSimpleGeometricObject(double radius) {
    this.radius = radius;
  }

  public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
    this.radius = radius;
    setColor(color);
    setFilled(filled);
    
    
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /** Return area */
  public double getArea() {
    return radius * radius * pi;
  }
  
  /** Return diameter */
  public double getDiameter() {
    return 2 * radius;
  }
  
  /** Return perimeter */
  public double getPerimeter() {
    return 2 * radius * pi;
  }

  /* Print the circle info */
  public void printCircle() {
    System.out.println("The circle is created " + getDateCreated() +
      " and the radius is " + radius);
  }
  /* Print the circle info */
  public void toString2() {
    System.out.println(super.toString2() + radius);
  }
  public  String toString3() {
	  String x = super.toString3();
	    return x ;
	  }
}
