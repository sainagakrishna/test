package WebdriversExamples;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
public class Sikuli {
public static void main(String args[]) throws Exception {
	Screen s =new Screen();
	s.click("D:\\Selenium\\min.PNG");
	Thread.sleep(2000);
s.doubleClick("D:\\Selenium\\edge.PNG");
}
}
