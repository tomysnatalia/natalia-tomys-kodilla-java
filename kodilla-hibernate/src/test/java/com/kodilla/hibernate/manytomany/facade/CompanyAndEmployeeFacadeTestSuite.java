package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyAndEmployeeFacadeTestSuite {

    @Autowired
    private CompanyAndEmployeeFacade companyAndEmployeeFacade;
    @Autowired
    private CompanyDao companyDao;

    private ArrayList<Company> resultCompanyList = new ArrayList<>();
    private ArrayList<Employee> resultEmployeeList = new ArrayList<>();


    @Test
    public void retrieveCompanyNameLikeTest() {

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee emmaSmith = new Employee("Emmma", "Smith");

        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company softgreyMatter = new Company("Soft Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMasters.getEmployees().add(stephanieClarckson);
        dataMasters.getEmployees().add(emmaSmith);
        softgreyMatter.getEmployees().add(johnSmith);
        softgreyMatter.getEmployees().add(emmaSmith);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(softgreyMatter);
        stephanieClarckson.getCompanies().add(dataMasters);
        emmaSmith.getCompanies().add(dataMasters);
        emmaSmith.getCompanies().add(softgreyMatter);

        companyDao.save(softwareMachine);
        companyDao.save(dataMasters);
        companyDao.save(softgreyMatter);

        resultCompanyList.add(softwareMachine);
        resultCompanyList.add(dataMasters);

        resultEmployeeList.add(johnSmith);
        resultEmployeeList.add(emmaSmith);
        //When
        List<Company> queryResult = companyAndEmployeeFacade.retrieveCompanyNameLike("oft");
        //Then
        assertEquals(resultCompanyList.size(), queryResult.size());
        //CleanUp
       try {
           companyDao.delete(softwareMachine);
           companyDao.delete(dataMasters);
           companyDao.delete(softgreyMatter);
        } catch (Exception e) {

       }
    }

    @Test
    public void retrieveEmployeeNameLikeTest() {

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee emmaSmith = new Employee("Emmma", "Smith");

        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company softgreyMatter = new Company("Soft Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMasters.getEmployees().add(stephanieClarckson);
        dataMasters.getEmployees().add(emmaSmith);
        softgreyMatter.getEmployees().add(johnSmith);
        softgreyMatter.getEmployees().add(emmaSmith);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(softgreyMatter);
        stephanieClarckson.getCompanies().add(dataMasters);
        emmaSmith.getCompanies().add(dataMasters);
        emmaSmith.getCompanies().add(softgreyMatter);

        companyDao.save(softwareMachine);
        companyDao.save(dataMasters);
        companyDao.save(softgreyMatter);

        resultCompanyList.add(softwareMachine);
        resultCompanyList.add(dataMasters);


        resultEmployeeList.add(johnSmith);
        resultEmployeeList.add(emmaSmith);
        //When
        List<Employee> queryResult = companyAndEmployeeFacade.retrieveEmployeeNameLike("mit");
        //Then
        assertEquals(resultEmployeeList.size(), queryResult.size());

        try {
            companyDao.delete(softwareMachine);
            companyDao.delete(dataMasters);
            companyDao.delete(softgreyMatter);
         } catch (Exception e) {

       }
    }
}

