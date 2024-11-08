package org.HibernateCrud;

import org.HibernateCrud.Entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       // Employee emp1 = new Employee("Aman","Devops","aman@gmail.com");

        Employee emp = new Employee();

        //create config object
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        //Create and manage session obj and it is heavyweight
        SessionFactory sessionFactory = config.buildSessionFactory();

        //Manages db operations like CRUD and quering lightweight
        Session session = sessionFactory.openSession();

        //It is used to begin,commit,or rollback
        Transaction transaction = session.beginTransaction();


        //-------------Insert method--------------------------
       /*try
       {
           session.save(emp);
           transaction.commit();
           System.out.println("User detail added successful");

       } catch (Exception e)
       {
           transaction.rollback();
           e.printStackTrace();
           System.out.println("User detail added failed");
       }*/


       //------------------Select method-----------------------
        /*try
        {
            Employee employee = session.get(Employee.class, 22);

            if(employee != null) {
                System.out.println("Name: "+ employee.getName());
                System.out.println("Id: "+employee.getId());
                System.out.println("Dept: "+ employee.getDept());
                System.out.println("Email: "+ employee.getEmail());
                System.out.println("_______________________");
            }else {
                System.out.println("User not found");
            }
        }
        catch (Exception e) {
           e.printStackTrace();
        }*/

        //--------------------Upate method------------------------
       /* try {
            Employee employee = session.get(Employee.class,3);
            employee.setDept("Cloud");

            session.saveOrUpdate(employee);
            transaction.commit();

            System.out.println("Employee detail updated");

        } catch (Exception e) {
            transaction.commit();
            e.printStackTrace();

            System.out.println("Employee details not update");
        }*/

        //-------------------Delete method----------------------
        /*try {
            Employee employee = new Employee();
            employee.setId(3);

             session.delete(employee);
             transaction.commit();
            System.out.println("Employee deleted successfully");

        }
        catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
            System.out.println("Employee not deleted");
        }*/

    }
}