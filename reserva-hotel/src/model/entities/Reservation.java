package model.entities;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;


public class Reservation {
    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;
    LocalDate hourReservation;
    Boolean done = false;

    public Reservation(){}

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout){
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
         this.hourReservation = LocalDate.now();
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    private void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    private void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public long duration(){
        return ChronoUnit.DAYS.between(checkin, checkout);
    }

    public String updateDates(LocalDate checkin, LocalDate checkout){
        if (ChronoUnit.DAYS.between(hourReservation, checkin) <= 0){
            return "A data escolhida é invalida";
        }
        setCheckin(checkin);
        setCheckout(checkout);

        return "Success";
    }

    public Boolean alterCheckout(LocalDate newCheckout){
        LocalDate agora = LocalDate.now();
        if (ChronoUnit.DAYS.between(agora, checkout) > 0){
            return true;
        }

        return false;
    }

    public Boolean doingCheckin(){
        if(!done){
            this.done = true;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("Reserva: Quarto ");
        sb.append(roomNumber);
        sb.append(", Check-in: ");
        sb.append(checkin.format(fmt));
        sb.append(", Check-out: ");
        sb.append(checkout.format(fmt));
        sb.append(", Duração: ");
        sb.append(duration());
        sb.append(" dia(s)");
        return sb.toString();
    }
}
