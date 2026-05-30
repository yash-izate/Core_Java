package oops.inheritance;

interface MyCamera {

    void takeSnap();

    void recordVideo();
}

interface MyWifi {

    void getNetwork();

    void connectNetwork(String network);
}

class MyPhone {

    void callNumber(int phoneNumber) {

        System.out.println("Calling Number: " + phoneNumber);
    }

    void pickCall() {

        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyPhone
        implements MyCamera, MyWifi {

    @Override
    public void takeSnap() {

        System.out.println("Taking Snap");
    }

    @Override
    public void recordVideo() {

        System.out.println("Recording Video");
    }

    @Override
    public void getNetwork() {

        System.out.println("Searching for Networks...");
    }

    @Override
    public void connectNetwork(String network) {

        System.out.println("Connecting to: " + network);
    }
}

public class DefaultMethods {

    public static void main(String[] args) {

        MySmartPhone sp1 = new MySmartPhone();

        // Camera features
        sp1.takeSnap();
        sp1.recordVideo();

        System.out.println();

        // Wifi features
        sp1.getNetwork();
        sp1.connectNetwork("JioFiber");

        System.out.println();

        // Phone features
        sp1.callNumber(987654321);
        sp1.pickCall();
    }
}