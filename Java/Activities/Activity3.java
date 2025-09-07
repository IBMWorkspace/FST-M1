package Activites;

public class Activity3 {
	 public static void main(String[] args) {
	        double seconds = 1000000000;

	        
	        double EarthSeconds = 31557600;
	        double MercurySeconds = 0.2408467 * EarthSeconds;
	        double VenusSeconds = 0.61519726 * EarthSeconds;
	        double MarsSeconds = 1.8808158 * EarthSeconds;
	        double JupiterSeconds = 11.862615 * EarthSeconds;
	        double SaturnSeconds = 29.447498 * EarthSeconds;
	        double UranusSeconds = 84.016846 * EarthSeconds;
	        double NeptuneSeconds = 164.79132 * EarthSeconds;

	     
	        double ageOnEarth = seconds / EarthSeconds;
	        double ageOnMercury = seconds / MercurySeconds;
	        double ageOnVenus = seconds / VenusSeconds;
	        double ageOnMars = seconds / MarsSeconds;
	        double ageOnJupiter = seconds / JupiterSeconds;
	        double ageOnSaturn = seconds / SaturnSeconds;
	        double ageOnUranus = seconds / UranusSeconds;
	        double ageOnNeptune = seconds / NeptuneSeconds;

	        
	        System.out.printf("Age on Earth: %.2f years%n", ageOnEarth);
	        System.out.printf("Age on Mercury: %.2f years%n", ageOnMercury);
	        System.out.printf("Age on Venus: %.2f years%n", ageOnVenus);
	        System.out.printf("Age on Mars: %.2f years%n", ageOnMars);
	        System.out.printf("Age on Jupiter: %.2f years%n", ageOnJupiter);
	        System.out.printf("Age on Saturn: %.2f years%n", ageOnSaturn);
	        System.out.printf("Age on Uranus: %.2f years%n", ageOnUranus);
	        System.out.printf("Age on Neptune: %.2f years%n", ageOnNeptune);
	    }
}
