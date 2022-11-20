import Programming.org.opentutorials.iot.Elevator;
import Programming.org.opentutorials.iot.Security;
import Programming.org.opentutorials.iot.Lighting;


public class OkJavaGoInhHome {

	public static void main(String[] args) {
		
		String id = "JAVA APT 507";
		
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
		

	}

}
