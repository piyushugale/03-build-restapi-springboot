// controller > dto > service > entity > repository
package com.example.RestAPI.dto;

import lombok.*;

@Getter
@Setter
public class StudentDto {
    private Long id;
    private String name;
    private String email;
}

/*
Note -
1. Adding Constructors  : Tried to add @Data, @NoArgsConstructor, @AllArgsConstructor - this did not create constructors by default hence had to comment
2. Adding Getter,Setters: Either do alt+insert > auto generate constructors and getters/setters OR @Getter, @Setter above class
*/

