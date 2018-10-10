import java.applet.Applet;
import java.awt.Graphics;

public class HelloJavaApp extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Welcome to Java Applet World!", 50, 25);
	}
}