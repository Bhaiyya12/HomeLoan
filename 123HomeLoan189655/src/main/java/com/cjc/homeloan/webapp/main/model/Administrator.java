package com.cjc.homeloan.webapp.main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Administrator {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userName;
    private String passWord;
    private String email;
    private String userType;
    private String name;
    @Lob
    @Column(length = 999999999)
    private byte[] profilephoto;
}
