package com.example.IssueTracker.services;

import com.example.IssueTracker.models.TicketResource;
import com.example.IssueTracker.repos.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    //POST
    public TicketResource saveTicket(TicketResource ticketResource){
        System.out.println(ticketResource.toString());
        return ticketRepository.save(ticketResource);
    }


    //GET
    public Collection<TicketResource> getAllTickets(){
        return (Collection<TicketResource>) ticketRepository.findAll();
    }

    public TicketResource getTicketByName(String name){
        return ticketRepository.findByName(name);
    }

    public TicketResource getTicketById(Long id){
        return ticketRepository.findById(id).orElse(null);
    }

    public TicketResource getTicketByPriority(String priority){
        return ticketRepository.findByPriority(priority);
    }

    public TicketResource getTicketByDescription(String description){
        return ticketRepository.findByDescription(description);
    }

    public TicketResource getTicketByType(String type){
        return ticketRepository.findByType(type);
    }

    public TicketResource getTicketByAssignedDeveloper(String assignedDeveloper){
        return ticketRepository.findByAssignedDeveloper(assignedDeveloper);
    }

    public TicketResource getTicketByStatus(String status){
        return ticketRepository.findByStatus(status);
    }

    public TicketResource getTicketByAssignedProject(String assignedProject){
        return ticketRepository.findByAssignedProject(assignedProject);
    }

    //Delete
    public void deleteById(Long id) {
        ticketRepository.deleteById(id);
    }
}
