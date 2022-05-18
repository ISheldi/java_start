package ua.com.foxminded.motomanager;

public enum Color {
    BLACK("Black"), ORANGE("Orange"), WHITE("White"), YELLOW("Yellow"), BLUE("Blue"), GREEN("Green");

    private final String name;

    Color(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
