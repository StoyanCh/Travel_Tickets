package com.springcourse.springboot.demo.ticket_sale.data.repositories;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Admins.AdminPositions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminsPositionsRepository extends JpaRepository<AdminPositions, Long> {
}
