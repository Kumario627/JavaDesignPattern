package singleton;

public enum Triple {
    ALPHA,
    BETA,
    GAMMA;

    Triple() {
        System.out.println("The instance" + this + " is created.");
    }

    public static Triple getInstance(String name) {
        return Triple.valueOf(name);
    }
}
