import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("M/d/yyyy H:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime currentDate = LocalDateTime.now();
        return currentDate.isAfter(appointmentDate);        
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        LocalTime time = appointmentDate.toLocalTime();
        int hour = time.getHour();
        return hour >= 12 && hour < 18 ? true : false;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
        String formattedDate = appointmentDate.format(formatter);
        return "You have an appointment on " + formattedDate + ".";
    }

    public LocalDate getAnniversaryDate() {
        int currentYear = LocalDate.now().getYear();
        return LocalDate.of(currentYear, 9, 15);
    }
}
