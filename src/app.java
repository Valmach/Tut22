/**
 * Created by valmach on 15/01/2017.
 */
public class app {
    public app() {
        super();
    }

    public static void main(String[] args) {
        Machine mach1 = new Machine();
        mach1.start();
        mach1.stop();
        Car car1 = new Car();

        car1.start();
        car1.wipeWindScreen();
        car1.stop();

    }
}
