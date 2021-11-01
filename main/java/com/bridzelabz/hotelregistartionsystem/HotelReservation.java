package com.bridzelabz.hotelregistartionsystem;

import java.util.ArrayList;

public class HotelReservation {

	ArrayList<Hotel> hotels = new ArrayList<>();

	/**
	 * This method is used to add hotel to the Hotel List
	 */
	public boolean addHotel(Hotel hotel) {
		return hotels.add(hotel);
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Hotel Reservation Program");
	}

}
