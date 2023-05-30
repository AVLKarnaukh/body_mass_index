public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println();
        System.out.println("98 / 1.87");
        System.out.println("Индекс массы тела: " + service.calculate(98, 1.87));

        System.out.println();
        System.out.println("50 / 1.70");
        System.out.println("Индекс массы тела: " + service.calculate(50, 1.70));

        System.out.println();
        System.out.println("70 / 1.65");
        System.out.println("Индекс массы тела: " + service.calculate(70, 1.65));






    }

}
