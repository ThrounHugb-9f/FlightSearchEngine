package search;

import java.util.ArrayList;
import java.io.IOException;
import java.util.*;

import admin.*;
import booking.*;
import user.*;


public class SearchController {
	FlightManager flightManager = new FlightManager();
	//FlightModel[] flights;
	
	// Constructor
	public SearchController() {
		
	}
	
	public FlightModel[] getFlightsByPriceRange(int lower, int higher) throws IOException {
		FlightModel[] flights = new FlightModel[10];
		
		if (lower < 0 || lower > higher) throw new IOException("The value chosen for low is illeagal!");
		
		flights = flightManager.getFlightsByPriceRange(lower, higher);
		
		return flights;
	}
	
	/*
	public ArrayList<FlightModel> orderByPrice() {
		
		Collections.sort(flights, new Comparator<FlightModel>() {
			@Override public int compare(FlightModel p1, FlightModel p2) {
				return p1.getPrice() - p2.getPrice(); //Orders in ascending order
			}
		});
		
		return flights;
	}
	*/
	
	public static void main (String[] args) throws Exception {
		SearchController test = new SearchController();
		
		//FlightManager test = new FlightManager();
		
		// FlightModel[] flights = test.getFlightsByPriceRange(5500, 15000);
		
		//String price = "30.02.2017";
		
		FlightModel[] flights = test.getFlightsByPriceRange(50000, 60000);
		
		for (FlightModel i : flights) {
			System.out.print(i.getFlightnumber() + " ");
			System.out.print(i.getDeparture() + " ");
			System.out.print(i.getArrival() + " ");
			System.out.print(i.getDeparturedate() + " ");
			System.out.print(i.getDeparturetime() + " ");
			System.out.print(i.getArrivaldate() + " ");
			System.out.print(i.getArrivaltime() + " ");
			System.out.print(i.getSeats() + " ");
			System.out.println(i.getPrice());
			System.out.println();
		}
	}
	
}
