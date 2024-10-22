package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Ticket;
import com.nt.service.ITicketService;

@RestController
@RequestMapping("/ticket-base")
public class TicketController {
@Autowired
ITicketService ticketService;
	
@PostMapping("/createTicket")
public ResponseEntity<String> createTicket(@RequestBody Ticket ticket)
{
	ResponseEntity<String> ticketCreationObject = ticketService.createTicket(ticket);
	return ticketCreationObject;
}
}
