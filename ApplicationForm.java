import java.awt.*;
import java.awt.event.*;

public class ApplicationForm extends Frame implements ActionListener{
	Checkbox m,f,btech,phd,bsc;
	CheckboxGroup c;
	Label name,address,age,gender,qual,info,fcpl;
	TextField na,ad,ag;
	TextArea ta;
	Button display,reset;
	List fcp;
	ApplicationForm(){
		c=new CheckboxGroup();
		m=new Checkbox("male",c,false);
		f=new Checkbox("female",c,false);
		btech=new Checkbox("btech");
		phd=new Checkbox("phd");
		bsc=new Checkbox("bsc");
		name=new Label("name");
		address=new Label("address");
		age=new Label("age");
		gender=new Label("gender");
		qual=new Label("qualification");
		fcpl=new Label("fav cricket players");
		info=new Label("info");
		na=new TextField(20);
		ad=new TextField(20);
		ag=new TextField(20);
		ta=new TextArea(7,30);
		display=new Button("Display");
		reset=new Button("Reset");
		//String[] s={"Virat Kohli","nihal","bhargav"};
		fcp=new List(5,true);
		fcp.add("Virat Kohli");
		fcp.add("MS Dhoni");
		fcp.add("Rohith Sharma");
		fcp.add("Sachin Tendulkar");
		fcp.add("chris Gayle");
		fcp.add("A.B. de Villiers");
		setLayout(null);
		display.addActionListener(this);
		reset.addActionListener(this);
		setLayout(new FlowLayout());


		name.setBounds(100,100,20,10);
		na.setBounds(150,100,20,10);
		address.setBounds(100,120,20,10);
		ad.setBounds(100,120,20,10);
		age.setBounds(100,160,20,10);
		ag.setBounds(150,160,20,10);
		gender.setBounds(100,190,20,10);	
		m.setBounds(150,190,10,10);
		f.setBounds(170,190,10,10);
		qual.setBounds(100,210,20,10);
		btech.setBounds(150,210,10,10);
		phd.setBounds(150,230,10,10);
		bsc.setBounds(150,250,10,10);
		fcpl.setBounds(100,280,20,10);
		fcp.setBounds(150,290,20,10);
		info.setBounds(100,310,20,10);
		ta.setBounds(150,310,30,50);
		display.setBounds(150,390,20,10);
		reset.setBounds(190,390,20,10);


		add(name);add(na);add(address);add(ad);add(age);add(ag);add(gender);add(m);add(f);add(qual);
		add(btech);add(phd);add(bsc);add(fcpl);add(fcp);add(info);add(ta);add(display);add(reset);	
		display.addActionListener(this);
		reset.addActionListener(this);
		setTitle("Application Form");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		setVisible(true);
		setSize(500,500);
	}
	public void actionPerformed(ActionEvent e){
	ta.setText(null); 
	if(e.getSource()==display){
	ta.append("name : "+na.getText());
	ta.append("\naddress : "+ad.getText());
	ta.append("\nage : "+ag.getText());
	ta.append("\ngender :");
	if (m.getState()==true)
	ta.append("male");
	else if (f.getState()==true)
	ta.append("female");
	ta.append("\nqualifications : ");
	if (btech.getState()==true)
	ta.append("btech ");
	if (phd.getState()==true)
	ta.append("phd ");
	if (bsc.getState()==true)
	ta.append("bsc ");
	ta.append("\nFav Cricket Players :");
	for(String i:fcp.getSelectedItems())
	{
		ta.append(i);
	}
	ta.append("\n");
	}
	else{
	na.setText(null);
	ad.setText(null);
	ag.setText(null);
	ta.setText(null);
	m.setState(false);
	f.setState(false);
	btech.setState(false);
	phd.setState(false);
	bsc.setState(false);
	}
	}
	public static void main(String[] aas){
		new ApplicationForm();
	}
	
}
