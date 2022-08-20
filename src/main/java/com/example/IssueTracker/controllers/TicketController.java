package com.example.IssueTracker.controllers;

import com.example.IssueTracker.models.TicketResource;
import com.example.IssueTracker.services.TicketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.Collection;



@RestController
@CrossOrigin
public class TicketController {


    @Autowired
    private TicketService ticketService;
    private final Logger logger = LoggerFactory.getLogger(TicketController.class);

    //GET
    @GetMapping("/api/tickets")
    public Collection<TicketResource> getAllTickets(){
        return ticketService.getAllTickets();
    }

    @GetMapping("/api/ticketByName/{name}")
    public TicketResource findTicketByName(@PathVariable String name){
        return ticketService.getTicketByName(name);
    }

    @GetMapping("/api/tickets/{id}")
    public TicketResource findTicketById(@PathVariable Long id){
        return ticketService.getTicketById(id);
    }


    //POST
    @PostMapping("/api/addTicket")
    public TicketResource addTicket(@RequestBody TicketResource ticketResource) {
        logger.info("Ticket object {}", ticketResource.toString());
        return ticketService.saveTicket(ticketResource);
    }

    //DELETE
    @DeleteMapping("/api/{id}/deleteTicket")
    public void deleteTicket(@PathVariable Long id) {
        ticketService.deleteById(id);
    }

    //PUT
    @PutMapping("/api/updateTicket")
    public void updateTicket(@RequestBody TicketResource ticketResource){
        ticketService.updateTicket(ticketResource);
    }

    
}



