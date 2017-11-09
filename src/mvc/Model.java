package mvc;


public class Model {

	double answer = 0;
	
	public double Calculate(double num1, double num2, String sign){
		
		switch(sign){
		case "+":
			return answer = num1 + num2;
		case "-":
			return answer = num1 - num2;
		case "*":
			return answer = num1 * num2;
		case "/":
			return answer = num1 / num2;
		}
		return 0;
	}
}

