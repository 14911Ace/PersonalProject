package Model;

import lombok.Data;

@Data
public class Employee {

    private Long id;
    private String name;
    private String address;
    private int phoneNumber;
    private String EmployeeType;
}
