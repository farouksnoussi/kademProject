package tn.agena3000.cloud.kademproject;

import org.springframework.data.annotation.Transient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tests")
public class Test {
    @Id
    int id;
    @Column (name="lastNames")
    String lastName;
    @Transient
    String confirmPassword ;
}
//ki nbadlou issem table il table il 9dim yetfassa5 ou jdid