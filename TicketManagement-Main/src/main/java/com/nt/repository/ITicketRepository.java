package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Ticket;

public interface ITicketRepository extends JpaRepository<Ticket, Integer>{

}
