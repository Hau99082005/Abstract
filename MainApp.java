package advance.dev;

public class MainApp {
    public static void main(String[] args) {
     Shape shape = null;
     Shape shape1 = null;
     Shape shape2 = null;
     shape = new Circle(5);
     System.out.println("chu vi hinh tron: "+shape.chuvi());
     System.out.println("dien tich hinh tron: "+shape.dientich());
     shape1 = new Triangle(5, 6, 7);
     System.out.println("chu vi hinh tam giac: "+shape1.chuvi());
     System.out.println("dien tich hinh tam giac: "+shape1.dientich());
     shape2 = new Rectangle(10, 5);
     System.out.println("chu vi hinh chu nhat: "+shape2.chuvi());
     System.out.println("dien tich hinh chu nhat: "+shape2.dientich());
     
    }
}
