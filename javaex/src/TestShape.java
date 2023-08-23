
class maths{
String name;
void area() {
System.out.println("find out area");

}

}
class Circle extends maths{
void area() {
//__________________
	super.area();
System.out.println("area of circle");
}

}
public class TestShape{
public static void main(String[] a) {
Circle c=new Circle();
c.area();
}
}
