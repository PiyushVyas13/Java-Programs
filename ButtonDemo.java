import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Applet implements ActionListener
{
	String msg="";
	Button yes,no,maybe;
	public void init()
	{
		yes = new Button("Yes");
		no = new Button("No");
		maybe = new Button("Maybe");
		add(yes);
		add(no);
		add(maybe);
		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		if(str.equals("Yes"))
		{
			msg="You pressed Yes";
		}
		else if(str.equals("No"))
		{
			msg = "You pressed No";
		}
		else
		{
			msg = "You pressed maybe";
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, 6, 100);
	}
}
/* 
<applet code="ButtonDemo.class" width=300 height=300>
</applet>
*/