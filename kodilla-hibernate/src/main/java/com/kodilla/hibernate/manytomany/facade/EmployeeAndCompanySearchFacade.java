package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeAndCompanySearchFacade {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeAndCompanySearchFacade.class);

    public List<Company> findCompany(String namePart) {
        LOGGER.info("Searching companies with: " + namePart);
      List<Company> companies = companyDao.findByPartCompanyName(namePart);
        if(companies.size() < 1) {
            LOGGER.info("No companies were found!");
        }
        return companies;
    }

    public List<Employee> findEmployee(String namePart) {
        LOGGER.info("Searching employees with: " + namePart);
        List<Employee> employees = employeeDao.findByPartName(namePart);
        if (employees.size() < 1) {
            LOGGER.info("No companies were found!");
        }
            return employees;

    }

}
