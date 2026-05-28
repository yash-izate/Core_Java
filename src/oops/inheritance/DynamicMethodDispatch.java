package oops.inheritance;

class Phone {

    public void showTime() {
        System.out.println("It is 12:30 pm");
    }

    public void on() {
        System.out.println("Turning on phone.");
    }
}

class Smartphone extends Phone {
    public void music() {
        System.out.println("Tera Dhyan Kidhar...");
    }

    public void on() {
        System.out.println("Turning on smartphone");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
//        Phone ob1 = new Phone();                   //Allowed
//        Smartphone ob2 = new Smartphone();         //Allowed
//        Smartphone obj = new Phone();              //Not Allowed

        Phone ob3 = new Smartphone();
        ob3.on();
        ob3.showTime();

    }
}