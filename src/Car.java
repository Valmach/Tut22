/**
 * Created by valmach on 15/01/2017.
 */
public class Car extends Machine {
    @Override
	public void start() {
		System.out.println("Car Started");
		// TODO Auto-generated method stub
		super.start();
	}

	public void  wipeWindScreen(){
        System.out.println("Wiping windscreen ");
    }

}
 