package com.nathanielcassidy.bugtrackerv2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public ArrayList<Ticket> getAllTickets() {
        ArrayList<Ticket> tickets = new ArrayList<Ticket>();
        ticketRepository.findAll().forEach(tickets::add);

        return tickets;
    }

    public Optional<Ticket> getTicket(int id) {
        return ticketRepository.findById(id);
    }

    public void createTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    public void deleteTicket(int id) {
        ticketRepository.deleteById(id);
    }

    public void changeTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }
}
