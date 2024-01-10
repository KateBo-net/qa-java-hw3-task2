
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bmiExample1 = service.calculate(98, 1.87);
        System.out.println("Ваш индекс массы тела:  " + bmiExample1);

        int bmiExample2 = service.calculate(56, 1.70);
        System.out.println("Ваш индекс массы тела:  " + bmiExample2);

        int bmiExample3 = service.calculate(65, 1.58);
        System.out.println("Ваш индекс массы тела:  " + bmiExample3);

    }
}