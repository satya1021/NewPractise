package com.practise;

public final class ImmutableClassExample {

	  // Values must be between 0 and 255.
    final private int red;
    final private int green;
    final private int blue;
    final private String name;

    private void check(int red,
                       int green,
                       int blue) {
        if (red < 0 || red > 255
            || green < 0 || green > 255
            || blue < 0 || blue > 255) {
            throw new IllegalArgumentException();
        }
    }

    public ImmutableClassExample(int red,
                        int green,
                        int blue,
                        String name) {
        check(red, green, blue);
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.name = name;
    }


    public int getRGB() {
        return ((red << 16) | (green << 8) | blue);
    }

    public String getName() {
        return name;
    }

    public ImmutableClassExample invert() {
        return new ImmutableClassExample(255 - red,
                       255 - green,
                       255 - blue,
                       "Inverse of " + name);
    }
    public static void main(String args[]){
    	
    	ImmutableClassExample immutable = new ImmutableClassExample(10, 20, 70, "satya");
    	immutable =  new ImmutableClassExample(10, 20, 70, "satya");
    	System.out.println(immutable.getRGB());
    }
}
