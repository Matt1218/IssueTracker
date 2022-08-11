package com.example.IssueTracker.repos;


import com.example.IssueTracker.models.TicketResource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<TicketResource, Long> {


}
