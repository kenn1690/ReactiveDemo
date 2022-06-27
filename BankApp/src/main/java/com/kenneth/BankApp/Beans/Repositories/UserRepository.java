package com.kenneth.BankApp.Beans.Repositories;

import com.kenneth.BankApp.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("FROM User WHERE accountNumber = :randomAccountNumber")
    User accountNumberExists(@Param("randomAccountNumber") Long randomAccountNumber);

}
