package com.example.be1.Repository.user;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.management.relation.Role;
import java.util.Optional;

public interface IRoleRepository extends JpaRepository<Role, Integer> {
    @Query(value = "select * from roles where name = :name", nativeQuery = true)
    Optional<Role> findWithName (@Param("name") String name);
}
