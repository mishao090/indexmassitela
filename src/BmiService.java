public class BmiService {
    public int calculate(int index) {

        double growth = 1.75;

        int weight = 60;

         index = (int) (weight / Math.pow(growth, 2));


        return index;
    }
}
