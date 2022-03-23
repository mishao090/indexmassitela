public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int growth = 10_000;
        int index = service.calculate(growth);
        System.out.println("Индекс массы тела: " + index);
    }
}