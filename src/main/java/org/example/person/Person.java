package org.example.person;
import lombok.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {

    private String fullname;

    private String email;

    private String phone;


    public String getFullname() {
        return fullname; // Özelliğin değerini döndür
    }
    public String getEmail() {
        return email; // Özelliğin değerini döndür
    }
    public String getPhone() {
        return phone; // Özelliğin değerini döndür
    }

    public String setFullname(String value) {
        fullname=value;
        return fullname;
    }
    public String setEmail(String value) {
        email=value;
        return email;
    }
    public String setPhone(String value) {
        phone=value;
        return phone;
    }


    public abstract void regCustomer();
}
