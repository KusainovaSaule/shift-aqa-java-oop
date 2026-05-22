package transformers;

public class Decepticon extends Transformer implements Action {
    private String teamName;
    private final String eyeColor;
    private boolean kindness;

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
        this.eyeColor = "красные";
        this.kindness = false;
    }

    @Override
    public void transform() {
        System.out.println(name + " трансформируется в наземный транспорт, воздушный транспорт, оружие, технику");
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
