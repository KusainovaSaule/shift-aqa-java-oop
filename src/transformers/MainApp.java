package transformers;

import java.util.ArrayList;
import java.util.List;

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

        System.out.println("\nСписок трансформеров:");
        List<Transformer> transformers = new ArrayList<>();
        transformers.add(bumblebee);
        transformers.add(starscream);

        for (Transformer t : transformers) {
            System.out.println("Трансформер: " + t.name);
        }
    }
}
