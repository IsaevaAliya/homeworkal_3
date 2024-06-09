
public class Main {
    public static void main(String[] args) {
        double[] numbers = {9.0, 6.0, 3.5, -2.5, 4.4, -2.6, -5.2, 11.4, -4.1, 1.8, -8.1, 9.8, -12.1, -6.4, 1.1};
        boolean negative = false;
        double sum = 0;
        int count = 0;

        for (double i : numbers
        ) {
            if (negative && i > 0) {
                sum += i;
                count++;
            }
            if (i < 0) {
                negative=true;
            }
        }
        double avg = sum / count;
        System.out.println("среднее арифметическое: "+avg);
    }
}