package org.example.customer;

import org.example.person.Person;
import org.example.utils.factory.IDBObject;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer extends Person implements IDBObject {


    @Override
    public void Online() {

    }

    public void Phone() {

    }

    @Override
    public void regCustomer() {

    }
}