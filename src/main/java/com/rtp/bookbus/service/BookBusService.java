package com.rtp.bookbus.service;

import java.util.List;

import com.rtp.bookbus.entity.Admin;
import com.rtp.bookbus.entity.Booking;
import com.rtp.bookbus.entity.Bus;
import com.rtp.bookbus.entity.Operator;
import com.rtp.bookbus.entity.User;

public interface BookBusService {

	public List<Admin> ShowAdmins();
	public List<User> ShowUsers();
	public List<Bus> ShowBuses();
	public List<Operator> ShowOperators();
	public List<Booking> ShowBookings();
}
