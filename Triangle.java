package advance.dev;

public class Triangle extends Shape {
       private double a;
       private double b;
       private double c;
       
       public Triangle(double a, double b, double c) {
    	   super();
    	   this.a = a;
    	   this.b = b;
    	   this.c = c;
       }
       @Override
       public double chuvi() {
    	   return a + b + c;
       }
       @Override
       public double dientich() {
    	   double p = chuvi()/2;
    	   return Math.sqrt(p*(p - a) * (p - b)*(p -c));
       }
}
