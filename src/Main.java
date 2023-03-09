import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(formatter));
    }
}
