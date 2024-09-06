//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HW3 {
    public static void main(String[] args) {

        double[] numbers = new double[]{ 3.5, 2.1, -1.4, 4.0, -2.3, 5.6, -0.9, 7.8, 6.2, -1.5, 8.9, -3.4, 2.2, 0.7, -4.5};


        boolean negativnumber= false;
        double sum = 0;
        int count = 0;
        double average;

        for (double num : numbers) {
            if (num < 0) {

                negativnumber = true;
            } else if (negativnumber) {
                sum += num;
                count++;
            }
        }


        if (count > 0) {
            average = sum / count;
        } else {
            average = 0;
        }
        System.out.println(average);

    }
}