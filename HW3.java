//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HW3 {
    public static void main(String[] args) {

        double[] num = new double[]{10.4,4.2,-5.7,3.7,-56.3,-43.5,-33.23,4.22,-6.4,8.22,9.3,-67.234,23.1,56.2,-23.8};
        double total=0;
        for(double sum :num){
            if (sum > 0){
                total+=sum;

            }

        }
        System.out.println(total);


    }
}