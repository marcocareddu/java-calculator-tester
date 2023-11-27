public class Calculator{
	
//	Methods
	float add(float num1, float num2) {
		if(num1 <= 0 || num2 <= 0) {
			throw new IllegalArgumentException("Number1 must be greater than 0.");
		}
		return num1 + num2;
	}
	float subtract(float num1, float num2) {
		if(num1 <= 0 || num2 <= 0) {
			throw new IllegalArgumentException("Numbers must be greater than or equal 0.");
		} else if(num1 < num2) {
			throw new IllegalArgumentException("Number2 must be smaller than number1.");
		}
		return num1 - num2;
	}
	float divide(float num1, float num2) {
		if(num1 <= 0 || num2 <= 0) {
			throw new IllegalArgumentException("Can't divide by 0.");
		}
		return num1 / num2;
	}
	float multiply(float num1, float num2) {
		if(num1 < 0 || num2 < 0) {
			throw new IllegalArgumentException("Number1 must be > 0.");
		}
		return num1 * num2;
	}
}