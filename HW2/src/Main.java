
public class Main {

	public static void main(String[] args) {
	
	//Circle c = new Circle(3, 5, 5);
	//c.x=100;
	//c.y=30;
	//Rect rec = new Rect(0,0,60,70);
	//Shape s = new Circle(0,0,90);
	Shape arr[] = new Shape[3];
	arr[0] = new Circle (0,0);
	arr[1] = new Rect(0,0,60,70);
	arr[2] = new Circle(3, 5, 5);
	Circle s = new Circle(1, 2, 5);
	System.out.println(s);
	
	//Shape sh = (Shape)(s);
	
	
	
	//System.out.println(sh.radius);
	//System.out.println(arr[1].getX());
	//System.out.println(rec.calcArea());
	
	}

}
