package org.example.person;
import lombok.*;


@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {

    // Özelliğin değerini döndür
    private String fullname;

    // Özelliğin değerini döndür
    private String email;

    // Özelliğin değerini döndür
    private String phone;


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


    public abstract void Online();

    public abstract void    regCustomer();
}
