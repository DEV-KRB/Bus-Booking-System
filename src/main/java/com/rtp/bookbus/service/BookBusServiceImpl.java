package com.rtp.bookbus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rtp.bookbus.Dao.BookBusDao;
import com.rtp.bookbus.entity.Admin;
import com.rtp.bookbus.entity.Booking;
import com.rtp.bookbus.entity.Bus;
import com.rtp.bookbus.entity.Operator;
import com.rtp.bookbus.entity.User;

@Service
public class BookBusServiceImpl implements BookBusService {

	@Autowired
	BookBusDao bookBusDao;
	
	@Transactional
	@Override
	public List<Admin> ShowAdmins() {
		
		return bookBusDao.ShowAdmins();
	}

	@Transactional
	@Override
	public List<User> ShowUsers() {
		
		return bookBusDao.ShowUsers();
	}

	@Transactional
	@Override
	public List<Bus> ShowBuses() {
		
		return bookBusDao.ShowBuses();
	}

	@Transactional
	@Override
	public List<Operator> ShowOperators() {
		
		return bookBusDao.ShowOperators();
	}

	@Transactional
	@Override
	public List<Booking> ShowBookings() {
		
		return bookBusDao.ShowBookings();
	}

}
