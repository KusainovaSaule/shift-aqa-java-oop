package transformers;

public class Autobot extends Transformer {
    private String teamName;
    private final String eyeColor;
    private boolean kindness;

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
        this.eyeColor = "синие";
        this.kindness = true;
    }

    public void transform() {
        System.out.println(getName() + " трансформируется в транспортное средство");
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
