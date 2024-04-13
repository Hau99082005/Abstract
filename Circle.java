package advance.dev;

public class Circle extends Shape {
     private double radius;
     
     public Circle(double radius) {
    	 super();
    	 this.radius = radius;
     }
     @Override
     public double chuvi() {
    	 return 2 * Math.PI * radius;
     }
     @Override
     public double dientich() {
    	 return Math.PI * Math.pow(radius, 2);
     }
}
