package basicUnittest;

public class TestCulculator {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setvalue(4, 3);
		c1.add();
		System.out.println(c1.showResute());
		c1.setvalue(4, 5);
		c1.multiply();
		System.out.println(c1.showResute());
		
		
	}

}
