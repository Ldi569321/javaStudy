package submit;

public class Calculator {
	public int result1;
	public double result2;
	
	public Calculator() {
		System.out.println("계산기가 생성 되었습니다.");
	}
	
	
	public int plus(int num1, int num2) {
		result1 = num1 + num2;
		System.out.println(result1);
		return result1;
	}
	
	public int minus(int num1, int num2) {
		result1 = num1 - num2;
		System.out.println(result1);
		return result1;
	}
	
	public int multifly(int num1, int num2) {
		result1 = num1 * num2;
		System.out.println(result1);
		return result1;
	}
	
	public int divide(int num1, int num2) {
		result1 = num1 / num2;
		System.out.println(result1);
		return result1;
	}
	
	public double plus(double num3, double num4) {
		result2 = num3 + num4;
		System.out.println(Math.round(result2*10)/10.0);
		return result2;
	}
	
	public double minus(double num3, double num4) {
		result2 = num3 + num4;
		System.out.println(Math.round(result2*10)/10.0);
		return result2;
	}
	
	public double multifly(double num3, double num4) {
		result2 = num3 + num4;
		System.out.println(Math.round(result2*10)/10.0);
		return result2;
	}
	
	public double divide(double num3, double num4) {
		result2 = num3 + num4;
		System.out.println(Math.round(result2*10)/10.0);
		return result2;
	}
}
