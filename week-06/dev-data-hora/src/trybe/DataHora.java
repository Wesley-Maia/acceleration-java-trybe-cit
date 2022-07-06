package trybe;

import java.time.Clock;
import java.time.LocalDateTime;

public class DataHora {
    public static void main(String[] args) {
        Clock relogio = Clock.systemDefaultZone();
        System.out.println(relogio.instant());

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        Clock sysClock = Clock.systemDefaultZone();
        System.out.println(sysClock);
    }
}
