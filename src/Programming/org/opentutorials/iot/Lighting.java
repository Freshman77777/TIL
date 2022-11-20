package Programming.org.opentutorials.iot;

import java.util.Random;

public class Lighting implements OnOff{
	String _id;
	public Lighting(String id){
		this._id = id;
	}
	public boolean on() {
		System.out.println(this._id + " �넂 Lighting on");
		return true;
	}
	public boolean off() {
		System.out.println(this._id + " �넂 Lighting off");
		return true;
	}
	public Boolean isOn() {
		Random rand = new Random();
		return rand.nextBoolean();
	}
	
}