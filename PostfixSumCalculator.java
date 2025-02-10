import java.util.Arrays;

public class PostfixSumCalculator {
    public static void main(String[] args) {
        int[] Fuel = {5, 10, 3, 7, 8};
        int[] PostfixSum = new int[Fuel.length];
       
        int sum = 0;
        for (int i = Fuel.length - 1; i >= 0; i--) {
            sum += Fuel[i];
            PostfixSum[i] = sum;
        }
       
        System.out.println(Arrays.toString(PostfixSum));
    }
}
