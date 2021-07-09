package screenshots;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

	 
public class RobotScreenshots {
	
	public static void screenshot(Robot robot) throws AWTException, IOException {
		
	 robot= new Robot(); 
	
	Date currentdate=new Date();
	String ScreenshotFileName=currentdate.toString().replace(" ", "-").replace(":","-");
			
	Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rectangle= new Rectangle(screenSize);
	BufferedImage source  =robot.createScreenCapture(rectangle);
	File destination= new File("C:\\Users\\Jagadeesh\\Desktop\\Screenshot\\ROBOT_Screenshot\\IMG-"+ScreenshotFileName+".png");
	ImageIO.write(source, "png", destination);
	
	}}

