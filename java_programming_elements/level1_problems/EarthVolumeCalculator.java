package core_programming.java_programming_elements.level1_problems;

public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = Math.PI;

        double volumeKm = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;
        double volumeMiles = volumeKm*0.239913;

        System.out.println("The volume of earth in cubic kilometers is "+  volumeKm +" and cubic miles is "+ volumeMiles);
    }
}
