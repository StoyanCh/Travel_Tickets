package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Admins;

import jakarta.persistence.*;
import java.util.Set;

@Entity(name = "admin_cans")
public class admin_cans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long admin_can_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String admin_can;

    @ManyToMany(mappedBy = "adminCans")
    private Set<admins> adminsSet;

    public admin_cans() {
    }

    public admin_cans(String admin_can) {
        this.admin_can = admin_can;
    }

    public Long getAdmin_can_id() {
        return admin_can_id;
    }

    public void setAdmin_can_id(Long admin_can_id) {
        this.admin_can_id = admin_can_id;
    }

    public String getAdmin_can() {
        return admin_can;
    }

    public void setAdmin_can(String admin_can) {
        this.admin_can = admin_can;
    }

    public Set<admins> getAdminsSet() {
        return adminsSet;
    }

    public void setAdminsSet(Set<admins> adminsSet) {
        this.adminsSet = adminsSet;
    }
}

/*
    -Чрез "length = размер", задаваме размерът на колоната,
    По подразбиране е length =255, но е хубаво да се опише дължинатак,
    както е в базата ни данни
    - Чрез "updatable = true", казаваме, че стойността, на това поле може
    да бъде променяна, ако е "updatable = false", не можем да променяме стойноста,
    веднъж щом е зададена
    - Чрез "nullable = false", казаваме че полето трябва да приеме стойност,
      а ако е "nullable = true", тогава полето може да остане празно
     - Чрез columnDefinition = "varchar(255)" задаваме типа и размера на пколоната,
     а ако добавим "default 'John Snow'", означава, че задаваме стойност по подразбиране*/