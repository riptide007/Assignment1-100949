import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Interface extends JFrame{
	 private JTextField field;
	 private JButton b1,b2, b3, b4, b5, b6, b7, b8, b9, b0, dot, add, sub, prod, div, equals, del, reset;
	 private String num1,num2, sans;
	 private double ans = 0.0;
	 private JPanel panel1;
	 private JLabel label1, label2, label3,label4,label5,label6,label7, label8, label9;
	 private boolean equalsclicked=false, opchoosen=false;
	 char operation = ' ';
	 
	 public Interface() {
		 super("Calculator");
		 
		field = new JTextField(null,38);
		field.setEditable(false);
		field.setBackground(Color.white);
		field.setSize(35, 20);
		
		
		
		label1= new JLabel();
		label2= new JLabel();
		label3= new JLabel();
		label4= new JLabel();
		label5= new JLabel();
		label6= new JLabel();
		label7= new JLabel();
		label8= new JLabel();
		label9= new JLabel();
		
		
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		dot = new JButton(".");
		add = new JButton("+");
		sub = new JButton("-");
		prod = new JButton("*");
		div = new JButton("/");
		equals = new JButton("=");
		del = new JButton("Del");
		reset = new JButton("C");
		
		
		Dimension d = new Dimension(75, 35);
		
		field.setPreferredSize(new Dimension(400,50));
		b1.setPreferredSize(d);
		b2.setPreferredSize(d);
		b3.setPreferredSize(d);
		b4.setPreferredSize(d);
		b5.setPreferredSize(d);
		b6.setPreferredSize(d);
		b7.setPreferredSize(d);
		b8.setPreferredSize(d);
		b9.setPreferredSize(d);
		b0.setPreferredSize(d);
		dot.setPreferredSize(d);
		add.setPreferredSize(new Dimension(55, 35));
		sub.setPreferredSize(new Dimension(55, 35));
		prod.setPreferredSize(new Dimension(55, 35));
		div.setPreferredSize(new Dimension(55, 35));
		equals.setPreferredSize(new Dimension(55, 35));
		del.setPreferredSize(new Dimension(55, 35));
		reset.setPreferredSize(new Dimension(55, 35));
		label1.setPreferredSize(new Dimension (135, 35));
		label2.setPreferredSize(new Dimension(125, 35));
		label3.setPreferredSize(new Dimension(125, 35));
		label4.setPreferredSize(new Dimension(65, 35));
		label5.setPreferredSize(new Dimension(65, 35));
		label6.setPreferredSize(new Dimension(65, 35));
		label7.setPreferredSize(new Dimension(55, 35));
		label8.setPreferredSize(new Dimension(195, 35));
		label9.setPreferredSize(new Dimension(165, 35));
		
		
		Number n = new Number();
		Calc c = new Calc();
		
		b1.addActionListener(n); b2.addActionListener(n); b3.addActionListener(n); b4.addActionListener(n);
		b5.addActionListener(n); b6.addActionListener(n); b7.addActionListener(n); b8.addActionListener(n);
		b9.addActionListener(n); b0.addActionListener(n); dot.addActionListener(n);
		
		add.addActionListener(c); sub.addActionListener(c); prod.addActionListener(c); 
		div.addActionListener(c); equals.addActionListener(c);del.addActionListener(c);
		reset.addActionListener(c);
		 
		 panel1 = new JPanel();
		 panel1.setBackground(Color.lightGray);
		 
		
		 	
		 panel1.add(field, BorderLayout.NORTH);
		 panel1.add(label8); panel1.add(label9); panel1.add(reset);
		 panel1.add(b9); panel1.add(b8); panel1.add(b7); panel1.add(label4); panel1.add(add);  panel1.add(sub);
		 panel1.add(b6); panel1.add(b5); panel1.add(b4); panel1.add(label5); panel1.add(prod); panel1.add(div);
		 panel1.add(b3); panel1.add(b2); panel1.add(b1); panel1.add(label6); panel1.add(del);  panel1.add(equals);
		 panel1.add(b0); panel1.add(dot); panel1.add(label1); panel1.add(label2); panel1.add(label3);
		 
		 
		 this.setContentPane(panel1);
		

		
	 }
	 	private class Number implements ActionListener{
	 		public void actionPerformed(ActionEvent event) {
	 			JButton src = (JButton) event.getSource();
	 			if(src.equals(b1)) {
	 				if(opchoosen==false) {
	 					if(num1==null) {
	 						num1 = "1";
	 					}else {
	 						num1 += "1";
	 					}
	 					
	 				}else {
	 					if(num2==null) {
	 						num2 = "1";
	 					}else {
	 						num2 += "1";
	 					}
	 				}
	 			}
	 			if(src.equals(b2)) {
	 				if(opchoosen==false) {
	 					if(num1==null) {
	 						num1 = "2";
	 					}else {
	 						num1 += "2";
	 					}
	 					
	 				}else {
	 					if(num2==null) {
	 						num2 = "2";
	 					}else {
	 						num2 += "2";
	 					}
	 				}
	 			}
	 			if(src.equals(b3)) {
	 				if(opchoosen==false) {
	 					if(num1==null) {
	 						num1 = "3";
	 					}else {
	 						num1 += "3";
	 					}
	 					
	 				}else {
	 					if(num2==null) {
	 						num2 = "3";
	 					}else {
	 						num2 += "3";
	 					}
	 				}
	 			}
	 			if(src.equals(b4)) {
	 				if(opchoosen==false) {
	 					if(num1==null) {
	 						num1 = "4";
	 					}else {
	 						num1 += "4";
	 					}
	 					
	 				}else {
	 					if(num2==null) {
	 						num2 = "4";
	 					}else {
	 						num2 += "4";
	 					}
	 				}
	 			}
	 			if(src.equals(b5)) {
	 				if(opchoosen==false) {
	 					if(num1==null) {
	 						num1 = "5";
	 					}else {
	 						num1 += "5";
	 					}
	 					
	 				}else {
	 					if(num2==null) {
	 						num2 = "5";
	 					}else {
	 						num2 += "5";
	 					}
	 				}
	 			}
	 			if(src.equals(b6)) {
	 				if(opchoosen==false) {
	 					if(num1==null) {
	 						num1 = "6";
	 					}else {
	 						num1 += "6";
	 					}
	 					
	 				}else {
	 					if(num2==null) {
	 						num2 = "6";
	 					}else {
	 						num2 += "6";
	 					}
	 				}
	 			}
	 			if(src.equals(b7)) {
	 				if(opchoosen==false) {
	 					if(num1==null) {
	 						num1 = "7";
	 					}else {
	 						num1 += "7";
	 					}
	 					
	 				}else {
	 					if(num2==null) {
	 						num2 = "7";
	 					}else {
	 						num2 += "7";
	 					}
	 				}
	 			}
	 			if(src.equals(b8)) {
	 				if(opchoosen==false) {
	 					if(num1==null) {
	 						num1 = "8";
	 					}else {
	 						num1 += "8";
	 					}
	 					
	 				}else {
	 					if(num2==null) {
	 						num2 = "8";
	 					}else {
	 						num2 += "8";
	 					}
	 				}
	 			}
	 			if(src.equals(b9)) {
	 				if(opchoosen==false) {
	 					if(num1==null) {
	 						num1 = "9";
	 					}else {
	 						num1 += "9";
	 					}
	 					
	 				}else {
	 					if(num2==null) {
	 						num2 = "9";
	 					}else {
	 						num2 += "9";
	 					}
	 				}
	 			}
	 			if(src.equals(b0)) {
	 				if(opchoosen==false) {
	 					if(num1==null) {
	 						num1 = "0";
	 					}else {
	 						num1 += "0";
	 					}
	 					
	 				}else {
	 					if(num2==null) {
	 						num2 = "0";
	 					}else {
	 						num2 += "0";
	 					}
	 				}
	 			}
	 			if(src.equals(dot)) {
	 				if(opchoosen==false) {
	 					if(num1==null) {
	 						num1 = ".";
	 					}else {
	 						num1 += ".";
	 					}
	 					
	 				}else {
	 					if(num2==null) {
	 						num2 = ".";
	 					}else {
	 						num2 += ".";
	 					}
	 				}
	 			}
	 			if(equalsclicked==false) {
	 			if(opchoosen==false) {
	 				field.setText(num1);
	 				
	 			}else {
	 				field.setText(num2);
	 			}
	 			}
	 		}
	 	}
	 	private class Calc implements ActionListener{
			 public void actionPerformed(ActionEvent event) {
				 JButton src = (JButton) event.getSource();
				 
				 if(src.equals(add)) {
					 if(num1==null) {
						 System.out.println("Choose your numbers first");
						 
					 }else
						 if(num1!=null && num2 == null) {
							 opchoosen = true;
							 operation = '+';
							 
						 }else
							 if(num1!= null && num2 != null) {
								 System.out.println("two operations only");
							 }
				 }
				 if(src.equals(sub)) {
					 if(num1==null) {
						 System.out.println("Choose your numbers first");
						 
					 }else
						 if(num1!=null && num2 == null) {
							 opchoosen = true;
							 operation = '-';
							 
						 }else
							 if(num1!= null && num2 != null) {
								 System.out.println("two operations only");
							 }
				 }
				 if(src.equals(prod)) {
					 if(num1==null) {
						 System.out.println("Choose your numbers first");
						 
					 }else
						 if(num1!=null && num2 == null) {
							 opchoosen = true;
							 operation = '*';
							 
						 }else
							 if(num1!= null && num2 != null) {
								 System.out.println("two operations only");
							 }
				 }
				 if(src.equals(div)) {
					 if(num1==null) {
						 System.out.println("Choose your numbers first");
						 
					 }else
						 if(num1!=null && num2 == null) {
							 opchoosen = true;
							 operation = '/';
							 
						 }else
							 if(num1!= null && num2 != null) {
								 System.out.println("two operations only");
							 }
				 }
				 if(src.equals(equals)) {
					 if(num1==null) {
						 System.out.println("Choose your numbers first");
						 
					 }else
						 if(num1!=null && num2 == null) {
							 System.out.println("Choose BOTH numbers");
							 
						 }else
							 if(num1!= null && num2 != null) {
								 double d1 = 0.0, d2 = 0.0;
								 
								 d1 = Double.parseDouble(num1);
								 d2 = Double.parseDouble(num2);
								 
								 switch(operation) {
								 case '+':
									 ans = d1 + d2;
									 break;
								 case'-':
									 ans=d1-d2;
									 break;
								 case'*':
									 ans=d1*d2;
									 break;
								 case'/':
									 ans=d1/d2;
									 break;
								 }
								sans= Double.toString(ans);
								field.setText(sans);
								if(operation=='/' && d2 == 0.0) {
									field.setText("MATH ERROR");
								}
							 }
				 } 
				 if(src.equals(del)) {
		 				if(opchoosen==false && num1!=null) {
		 				
		 						field.setText(null);
		 						num1=null;
		 				}else {
		 					
		 						field.setText(null);
		 						num2=null;
		 						
		 					
		 				}
		 			}
			
				 
			 }
		 }
}
	


