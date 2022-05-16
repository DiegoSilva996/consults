package com.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class ClientDto {
  
    private String id;
    private Boolean is_person;
    private Boolean is_comany;
    private String Name;
    private String Last_name;
    private String address;
    private String email;
    private String birthdate;
    private String status;
    private Boolean is_owner;
    private Boolean is_authorized_signer;
}