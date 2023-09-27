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
@Table(name = "buses")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_id")
    private int busId;

    @ManyToOne
    @JoinColumn(name = "operator_id", nullable = false)
    private Operator operator;

    @Column(name = "bus_name", nullable = false)
    private String busName;

    @Column(name = "source_location", nullable = false)
    private String sourceLocation;

    @Column(name = "destination_location", nullable = false)
    private String destinationLocation;

    @Column(name = "departure_datetime", nullable = false)
    private LocalDateTime departureDatetime;

    @Column(name = "arrival_datetime", nullable = false)
    private LocalDateTime arrivalDatetime;

    @Column(name = "total_seats", nullable = false)
    private int totalSeats;

    @Column(name = "available_seats", nullable = false)
    private int availableSeats;

    @Column(name = "fare", nullable = false)
    private BigDecimal fare;
    
    public Bus() {
    	
    }

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getSourceLocation() {
		return sourceLocation;
	}

	public void setSourceLocation(String sourceLocation) {
		this.sourceLocation = sourceLocation;
	}

	public String getDestinationLocation() {
		return destinationLocation;
	}

	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}

	public LocalDateTime getDepartureDatetime() {
		return departureDatetime;
	}

	public void setDepartureDatetime(LocalDateTime departureDatetime) {
		this.departureDatetime = departureDatetime;
	}

	public LocalDateTime getArrivalDatetime() {
		return arrivalDatetime;
	}

	public void setArrivalDatetime(LocalDateTime arrivalDatetime) {
		this.arrivalDatetime = arrivalDatetime;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public BigDecimal getFare() {
		return fare;
	}

	public void setFare(BigDecimal fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", operator=" + operator + ", busName=" + busName + ", sourceLocation="
				+ sourceLocation + ", destinationLocation=" + destinationLocation + ", departureDatetime="
				+ departureDatetime + ", arrivalDatetime=" + arrivalDatetime + ", totalSeats=" + totalSeats
				+ ", availableSeats=" + availableSeats + ", fare=" + fare + "]";
	}

	public Bus(Operator operator, String busName, String sourceLocation, String destinationLocation,
			LocalDateTime departureDatetime, LocalDateTime arrivalDatetime, int totalSeats, int availableSeats,
			BigDecimal fare) {
		
		this.operator = operator;
		this.busName = busName;
		this.sourceLocation = sourceLocation;
		this.destinationLocation = destinationLocation;
		this.departureDatetime = departureDatetime;
		this.arrivalDatetime = arrivalDatetime;
		this.totalSeats = totalSeats;
		this.availableSeats = availableSeats;
		this.fare = fare;
	}
    
}
