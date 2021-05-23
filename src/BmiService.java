public class BmiService {
    public double calculate(double weight, double height) {
        int heightSquared = 2;
        double index = weight / (Math.pow(height, heightSquared));
        return index;
    }
}
