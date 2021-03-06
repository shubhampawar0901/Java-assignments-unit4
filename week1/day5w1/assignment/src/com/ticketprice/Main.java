package com.ticketprice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ticket t1 = new Ticket();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of bookings :");
		int bookings = scan.nextInt();
		
		System.out.println("Enter the available tickets :");
		int avltickets = scan.nextInt();
		Ticket.setAvailableTickets(avltickets);
		
		for(int i=0; i<bookings;i++) {

			System.out.println("Enter the ticketid :");
			int ticketId = scan.nextInt();
			t1.setTicketid(ticketId);
			
			System.out.println("Enter the price :");
			int price  = scan.nextInt();
			t1.setPrice(price);
			
			System.out.println("Enter no of Tickets :");
			int noOftickets = scan.nextInt();
			int total = t1.calculateTicketCost(noOftickets);
			
			System.out.println("Total amount :"+total);
			System.out.println("Available ticket after booking :"+ Ticket.getAvailableTickets());

		}
		scan.close();
	}

}

class Ticket{
	
	int ticketid; 
	int price; 
	static int availableTickets;
	
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>=0) {
			Ticket.availableTickets = availableTickets;
		}
	}
	
	public int calculateTicketCost(int nooftickets) {
		Ticket.availableTickets = Ticket.availableTickets - nooftickets;
		
		if(Ticket.availableTickets>0) {
			int total = nooftickets*this.price;
			return total;
		}else {
			return -1;
		}
	}
	 
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}

	 
	 
}
