
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JPanel implements ActionListener{
	// Instance Variables
	// create a button
	private JButton loginButton, closeButton, depositButton, withdrawButton;

	//create a textbox
	private JTextField userInput, depositAmount, withdrawAmount;

	//create a bank object
	private Bank customer;

	


	// Initialization Constructor
	public Screen() {
		//instantiate button
		loginButton = new JButton("Login");
		// instantiate the textfield
		userInput = new JTextField();
		depositAmount = new JTextField();
		withdrawAmount = new JTextField();
		// instantiate a customer
		customer = new Bank("Corey Smith", 350.50, 1234);

		closeButton = new JButton("Close");
		
		withdrawButton = new JButton("Withdraw");

		depositButton = new JButton("Deposit");

		setLayout(null);  // JPanel method that initializes the layout

		// set positions for the button and textfield
		closeButton.setBounds(150,375,100,30);
		loginButton.setBounds(150, 350, 100, 30);
		userInput.setBounds(150, 300, 100, 30);
		withdrawAmount.setBounds(200, 300, 100, 30);
		depositAmount.setBounds(100, 300, 100, 30);
		depositButton.setBounds(100,350,100,30);
		withdrawButton.setBounds(200,350,100,30);

		// add button and textfield to panel
		add(closeButton);
		add(loginButton);
		add(userInput);
		add(depositButton);
		add(withdrawButton);
		add(withdrawAmount);
		add(depositAmount);

		// set up to listen for the button click
		closeButton.addActionListener(this);
		loginButton.addActionListener(this);
		withdrawButton.addActionListener(this);
		depositButton.addActionListener(this);

	}
	
	//set the size of the JPanel container
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		if (customer.getAccess() == true) {
			g.drawString(customer.getName(), 125, 275);
			g.drawString(customer.getBalance() + "", 225, 275);
			depositButton.setVisible(true);
			withdrawButton.setVisible(true);
			loginButton.setVisible(false);
			userInput.setVisible(false);
			withdrawAmount.setVisible(true);
			depositAmount.setVisible(true);
		}
		else {
			g.drawString("Enter a pin number: ", 150, 280);
			depositButton.setVisible(false);
			withdrawButton.setVisible(false);
			loginButton.setVisible(true);
			userInput.setVisible(true);
			withdrawAmount.setVisible(false);
			depositAmount.setVisible(false);
		}
	}
	
	//action to be performed when a button is clicked
	public void actionPerformed(ActionEvent event) {
			if (event.getSource()== loginButton) {
				String pinText = userInput.getText();
				// convert to int
				int pin = Integer.parseInt(pinText);
				customer.checkPin(pin);
			}else if (event.getSource()== closeButton){
				System.exit(0);
			}else if(event.getSource()== withdrawButton){
				String wAmountInput = withdrawAmount.getText();
				double wAmount = Double.parseDouble(wAmountInput);
				customer.withdraw(wAmount);
			}
			else if(event.getSource()== depositButton){
				String dAmountInput = depositAmount.getText();
				double dAmount = Double.parseDouble(dAmountInput);
				customer.deposit(dAmount);
			}
			// refresh your textbox optional!
			userInput.setText("");
			//This line MUST be here refresh the screen
			repaint();
	}
}