import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Interface extends JFrame{
	 private JTextField field;
	 private JButton b1,b2, b3, b4, b5, b6, b7, b8, b9, b0, dot, add, sub, prod, div, equals, del;
	 private String stp1,stp2, sans;
	 private double ans = 0.0;
	 private JPanel panel;
	 
	 public Interface() {
		 super("calculator");
		 
		field = new JTextField(null, 35);
		field.setEditable(false);
		field.setBackground(Color.white);
		field.setSize(35, 10);
		
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
		
		Dimension d = new Dimension(75, 25);
		
		b1.setPreferredSize(d);
		b2.setPreferredSize(d);
		b3.setPreferredSize(d);
		b4.setPreferredSize(d);
		b5.setPreferredSize(d);
		b6.setPreferredSize(d);
		b7.setPreferredSize(d);
		b8.setPreferredSize(d);
		b9.setPreferredSize(d);
		b0.setPreferredSize(new Dimension(85, 25));
		dot.setPreferredSize(new Dimension(85, 25));
		add.setPreferredSize(new Dimension(55, 25));
		sub.setPreferredSize(new Dimension(55, 25));
		prod.setPreferredSize(new Dimension(55, 25));
		div.setPreferredSize(new Dimension(55, 25));
		equals.setPreferredSize(new Dimension(55, 25));
		del.setPreferredSize(new Dimension(55, 25));
		
		 
		 panel= new JPanel();
		 panel.setLayout(new FlowLayout());
		 panel.add(field, BorderLayout.NORTH);
		 panel.add(b9); panel.add(b8); panel.add(b7);  panel.add(add);  panel.add(sub);
		 panel.add(b6);panel.add(b5); panel.add(b4);  panel.add(prod); panel.add(div);
		 panel.add(b3); panel.add(b2); panel.add(b1); panel.add(del); panel.add(equals);
		 panel.add(b0);panel.add(dot);
		 
  
		 
		 
		 
		 
		 
		 
		 this.setContentPane(panel);
	 }
	

}
