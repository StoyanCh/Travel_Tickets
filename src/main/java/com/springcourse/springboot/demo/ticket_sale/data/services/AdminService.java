package com.springcourse.springboot.demo.ticket_sale.data.services;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Admins.Admin;
import com.springcourse.springboot.demo.ticket_sale.data.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void addAdmin(Admin admin) {
        entityManager.createNativeQuery("SELECT add_admin(:fName, :sName, :lName, :positionId, :username, :password)")
                .setParameter("fName", admin.getAdmin_f_name())
                .setParameter("sName", admin.getAdmin_s_name())
                .setParameter("lName", admin.getAdmin_l_name())
                .setParameter("positionId", admin.getAdminsPosition().getAdmin_position_id())
                .setParameter("username", admin.getAdmin_username())
                .setParameter("password", admin.getAdmin_password())
                .executeUpdate();
    }

    public Admin getAdminById(Long adminId) {
        return adminRepository.findById(adminId).orElse(null);
    }

    public void updateAdmin(Admin admin) {
        adminRepository.save(admin);
    }

    public void deleteAdmin(Long adminId) {
        adminRepository.deleteById(adminId);
    }
}
