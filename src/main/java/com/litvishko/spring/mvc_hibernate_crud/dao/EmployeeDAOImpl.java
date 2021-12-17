package com.litvishko.spring.mvc_hibernate_crud.dao;

import com.litvishko.spring.mvc_hibernate_crud.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> showAllEmps() {
        Session session = sessionFactory.getCurrentSession();

        List<Employee> employees = session.createQuery("from Employee", Employee.class).getResultList();
        return employees;
    }
}
