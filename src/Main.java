public class Main {
    public static void main(String[] args) {
        BmiService calc = new BmiService();
        double weight = 77.0; //вес в килограммах
        double height = 1.76; //рост в метрах
        double index = calc.calculate(weight, height);
        System.out.println("Индекс массы тела:" + index);
    }
}
