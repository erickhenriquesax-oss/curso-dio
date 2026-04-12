import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {
    private static final Queue<Integer> numbers = new LinkedBlockingQueue<>(250_000);
    //private static final List<Integer> numbers = new ArrayList<>();
    private static void inc(int number){
            numbers.add(number);
    }
    private static void show(){
            System.out.println(numbers);
    };
    //private synchronized  static void inc(int number){numbers.add(number);//}
    //private synchronized  static void show(){System.out.println(numbers);//};
    public static void main(String[] args) throws Exception {
        
        Runnable inc = () -> {
            for(int i = 0; i<100_000; i++){
                inc(i);
            }
        };
        Runnable dec = () -> {
            for(int i = 0; i>-100_000; i--){
                inc(i);
            }
        };

        Runnable show = () -> {
            for(int i = 0; i<250_000; i++ ){
                show();
            }
        };
        Thread execInc = new Thread(inc, "execInc");
        Thread execDec = new Thread(dec, "execDec");
        Thread execShow = new Thread(show, "execShow");

        execInc.start();
        execDec.start();
        //execDec.join(Duration.ofSeconds(1));      JOIN "prioriza" uma determinada Thread
        execShow.start();

        System.out.println(execInc.getName());
        System.out.println(execDec.getName());
        System.out.println(execShow.getName());

        // Espera todas terminarem
        execInc.join();
        execDec.join();
        execShow.join();
    }
}
