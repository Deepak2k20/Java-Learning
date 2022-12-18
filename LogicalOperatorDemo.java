
public class LogicalOperatorDemo {

	public static void main(String[] args) {
		
		// Logical &&, ||
		
		int num1 = 10;
		int num2= 20;
		int num3 =5;
		
		System.out.println(num1 > num2 && num2 > num3);
		System.out.println(num1 > num2 || num2 > num3);
		
		// Bitwise &, | , ^
		
		System.out.println(num1 > num2 && num1++ > num3); // false && true 
		System.out.println(num1); // 10 because second condition is not checked
		System.out.println(num1 > num2 & num1++ > num3); // false & true
		System.out.println(num1); // 11 because second condition is checked
	}

}
