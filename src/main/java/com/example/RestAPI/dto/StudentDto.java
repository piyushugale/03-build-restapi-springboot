// controller > dto > service(i) > entity > repository(i)
package com.example.RestAPI.dto;

import lombok.*;

public class StudentDto {
    private Long id;
    private String name;
    private String email;

    public StudentDto(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

/*
Note -
1. Adding Constructors  : Tried to add @Data, @NoArgsConstructor, @AllArgsConstructor - this did not create constructors by default hence had to comment
2. Adding Getter,Setters: Either do alt+insert > auto generate constructors and getters/setters OR @Getter, @Setter above class
*/

