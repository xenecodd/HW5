package org.example.employee;

import lombok.*;
import org.example.employee.Job;
import org.example.person.Person;

import javax.swing.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee extends Person {

    private Job job;

    @Override
    public void regCustomer(){

    }




}