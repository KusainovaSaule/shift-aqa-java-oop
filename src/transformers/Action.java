package transformers;

public interface Action {
    default void run() {
        System.out.println("бежит");
    }
    void fire();

    void charge();
}
