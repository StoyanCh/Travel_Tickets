package com.springcourse.springboot.demo.ticket_sale.data.services;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Other.Workplace;
import com.springcourse.springboot.demo.ticket_sale.data.repositories.WorkplacesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkplacesService {

    @Autowired
    private WorkplacesRepository workplacesRepository;

    public List<Workplace> getAllWorkplaces() {
        return workplacesRepository.findAll();
    }

    public Workplace getWorkplaceById(Long id) {
        return workplacesRepository.findById(id).orElse(null);
    }

    public Workplace createWorkplace(Workplace workplace) {
        return workplacesRepository.save(workplace);
    }

    public Workplace updateWorkplace(Long id, Workplace workplace) {
        if (workplacesRepository.existsById(id)) {
            workplace.setWorkplace_id(id);
            return workplacesRepository.save(workplace);
        }
        return null;
    }

    public void deleteWorkplace(Long id) {
        workplacesRepository.deleteById(id);
    }
}
