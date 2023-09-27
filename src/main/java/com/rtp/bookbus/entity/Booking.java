package com.rtp.bookbus.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private int bookingId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "bus_id", nullable = false)
    private Bus bus;

    @Column(name = "booking_datetime", nullable = false)
    private LocalDateTime bookingDatetime;

    @Column(name = "num_tickets", nullable = false)
    private int numTickets;

    @Column(name = "total_amount", nullable = false)
    private BigDecimal totalAmount;

    public Booking() {
    	
    }

	public Booking(User user, Bus bus, LocalDateTime bookingDatetime, int numTickets, BigDecimal totalAmount) {
		
		this.user = user;
		this.bus = bus;
		this.bookingDatetime = bookingDatetime;
		this.numTickets = numTickets;
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", user=" + user + ", bus=" + bus + ", bookingDatetime="
				+ bookingDatetime + ", numTickets=" + numTickets + ", totalAmount=" + totalAmount + "]";
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public LocalDateTime getBookingDatetime() {
		return bookingDatetime;
	}

	public void setBookingDatetime(LocalDateTime bookingDatetime) {
		this.bookingDatetime = bookingDatetime;
	}

	public int getNumTickets() {
		return numTickets;
	}

	public void setNumTickets(int numTickets) {
		this.numTickets = numTickets;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
    
}

