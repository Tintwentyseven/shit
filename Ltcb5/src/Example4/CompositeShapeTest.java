package Example4;

import junit.framework.TestCase;

public class CompositeShapeTest extends TestCase{
	public void testConstructor() {
		CompositeShape u1 = new CompositeShape(new Circle( new CartPt(4,3), 10),new Dot(new CartPt(1,2)));
		System.out.print(u1);
		
	}
	
	

}
