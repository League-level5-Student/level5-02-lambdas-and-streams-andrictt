package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons{
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		Random rand = new Random();
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener((a) -> {
			int b = 1 + 1;
			System.out.println("1 + 1 is " + b);
		});
		randNumber.addActionListener((a)-> System.out.println(rand.nextInt(100000)));
		tellAJoke.addActionListener((a)-> System.out.println("ur mom lol"));
		window.setVisible(true);
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}

}
	
	
