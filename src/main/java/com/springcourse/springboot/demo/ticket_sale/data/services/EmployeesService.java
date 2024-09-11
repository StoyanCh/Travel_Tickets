package com.springcourse.springboot.demo.ticket_sale.data.services;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Employees.Employee;
import com.springcourse.springboot.demo.ticket_sale.data.repositories.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeesService {

    @Autowired
    private EmployeesRepository employeesRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public List<Employee> getAllEmployees() {
        return employeesRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeesRepository.findById(id);
    }

    @Transactional
    public void addEmployee(String fname, String sname, String lname, String egn, String idcardnum, String photo,
                            String username, String password, String phoneNumber, String email, Long positionId, Long agencyId, Long workplaceId) {
        entityManager.createNativeQuery("CALL add_employee(:fname, :sname, :lname, :egn, :idcardnum, :photo, :username, :password, :phoneNumber, :email, :positionId, :agencyId, :workplaceId)")
                .setParameter("fname", fname)
                .setParameter("sname", sname)
                .setParameter("lname", lname)
                .setParameter("egn", egn)
                .setParameter("idcardnum", idcardnum)
                .setParameter("photo", photo)
                .setParameter("username", username)
                .setParameter("password", password)
                .setParameter("phoneNumber", phoneNumber)
                .setParameter("email", email)
                .setParameter("positionId", positionId)
                .setParameter("agencyId", agencyId)
                .setParameter("workplaceId", workplaceId)
                .executeUpdate();
    }

    public Employee updateEmployee(Long id, Employee employeeDetails) {
        return employeesRepository.findById(id).map(employee -> {
            employee.setEmployee_fname(employeeDetails.getEmployee_fname());
            employee.setEmployee_sname(employeeDetails.getEmployee_sname());
            employee.setEmployee_lname(employeeDetails.getEmployee_lname());
            employee.setEmployee_egn(employeeDetails.getEmployee_egn());
            employee.setEmployee_idcardnum(employeeDetails.getEmployee_idcardnum());
            employee.setEmployee_photo(employeeDetails.getEmployee_photo());
            employee.setEmployee_username(employeeDetails.getEmployee_username());
            employee.setEmployee_password(employeeDetails.getEmployee_password());
            employee.setEmployee_phone_number(employeeDetails.getEmployee_phone_number());
            employee.setEmployee_email(employeeDetails.getEmployee_email());
            employee.setEmployee_positions(employeeDetails.getEmployee_positions());
            employee.setAgency(employeeDetails.getAgency());
            employee.setWorkplace(employeeDetails.getWorkplace());
            return employeesRepository.save(employee);
        }).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public void deleteEmployee(Long id) {
        employeesRepository.deleteById(id);
    }
}
