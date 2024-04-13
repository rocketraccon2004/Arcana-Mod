package net.arcanamod.aspects;

/**
 * Stores a set of colours.
 */
public class ColourRange{

    private final int[] colours;

    private ColourRange(int[] colours) {
        this.colours = colours;
    }

    public static ColourRange create(int... colours) {
        return new ColourRange(colours);
    }

    public int get(int colour){
        return colours[Math.min(colour, colours.length - 1)];
    }
}
