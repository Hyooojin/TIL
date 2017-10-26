package basic.enumeration;
import static basic.enumeration.PowerState.OFF;
import static basic.enumeration.PowerState.ON;
import static basic.enumeration.PowerState.SUSPEND;;

public class ComputerTest {
	public static void main(String[] args) {
		Computer com = new Computer();
		com.setState(OFF);
		com.setState(ON);
		com.setState(SUSPEND);
	}
}
