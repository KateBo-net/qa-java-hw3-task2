public class BmiService {
    public int calculate(double weightInKg, double heightInMeters) {

        double bmiValue = weightInKg / (heightInMeters * heightInMeters);

        return (int) bmiValue;
    }
}
