package basicUnittest;

public class Calculator {
private int num1;
private int num2;
private int resute;

	public void add() {
		resute = num1+ num2;
		
	}
	public void multiply() {
		resute = num1*num2;
	}
	
	public int showResute() {
		return resute;
			
	}
	public void setvalue(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
}
