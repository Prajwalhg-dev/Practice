class TrafficLight extends Thread {
    private final String[] states = {"RED", "GREEN", "YELLOW"};
    private final int[] durations = {3000, 3000, 1000};

    @Override
    public void run() {
        try {
            for (int cycle = 0; cycle < 3; cycle++) {
                for (int i = 0; i < states.length; i++) {
                    System.out.println(states[i]);
                    Thread.sleep(durations[i]);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight light = new TrafficLight();
        light.start();
        light.join();
        System.out.println("Simulation ended");
    }
}