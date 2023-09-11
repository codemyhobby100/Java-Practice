public class EnergyCalc {
    public static void main(String[] args) {
        // Define the values for mass, velocity, acceleration due to gravity, and height
        double mass = 2.0; // Mass of the projectile
        double velocity = 10.0; // Velocity of the projectile
        double gravity = 9.8; // Acceleration due to gravity
        double height = 5.0; // Height of the projectile

        // Calculate the kinetic energy
        double kineticEnergy = 0.5 * mass * Math.pow(velocity, 2);

        // Calculate the potential energy
        double potentialEnergy = mass * gravity * height;

        // Calculate the total mechanical energy
        double totalEnergy = kineticEnergy + potentialEnergy;

        // Output the result
        System.out.println("The total mechanical energy of the projectile is: " + totalEnergy);
    }
}
