import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Counter basicCounter = new Counter();
        System.out.println("Basic counter: " + basicCounter);
        basicCounter.increase();
        System.out.println("Basic counter after increase: " + basicCounter.getCount());

        System.out.println("Please enter range (min then max) and the initial value of the counter:");
        int min = Integer.parseInt(reader.readLine());
        int max = Integer.parseInt(reader.readLine());
        int count = Integer.parseInt(reader.readLine());

        Counter counter = new Counter(min, max, count);
        System.out.println("Counter before change: " + counter);
        counter.decrease();
        System.out.println("Counter after decrease: " + counter.getCount());
    }
}
