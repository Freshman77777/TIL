import javax.swing.JOptionPane;

import Programming.org.opentutorials.iot.DimmingLights;
import Programming.org.opentutorials.iot.Elevator;
import Programming.org.opentutorials.iot.Security;
import Programming.org.opentutorials.iot.Lighting;


public class OkJavaGoInhHomeInput {

	
	// args (parameter 매개변수)
	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Enter a ID");
		String bright = JOptionPane.showInputDialog("Enter a Bright level");
		
		//Elevator call
		Programming.org.opentutorials.iot.Elevator myElevator = new Elevator (id);
		myElevator.callForUp(1);
		
		//Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//Light on
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + " / floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp ");
		moodLamp.setBright(Double.parseDouble(bright));  // Double.parseDouble(text); 스트링을 더블로 바꿔줌
		moodLamp.on();

	}

}
