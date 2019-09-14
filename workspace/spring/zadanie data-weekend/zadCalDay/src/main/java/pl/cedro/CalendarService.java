package pl.cedro;

import java.time.LocalDate;

public class CalendarService {

    //konstruktor
    public CalendarService() {
    }

    //metoda wskazuje datę
    public LocalDate getToday() {
        return LocalDate.now();
    }
}
