package com.paradigma.PruebaPostgre.repository;

import com.paradigma.PruebaPostgre.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;


@Repository
public interface UserRepository extends JpaRepository<User, Serializable>{

    User findByUserName(String userName);

}
