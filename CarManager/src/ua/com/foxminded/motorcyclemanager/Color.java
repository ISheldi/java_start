package ua.com.foxminded.motorcyclemanager;

public enum Color {
    BLACK("Black"), ORANGE("Orange");

    private String nameColor;

    Color(String nameColor) {
        this.nameColor = nameColor;
    }

    @Override
    final public String toString() {
        return nameColor;
    }
}




