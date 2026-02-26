import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PTIT_CNTT2_IT203_SS13_Bai1 {
    public static void main(String[] args) {
        List<Double> temperatures = new ArrayList<>(Arrays.asList(36.5, 40.2, 37.0, 12.5, 39.8, 99.9, 36.8));
        System.out.printf("Danh sach ban dau :"+temperatures);
        Iterator<Double> iterator = temperatures.iterator();
        while(iterator.hasNext()){
            double temp = iterator.next();
            if (temp < 34.0 || temp > 42.0) {
                iterator.remove();
            }
        }
        System.out.printf("Danh sach sau khi loc :"+temperatures);
        double sum = 0;
        for (Double temp : temperatures) {
            sum += temp;
        }

        double average = temperatures.isEmpty() ? 0 : sum / temperatures.size();
        System.out.printf("Nhiệt độ trung bình: %.2f\n", average);
    }
}
