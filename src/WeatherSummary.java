import java.util.Scanner;

public class WeatherSummary {
    /**
     * Reads newline-delimted temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
        Scanner scan = new Scanner(System.in);

        int count = 0;
        double total = 0;

        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
    

        while (scan.hasNextDouble()) {

            double temps = scan.nextDouble();

            //System.out.println(temps);

            if (temps > max) {
                max = temps;
            }

            if (temps < min) {
                min = temps;
            }
        
        total += temps;
        count++;
    }
    
        scan.close();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        
        if (count > 0) {
        double average = total / count;
        System.out.println("Average: " + average);
        }
    }
}

