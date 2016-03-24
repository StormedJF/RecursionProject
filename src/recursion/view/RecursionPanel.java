package recursion.view;
import java.awt.event.*;
import javax.swing.*;
import recursion.controller.Controller;

public class RecursionPanel extends JPanel
{
	private Controller baseController;
	private JButton fibonacciButton;
	private JButton factorialButton;
	private JTextField inputField;
	private JTextArea resultArea;
	private SpringLayout baseLayout;
	
	public RecursionPanel(Controller baseController){
		this.baseController = baseController;
		fibonacciButton = new JButton("Calculate the fibonacci number");
		factorialButton = new JButton("N!");
		baseLayout = new SpringLayout();
		inputField = new JTextField(5);
		resultArea = new JTextArea();
	}
	
	private void setupLayout(){
		
	}
	
	private void setupPanel(){
		this.setLayout(baseLayout);
		this.add(fibonacciButton);
		this.add(factorialButton);
		this.add(inputField);
		this.add(resultArea);
		resultArea.setWrapStyleWord(true);
		resultArea.setEditable(false);
		
	}
	
	private void setupListeners(){
		fibonacciButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent click){
				String input = inputField.getText();
				if(checkInput(input)){
					resultArea.setText(baseController.doFibonacci(input));
				}
			}
		});
	}
	
	private boolean checkInput(String input){
		boolean isNumber = false;
		try{
			Integer.parseInt(input);
			isNumber = true;
			
		}catch(Exception numberException){
			resultArea.setText("you must type in a number");
		}
		return isNumber;
	}
}