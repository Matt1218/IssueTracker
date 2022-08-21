package com.example.IssueTracker.repos;

import com.example.IssueTracker.models.UserResource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserResource, Long> {

    UserResource findByUsernameAndPassword(String username, String password);

    UserResource findByUsername(String username);

    UserResource findByPassword(String password);

}
