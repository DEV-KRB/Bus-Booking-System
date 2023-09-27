package com.rtp.bookbus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rtp.bookbus.Dao.BookBusDao;
import com.rtp.bookbus.entity.Admin;
import com.rtp.bookbus.entity.Booking;
import com.rtp.bookbus.entity.Bus;
import com.rtp.bookbus.entity.Operator;
import com.rtp.bookbus.entity.User;

public class BookBusServiceImpl implements BookBusService {

	@Autowired
	BookBusDao bookBusDao;
	
	@Override
	public List<Admin> ShowAdmins() {
		
		return bookBusDao.ShowAdmins();
	}

	@Override
	public List<User> ShowUsers() {
		
		return bookBusDao.ShowUsers();
	}

	@Override
	public List<Bus> ShowBuses() {
		
		return bookBusDao.ShowBuses();
	}

	@Override
	public List<Operator> ShowOperators() {
		
		return bookBusDao.ShowOperators();
	}

	@Override
	public List<Booking> ShowBookings() {
		
		return bookBusDao.ShowBookings();
	}

}
