package transformers;

public class MainApp {
    public static void main(String[] args) {
        Autobot bumblebee = new Autobot("Bumblebee", "Autobots");
        Decepticon starscream = new Decepticon("Starscream", "Decepticons");

        bumblebee.run();
        starscream.run();

        bumblebee.fire();
        starscream.fire();

        bumblebee.charge();
        starscream.charge();

        bumblebee.transform();
        starscream.transform();
    }
}
