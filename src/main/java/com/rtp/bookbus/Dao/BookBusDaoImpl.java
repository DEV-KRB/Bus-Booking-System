package com.rtp.bookbus.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.rtp.bookbus.entity.Admin;
import com.rtp.bookbus.entity.Booking;
import com.rtp.bookbus.entity.Bus;
import com.rtp.bookbus.entity.Operator;
import com.rtp.bookbus.entity.User;

public class BookBusDaoImpl implements BookBusDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Admin> ShowAdmins() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Admin> query = session.createQuery("from Admins", Admin.class);
		
		List<Admin> admins = query.getResultList();
		
		return admins;
	}

	@Override
	public List<User> ShowUsers() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<User> query = session.createQuery("from Users", User.class);
		
		List<User> users = query.getResultList();
		
		return users;
	}

	@Override
	public List<Bus> ShowBuses() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Bus> query = session.createQuery("from Buses", Bus.class);
		
		List<Bus> buses = query.getResultList();
		
		return buses;
	}

	@Override
	public List<Operator> ShowOperators() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Operator> query = session.createQuery("from Operators", Operator.class);
		
		List<Operator> operators = query.getResultList();
		
		return operators;
	}

	@Override
	public List<Booking> ShowBookings() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Booking> query = session.createQuery("from Bookings", Booking.class);
		
		List<Booking> bookings = query.getResultList();
		
		return bookings;
	}

}
