import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Interface extends JFrame {
	private JTextField answerfield;
	private JButton one, two, three, four, five, six, seven, eight, nine, zero, add, decimal, negative, sub, multiply, div, equals, clear, delete;
	private String stemp1, stemp2, sanswer;
	private double answer= 0.0;
	private JPanel contentPanel;
	private JLabel pan1, pan2, pan3, pan4, pan5, pan6; 
	private boolean equalsClicked= false, opChosen= false;
	char operation= ' ';
	
	public Interface() {
		super("Calculator");
		
		answerfield = new JTextField(null, 33);
		answerfield.setEditable(false);
		
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		decimal = new JButton(".");
		negative = new JButton("+/-");
		add = new JButton("+");
		sub = new JButton("-");
		multiply = new JButton("x");
		div = new JButton("/");
		equals = new JButton("=");
		clear= new JButton("C");
		delete= new JButton("Del");
		pan1= new JLabel("");
		pan2= new JLabel("");
		pan3= new JLabel("");
		pan4= new JLabel("");
		pan5= new JLabel("");
		pan6= new JLabel("");
		
		Dimension dim = new Dimension(70, 35);
		
		//setting buttons and fields sizes
		answerfield.setPreferredSize(new Dimension(5, 33));
		one.setPreferredSize(dim);
		two.setPreferredSize(dim);
		three.setPreferredSize(dim);
		four.setPreferredSize(dim);
		five.setPreferredSize(dim);
		six.setPreferredSize(dim);
		seven.setPreferredSize(dim);
		eight.setPreferredSize(dim);
		nine.setPreferredSize(dim);
		zero.setPreferredSize(dim);
		decimal.setPreferredSize(dim);
		negative.setPreferredSize(dim);
		add.setPreferredSize(dim);
		sub.setPreferredSize(dim);
		multiply.setPreferredSize(dim);
		div.setPreferredSize(dim);
		equals.setPreferredSize(dim);
		clear.setPreferredSize(dim);
		delete.setPreferredSize(dim);
		pan1.setPreferredSize(new Dimension(300, 30));
		pan2.setPreferredSize(new Dimension(140, 30));
		pan3.setPreferredSize(new Dimension(350, 25));
		pan4.setPreferredSize(new Dimension(350, 15));
		pan5.setPreferredSize(new Dimension(350, 15));
		pan6.setPreferredSize(new Dimension(350, 15));
		
		Numbers n= new Numbers();
		Calc c= new Calc();
		
		//adding action listeners for numbers and functions
		one.addActionListener(n); two.addActionListener(n); three.addActionListener(n);
		four.addActionListener(n); five.addActionListener(n); six.addActionListener(n);
		seven.addActionListener(n); eight.addActionListener(n); nine.addActionListener(n);
		zero.addActionListener(n); decimal.addActionListener(n); negative.addActionListener(n);
		delete.addActionListener(n);
		
		add.addActionListener(c); sub.addActionListener(c); multiply.addActionListener(c);
		div.addActionListener(c); equals.addActionListener(c); clear.addActionListener(c); 
		
		
		contentPanel= new JPanel();
		contentPanel.setBackground(Color.LIGHT_GRAY);
		clear.setForeground(Color.RED);
		add.setBackground(Color.ORANGE);
		sub.setBackground(Color.ORANGE);
		multiply.setBackground(Color.ORANGE);
		div.setBackground(Color.ORANGE);
		contentPanel.setLayout(new FlowLayout());
		
		contentPanel.add(answerfield, BorderLayout.NORTH);
		contentPanel.add(pan1); contentPanel.add(clear); contentPanel.add(pan3);
		contentPanel.add(seven); contentPanel.add(eight); contentPanel.add(nine);
		contentPanel.add(add); contentPanel.add(sub); contentPanel.add(pan4); 
		contentPanel.add(four); contentPanel.add(five); contentPanel.add(six); 
		contentPanel.add(multiply); contentPanel.add(div); contentPanel.add(pan5); 
		contentPanel.add(one); contentPanel.add(two); contentPanel.add(three); 
		contentPanel.add(pan2); contentPanel.add(pan6); contentPanel.add(zero); 
		contentPanel.add(decimal); contentPanel.add(negative); contentPanel.add(delete);
		contentPanel.add(equals); 
		
		
		
		this.setContentPane(contentPanel);
	}
	
	private class Numbers implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			JButton src= (JButton) event.getSource();
			
			if(src.equals(one)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "1";
					}else {
						stemp1= stemp1 + "1";
					}
				}else {
					if(stemp2==null) {
						stemp2= "1";
					}else {
						stemp2= stemp2 + "1";
					}
				}
			}
			
			if(src.equals(two)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "2";
					}else {
						stemp1= stemp1 + "2";
					}
				}else {
					if(stemp2==null) {
						stemp2= "2";
					}else {
						stemp2= stemp2 + "2";
					}
				}
			}
			
			if(src.equals(three)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "3";
					}else {
						stemp1= stemp1 + "3";
					}
				}else {
					if(stemp2==null) {
						stemp2= "3";
					}else {
						stemp2= stemp2 + "3";
					}
				}
			}
			
			if(src.equals(four)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "4";
					}else {
						stemp1= stemp1 + "4";
					}
				}else {
					if(stemp2==null) {
						stemp2= "4";
					}else {
						stemp2= stemp2 + "4";
					}
				}
			}
			
			if(src.equals(five)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "5";
					}else {
						stemp1= stemp1 + "5";
					}
				}else {
					if(stemp2==null) {
						stemp2= "5";
					}else {
						stemp2= stemp2 + "5";
					}
				}
			}
			
			if(src.equals(six)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "6";
					}else {
						stemp1= stemp1 + "6";
					}
				}else {
					if(stemp2==null) {
						stemp2= "6";
					}else {
						stemp2= stemp2 + "6";
					}
				}
			}
			
			if(src.equals(seven)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "7";
					}else {
						stemp1= stemp1 + "7";
					}
				}else {
					if(stemp2==null) {
						stemp2= "7";
					}else {
						stemp2= stemp2 + "7";
					}
				}
			}
			
			if(src.equals(eight)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "8";
					}else {
						stemp1= stemp1 + "8";
					}
				}else {
					if(stemp2==null) {
						stemp2= "8";
					}else {
						stemp2= stemp2 + "8";
					}
				}
			}
			
			if(src.equals(nine)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "9";
					}else {
						stemp1= stemp1 + "9";
					}
				}else {
					if(stemp2==null) {
						stemp2= "9";
					}else {
						stemp2= stemp2 + "9";
					}
				}
			}
			
			if(src.equals(zero)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "0";
					}else {
						stemp1= stemp1 + "0";
					}
				}else {
					if(stemp2==null) {
						stemp2= "0";
					}else {
						stemp2= stemp2 + "0";
					}
				}
			}
			
			if(src.equals(decimal)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "0.";
					}else 
						if(stemp1 != null) {
							if(stemp1.contains(".")) {
								System.out.println("Decimal already there");
							}else {
								stemp1 += ".";
							}
						
					}
				}else {
					if(stemp2==null) {
						stemp2= "0.";
					}else 
						if(stemp2 != null) {
							if(stemp2.contains(".")) {
								System.out.println("Decimal already there");
							}else {
								stemp2 += ".";
							}
					}
				}
			}
			
			if(src.equals(negative)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "-";
					}else 
					    if(stemp1 != null && stemp1.startsWith("-")){
					    	stemp1= stemp1.substring(1);
					}else {
						stemp1= "-" + stemp1;
					}		
				}else {
					if(stemp2==null) {
						stemp2= "-";
					}else 
						if(stemp2 != null && stemp2.startsWith("-")){
						stemp2 = stemp2.substring(1);
					}else {
						stemp2= "-" + stemp2;
					}
				}
			}
			
			if(src.equals(delete)) {
				if(opChosen==false) {
					if(stemp1==null) {
						System.out.println("No number");
					}else {
						stemp1= stemp1.substring(0, stemp1.length()-1);
					}
				}else {
					if(stemp2== null) {
						System.out.println("No number");
					}else {
						stemp2= stemp2.substring(0, stemp2.length()-1);
					}
				}
			}
			
			if(equalsClicked==false) {
				if(opChosen==false) {
					answerfield.setText(stemp1);
				}else {
					answerfield.setText(stemp2);
				}
			}
		}
	}
	
	private class Calc implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			JButton src= (JButton) event.getSource();
			
			if(src.equals(add)) {
				if(stemp1==null) {
					System.out.println("_");
				}else
					if(stemp1 !=null && stemp2==null) {
						opChosen= true;
						operation= '+';
					}else
						if(stemp1 != null && stemp2 != null) {
							System.out.println("Two operations only");
						}
			}
			
			if(src.equals(sub)) {
				if(stemp1==null) {
					System.out.println("_");
				}else
					if(stemp1 !=null && stemp2==null) {
						opChosen= true;
						operation= '-';
					}else
						if(stemp1 != null && stemp2 != null) {
							System.out.println("Two operations only");
						}
			}
			
			if(src.equals(multiply)) {
				if(stemp1==null) {
					System.out.println("_");
				}else
					if(stemp1 !=null && stemp2==null) {
						opChosen= true;
						operation= '*';
					}else
						if(stemp1 != null && stemp2 != null) {
							System.out.println("Two operations only");
						}
			}
			
			if(src.equals(div)) {
				if(stemp1==null) {
					System.out.println("_");
				}else
					if(stemp1 !=null && stemp2==null) {
						opChosen= true;
						operation= '/';
					}else
						if(stemp1 != null && stemp2 != null) {
							System.out.println("Two operations only");
						}
			}
			
			if(src.equals(equals)) {
				if(stemp1==null) {
					System.out.println("_");
				}else
					if(stemp1 !=null && stemp2==null) {
						System.out.println("Choose numbers first");
					}
				
				if(stemp1 != null && stemp2 != null) {
					double d1= 0.0, d2= 0.0;
					
					d1= Double.parseDouble(stemp1);
					d2= Double.parseDouble(stemp2);
					
					switch(operation) {
					case '+':
						answer= d1 + d2;
						break;
					case'-':
						answer= d1 - d2;
						break;
					case '*':
						answer= d1 * d2;
						break;
					case '/':
						answer= d1 / d2;
						break;
					}
					
					sanswer= Double.toString(answer);
					answerfield.setText(sanswer);
					if(operation== '/' && d2 == 0.0) {
						answerfield.setText("Math error");
					}
				}
			}
			
			if(src.equals(clear)) {
				stemp1= null; stemp2= null;
				equalsClicked= false;
				opChosen= false;
				operation= ' ';
				answerfield.setText(null);
				sanswer= null;
			}
			
		}
	}
}
