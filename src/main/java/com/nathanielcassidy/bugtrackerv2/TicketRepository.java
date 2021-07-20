package com.nathanielcassidy.bugtrackerv2;


import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {
}
