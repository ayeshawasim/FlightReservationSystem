package com.upgrad.frs;

public class Main {

    public static void main(String[] args) {
        Ticket regularTicket = new RegularTicket("456", "  Hyderabad",
                "  Bangalore ", " DepartureDateTime", " ArrivalDateTime",
                " 82N ",  25000, false, null, null, " lunch");

        Ticket touristTicket = new TouristTicket("990", " Malaysia", " India ",
                " DepartureDateTime", " ArrivalDateTime",
                " 10A", 15000, false, null, null,
                " indian Hotel", new String[]{""});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.print(ticket.getPnr());
        System.out.print(ticket.getFrom());
        System.out.print(ticket.getTo());
        System.out.print(ticket.getPrice());

        System.out.println();
    }
}