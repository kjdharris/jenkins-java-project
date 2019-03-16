package hello;
import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());


        LocalTime currentTime1 = new LocalTime();
        System.out.println("The current local time is: " + currentTime1);

        Greeter greeter1 = new Greeter();
        System.out.println(greeter1.sayHello());

    }
}
