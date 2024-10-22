package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nt.model.Ticket;
import com.nt.repository.ITicketRepository;
@Service
public class TicketServiceImplementation implements ITicketService{

	@Autowired
	ITicketRepository ticketRepository;
	
	@Override
	public ResponseEntity<String> createTicket(Ticket ticket) {
		
		Ticket ticketObject = ticketRepository.save(ticket);
		return new ResponseEntity<>("Ticket created with id: "+ticketObject.getTicketId(),HttpStatus.OK);
	}

}
