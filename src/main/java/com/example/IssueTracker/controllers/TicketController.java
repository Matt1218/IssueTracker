package com.example.IssueTracker.controllers;

import com.example.IssueTracker.models.TicketResource;
import com.example.IssueTracker.repos.TicketRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;


@RestController
public class TicketController {

    @Resource
    private TicketRepository ticketRepository;

    @GetMapping("/api/tickets")
    public Collection<TicketResource> getAllTickets(){
        return (Collection<TicketResource>) ticketRepository.findAll();
    }
}
