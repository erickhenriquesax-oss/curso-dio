import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate localDate = LocalDate.now();
        var strDate = "22/12/2015";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter.format(localDate));
        System.out.println(LocalDate.parse(strDate, formatter));
        System.out.println(localDate.plus(50, ChronoUnit.DAYS)); //adicionando DIAS
        System.out.println(localDate.plusYears(20)); //Adicionando ANOS
        System.out.println(localDate.minusYears(2)); //Diminuindo ANOS
        System.out.println(localDate.getMonth()); //Pegando nome do MÊS
        System.out.println(localDate.withMonth(6)); //Setando no MÊS 06

        LocalTime localTime = LocalTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ISO_DATE_TIME;

        LocalDateTime localDateTime = localDate.atTime(localTime);
        System.out.println(formatter2.format(localDateTime));
        LocalDateTime localDateTime2 = localDate.atTime(localTime);
        System.out.println(formatter2.format(localDateTime2));

        System.out.println(Duration.between(localDateTime, localDateTime2).toMillis()); //Ver diferença de tempo entre 2 


        OffsetDateTime offsetDateTime = OffsetDateTime.now(); //pegando a data atual com a TimeZone
        System.out.println(offsetDateTime);
        
        offsetDateTime = offsetDateTime.withOffsetSameInstant(ZoneOffset.UTC); //Mudando a TimeZone
        System.out.println(offsetDateTime);

        localDateTime.toInstant(ZoneOffset.ofHours(-3));
    }
}
