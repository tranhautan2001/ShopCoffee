package com.example.be1.service.user;


import javax.management.relation.Role;
import java.util.Optional;

public interface IRoleService {
    Optional<Role> findByName (String name);
}
