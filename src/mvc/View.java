package mvc;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class View extends JFrame {
	
	private Control control;
	
	private TextField txtNumber1 = new TextField();
	private TextField txtNumber2 = new TextField();
	private JComboBox<String> cmbSigns = new JComboBox<String> (new String[] { "+", "/", "*", "-" });
	
	private Button btnCalculator = new Button("Calculate");
	private Button btnInvisible = new Button();
	private JPanel panel;

	private Label lblMessage = new Label("Answer is ");
	public View(){ }
	private static double answer;
	public View(Control control){
		
		super("Calculator");
		this.control = control;
		CreateControls();
	}
	private void CreateControls(){

		panel = new JPanel(new GridLayout(2, 5));

		btnInvisible.setVisible(false);
		
		panel.add(txtNumber1);
		panel.add(cmbSigns);
		panel.add(txtNumber2);
		panel.add(btnInvisible);
		
		panel.add(lblMessage);
		panel.add(btnCalculator);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnCalculator.addActionListener(new CalcListener());
		
		this.setSize(300, 120);
		this.add(panel);
		this.setVisible(true);
	}
	
/*		
	private void calculateListener(ActionListener listener){
		buttonCalculator.addActionListener(listener);
	}
	
	public double getNumber1(){
		return Double.valueOf(txtNumber1.getText());
	}
	public double getNumber2(){
		return Double.valueOf(txtNumber2.getText());
	}
	public String getSign(){
		return String.valueOf(txtOperatorSign.getText());
	}*/
	// my get and set methods for answer
	public void setAnswer(double answer){
		this.answer = answer;
	}
	
	public double getAnswer(){
		return answer;
	}
	// listener for onClick event (btnCalculator)
	class CalcListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

			double num1 = Double.valueOf(txtNumber1.getText()); // get value from TextBox number 1
			double num2 = Double.valueOf(txtNumber2.getText()); // get value from TextBox number 2

			String sign = cmbSigns.getSelectedItem().toString(); // get the selected sign
			control.ButtonClicked(num1, num2, sign); // call my controller to perform the next task
			lblMessage.setText("Answer is " + String.valueOf(getAnswer())); // show answer to user
		}
	}
}



