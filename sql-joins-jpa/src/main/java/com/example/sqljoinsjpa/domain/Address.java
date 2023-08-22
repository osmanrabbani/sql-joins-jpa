package com.example.sqljoinsjpa.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_id")

    private Long addressId;

    private String city;

    @OneToOne(cascade = CascadeType.ALL,  fetch = FetchType.LAZY )
    @JoinColumn(name = "student_id")
    @JsonBackReference
    private Student student;

}
