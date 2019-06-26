package com.kodilla.hibernate.manytomany;

import org.hibernate.mapping.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@NamedNativeQueries({
        @NamedNativeQuery(
                name = "Company.findByFirstLetters",
                query = "SELECT * FROM COMPANIES WHERE substring(COMPANY_NAME, 1, 3)= :COMPANY_NAME",
                resultClass = Company.class)
})
        @NamedQuery(
                name = "Company.findByPartCompanyName",
                query = "FROM Company WHERE COMPANY_NAME LIKE CONCAT('%', :NAME, '%')")




@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }
        @Id
        @NotNull
        @GeneratedValue
        @Column(name = "COMPANY_ID", unique = true)
            public int getId() {
                return id;
            }
        @NotNull
        @Column(name = "COMPANY_NAME")
                public String getName() {
                return name;
            }
        @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
            public List<Employee> getEmployees() {
                return employees;
            }

            public void setEmployees(List<Employee> employees) {
                this.employees = employees;
            }

            private void setId(int id) {
                this.id = id;
            }

            private void setName(String name) {
                this.name = name;
            }
        }
