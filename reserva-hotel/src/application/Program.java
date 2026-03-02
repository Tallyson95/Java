package application;

import model.entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //Reservation reserva1 = new Reservation(10, 12-05-2025, 12-05-2025);
        System.out.println("Data de checkin: DD/MM/YYYY");
        String checkin = sc.nextLine();
        System.out.println("Data de checkou: DD/MM/YYYY");
        String checkout = sc.nextLine();

        LocalDate now = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate in = LocalDate.parse(checkin, formatter);
        LocalDate out = LocalDate.parse(checkout, formatter);
        LocalDate rightNow = LocalDate.parse(now, formatter);

        if(validateDates(in, out)){
            Reservation reserva1 = new Reservation(110, in, out);
            System.out.println("Success!");
            System.out.println(reserva1.toString());

            System.out.println("Nova data de checkin: ");
            String newCheckin = sc.nextLine();
            System.out.println("Nova data de checkout: ");
            String newCheckout = sc.nextLine();

            LocalDate newIn = LocalDate.parse(newCheckin, formatter);
            LocalDate newOut = LocalDate.parse(newCheckout, formatter);

            reserva1.updateDates(newIn, newOut);
            System.out.println(reserva1.toString());


        }else{
            System.out.println("Datas invalidas!");
        }





    }

    public static Boolean validateDates(LocalDate checkIn, LocalDate checkout){
        if(ChronoUnit.DAYS.between(checkIn, checkout) < 0){
            return false;
        }
        return true;
    }
}
