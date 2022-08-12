package com.example.IssueTracker.controllers;

import com.example.IssueTracker.models.TicketResource;
import com.example.IssueTracker.repos.TicketRepository;
import com.example.IssueTracker.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.Collection;


@RestController
public class TicketController {


    @Autowired
    private TicketService ticketService;

    @GetMapping("/api/tickets")
    public Collection<TicketResource> getAllTickets(){
        return ticketService.getAllTickets();
    }

    @GetMapping("/api/ticketByName/{name}")
    public TicketResource findTicketByName(@PathVariable String name){
        return ticketService.getTicketByName(name);
    }
}
