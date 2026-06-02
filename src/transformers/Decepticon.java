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
        System.out.println(getName() + " трансформируется в назменый транспорт, воздушный транспорт, оружие, технику");
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public boolean getKindness() {
        return kindness;
    }

    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }
}
