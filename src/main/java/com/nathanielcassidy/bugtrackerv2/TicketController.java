package com.nathanielcassidy.bugtrackerv2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/tickets")
    public ArrayList<Ticket> getListOfTickets() {
        return ticketService.getAllTickets();
    }

    @RequestMapping("/tickets/{id}")
    public Optional<Ticket> getTicket(@PathVariable String id) {
        int intId = Integer.parseInt(id);
        return ticketService.getTicket(intId);
    }

    @RequestMapping(method=RequestMethod.POST, value="/tickets")
    public void createTicket(@RequestBody Ticket ticket) {
        ticketService.createTicket(ticket);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="tickets/{id}")
    public void deleteTicket(@PathVariable String id){
        int intId = Integer.parseInt(id);
        ticketService.deleteTicket(intId);
    }

    @RequestMapping(method = RequestMethod.PUT, value="tickets/{id}")
    public void updateTicket(@RequestBody Ticket ticket){
        ticketService.changeTicket(ticket);
    }

}
