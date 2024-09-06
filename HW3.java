//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HW3 {
    public static void main(String[] args) {
//initialing array
        double[] numbers = new double[]{ 3.5, 2.1, -1.4, 4.0, -2.3, 5.6, -0.9, 7.8, 6.2, -1.5, 8.9, -3.4, 2.2, 0.7, -4.5};

//initialing variables
        boolean negativnumber= false;
        double sum = 0;
        double average;
        int count =0;

//main cicle
        //
        for (double num : numbers) {
            //checking if first number is negative
            if (num < 0) {

                negativnumber = true;
            } else if (negativnumber) {
                sum += num;
                count++;
            }
        }
//founding the average
        if (count > 0) {
            average = sum / count;
        } else {
            average = 0;
        }

//result
        System.out.println(average);

    }
}