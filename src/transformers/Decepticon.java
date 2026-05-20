package transformers;

public class Decepticon extends Transformer {
    private String teamName;
    private final String eyeColor;
    private boolean kindness;

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
        this.eyeColor = "красные";
        this.kindness = false;
    }

    public void transform() {
        System.out.println(name + " трансформируется в назменый транспорт, воздушный транспорт, оружие, технику");
    }
}
