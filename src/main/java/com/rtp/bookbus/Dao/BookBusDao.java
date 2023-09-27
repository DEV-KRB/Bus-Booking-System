package com.rtp.bookbus.Dao;

import java.util.List;

import com.rtp.bookbus.entity.Admin;
import com.rtp.bookbus.entity.Booking;
import com.rtp.bookbus.entity.Bus;
import com.rtp.bookbus.entity.Operator;
import com.rtp.bookbus.entity.User;

public interface BookBusDao {

	public List<Admin> ShowAdmins();
	public List<User> ShowUsers();
	public List<Bus> ShowBuses();
	public List<Operator> ShowOperators();
	public List<Booking> ShowBookings();
}
