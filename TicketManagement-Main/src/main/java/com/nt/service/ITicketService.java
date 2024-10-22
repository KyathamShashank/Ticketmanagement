package com.nt.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nt.model.Ticket;

@Service
public interface ITicketService {

public ResponseEntity<String> createTicket(Ticket ticket);
}
