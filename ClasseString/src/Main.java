
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        

        String stringConcat = "";
        
        var stringStart = OffsetDateTime.now(); 
        for(int i = 0; i<200_000; i++){
            stringConcat += i;
        }
        var stringEnd = OffsetDateTime.now(); 
        System.out.printf("String: %s \n",
        Duration.between(stringStart, stringEnd).toNanos());

        StringBuilder builderConcat = new StringBuilder();
        var stringBuilderStart = OffsetDateTime.now(); 
        for(int i = 0; i<200_000; i++){
            builderConcat.append(i);
        }
        var stringBuilderEnd = OffsetDateTime.now(); 
        System.out.printf("StringBuilder (poli trread): %s \n",
        Duration.between(stringBuilderStart, stringBuilderEnd).toNanos());

        var stringBufferStart = OffsetDateTime.now(); 
        StringBuffer bufferConcat = new StringBuffer();
        for(int i = 0; i<200_000; i++){
            bufferConcat.append(i);
        }
        var stringBufferEnd = OffsetDateTime.now(); 
        System.out.printf("StringBuffer (multi trread): %s \n",
        Duration.between(stringBufferStart, stringBufferEnd).toNanos());
        

    }
}
