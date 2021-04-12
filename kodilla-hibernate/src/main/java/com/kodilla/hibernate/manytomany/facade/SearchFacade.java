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
public class SearchFacade {

    public static  final Logger LOGGER = LoggerFactory.getLogger(SearchExceptions.class);

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public List<Company> findCompanyByPartOfTheName(String partName) throws SearchExceptions {
        boolean wasError = false;
        List<Company> companies = companyDao.findByPartOfTheName(partName);
        LOGGER.info("Company search.");
        if (companies.size() <= 0) {
            LOGGER.error(SearchExceptions.ERR_COMPANY_NOT_FOUND);
            wasError = true;
            if (wasError) {
                LOGGER.info("Search errors encountered!");
                throw new SearchExceptions(SearchExceptions.ERR_COMPANY_NOT_FOUND);
            }
        }
        return companies;
    }

    public List<Employee> findEmployeeByPartOfTheName(String partName) throws SearchExceptions {
        boolean wasError = false;
        List<Employee> employees = employeeDao.findByPartOfTheName(partName);
        LOGGER.info("Employee search.");
        if (employees.size() <= 0) {
            LOGGER.error(SearchExceptions.ERR_EMPLOYEE_NOT_FOUND);
            wasError = true;
            if (wasError) {
                LOGGER.info("Search errors encountered!");
                throw new SearchExceptions(SearchExceptions.ERR_EMPLOYEE_NOT_FOUND);
            }
        }
        return employees;
    }
}
