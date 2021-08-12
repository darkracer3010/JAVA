import java.awt.*;
import java.awt.event.*;
public class Calculator1 extends Frame implements ActionListener{
Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,a,s,m,d,e,c;
TextField t1,t2;
Calculator1(){
	setSize(500,500);
	setTitle("Calculator");
	t1=new TextField(10);
	t2=new TextField(10);
	add(t1);
	add(new Label());
	add(t2);
	add(new Label());
	b0=new Button();
	b0.setLabel("0");
	add(b0);
	b1=new Button();
	b1.setLabel("1");
	add(b1);
	b2=new Button();
	b2.setLabel("2");
	add(b2);
	b3=new Button();
	b3.setLabel("3");
	add(b3);
	b4=new Button();
	b4.setLabel("4");
	add(b4);
	b5=new Button();
	b5.setLabel("5");
	add(b5);
	b6=new Button();
	b6.setLabel("6");
	add(b6);
	b7=new Button();
	b7.setLabel("7");
	add(b7);
	b8=new Button();
	b8.setLabel("8");
	add(b8);
	b9=new Button();
	b9.setLabel("9");
	add(b9);
	a=new Button();
	a.setLabel("+");
	add(a);
	s=new Button();
	s.setLabel("-");
	add(s);
	m=new Button();
	m.setLabel("*");
	add(m);
	d=new Button();
	d.setLabel("/");
	add(d);
	e=new Button();
	e.setLabel("=");
	add(e);
	c=new Button();
	c.setLabel("clear");
	add(c);
	setLayout(new GridLayout(5,4));
	b0.addActionListener(this);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	a.addActionListener(this);
	s.addActionListener(this);
	m.addActionListener(this);
	d.addActionListener(this);
	e.addActionListener(this);
	c.addActionListener(this);
	addWindowListener(new Some());
	setVisible(true);
}
public void actionPerformed(ActionEvent ae){
	if(ae.getSource()==c){
	t1.setText(null);
	t2.setText(null);
	}
	else if (ae.getSource()==e){
	String s=new String(t1.getText()),sa,sb;
	int index=1;
	while(true){
	if (s.charAt(index)=='+' ||s.charAt(index)=='*' ||s.charAt(index)=='/' ||s.charAt(index)=='-')
	break;
	index++;
	}
	int a=Integer.parseInt(s.substring(0,index));
	int b=Integer.parseInt(s.substring(index+1,s.length()));
	char c=s.charAt(index);
	int op=0;
	switch(c){
	case '+':op=a+b;break;
	case '-':op=a-b;break;
	case '*':op=a*b;break;
	case '/':op=a/b;break;
	}
	t2.setText(String.valueOf(op));
	}
	else{
	StringBuffer sb=new StringBuffer(t1.getText());
	sb.append(ae.getActionCommand());
	t1.setText(new String(sb));	
	}
	
}
class Some extends WindowAdapter{
public void windowClosing(WindowEvent e){
	System.exit(0);
	}
}
public static void main(String[] ad){
	new Calculator1();
	}
}