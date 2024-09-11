package com.springcourse.springboot.demo.ticket_sale.Data.Repositories;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Admins.AdminPositions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminsPositionsRepository extends JpaRepository<AdminPositions, Long> {
}
