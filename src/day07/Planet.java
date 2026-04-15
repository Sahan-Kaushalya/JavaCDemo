package day07;

public enum Planet {
    MERCURY(3.30e+23, 2.4397e6),
    VENUS(4.87e+24, 6.0518e6),
    EARTH(5.97e+24, 6.371e6),
    MOON(7.35e+22, 1.737e6),
    MARS(0.642e+24, 3.3895e6);

    // Instance variables for mass and radius
    private final double mass;   // in kilograms
    private final double radius; // in meters

    // Constructor to initialize mass and radius
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    // Method to calculate the surface gravity
    public double surfaceGravity() {
        final double G = 6.67430e-11; // Gravitational constant
        return G * mass / (radius * radius);
    }

    // Getter for mass
    public double getMass() {
        return mass;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Main method to demonstrate the usage of Planet enum
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.printf("%s: Mass = %.2e kg, Radius = %.2e m, Surface Gravity = %.2f m/s^2\n",
                    planet, planet.getMass(), planet.getRadius(), planet.surfaceGravity());
        }
    }
}
