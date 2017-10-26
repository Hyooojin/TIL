package basic.enumeration;
import static basic.enumeration.PowerState.OFF;
import static basic.enumeration.PowerState.ON;
import static basic.enumeration.PowerState.SUSPEND;;

public class Computer extends ElectricDevice {
	private PowerState state = OFF;
	
	public void turnOn() {
		state = ON;
	}
	public void turnOff() {
		state = OFF;
	}
	public void suspend() {
		state = SUSPEND;
	}
	
	public void setState(PowerState state) {
		switch (state) {
		case ON:
			turnOn();
			break;
		case OFF:
			turnOff();
			break;
		case SUSPEND:
			suspend();
			break;
		}
		System.out.println(state);
	}
}
