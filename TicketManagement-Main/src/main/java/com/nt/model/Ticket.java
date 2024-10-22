package com.nt.model;

import java.time.LocalDateTime;

import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ticket")
@Entity
public class Ticket {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
Integer ticketId;

@Column(length = 30)
@NotNull
String ticketName;

@Column(length = 30)
@NotNull
String ticketAssignedTo;


@Column(length = 30)
@NotNull
String ticketAssignedBy;

@CreationTimestamp
LocalDateTime ticketCreatedTime;


}
