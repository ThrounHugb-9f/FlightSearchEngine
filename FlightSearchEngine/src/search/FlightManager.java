package search;

import java.sql.*;
import admin.*;
import booking.*;
import user.*;
import java.util.*;

import javax.swing.JOptionPane;

public class FlightManager {
	
	// Attributes for SQL Connection
	Connection con = null;
	private final String url = "jdbc:postgresql://localhost:5432/fsdb";
	private final String driver = "org.postgresql.Driver";
	private final String userName = "Alienware";
	private final String password = "123456";
	
	// Constructor
	public FlightManager() {
		
    }
	
	// Connection to Database
	public Connection connect() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userName, password);
			if (con == null) {
				System.out.println("Connection cannot be established");
			}
			return con;
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return null;
	}
		
	public ArrayList<Flights> getFlightsByPriceRange(int lower, int higher) {
		..
		
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<FlightModel> flights = new ArrayList<FlightModel>();
		
		while(rs.next()) {
			FlightModel flight = new FlightModel();
			flight.setPrice(rs.getInt(price));
			
			
			flights.add(flight);
		}
		
		return flights;
		
	}
}
