package transformers;

public class Autobot extends Transformer implements Action {
    private String teamName;
    private final String eyeColor;
    private boolean kindness;

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
        this.eyeColor = "синие";
        this.kindness = true;
    }

    @Override
    public void transform() {
        System.out.println(name + " трансформируется в транспортное средство");
    }

    @Override
    public void fire() {
        System.out.println(name + " стреляет");
    }

    @Override
    public void charge() {
        System.out.println(name + " заряжается");
    }
}
