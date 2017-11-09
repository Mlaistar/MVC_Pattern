package mvc;

public class Control {

	Model model;
	View view;
	
	public Control(Model model, View view){
		
		this.model = model;
		this.view = view;
	}
	
	public void ButtonClicked(double num1, double num2, String sign){
		// model contains information / data but in my case I'm storing calculations procedures
		double result = model.Calculate(num1, num2, sign);  
		view.setAnswer(result); // set the results to the view class
	}
}

