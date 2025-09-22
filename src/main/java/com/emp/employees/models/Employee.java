package com.emp.employees.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data  // @data est une annotation de Lombok. nul besoin d'ajouter les  getters et les setters. La libraire Lombok s'en charge pour nous. Trs utile pour alléger le code.
@Entity // la classe correspond à une table de la base de données.
@Table(name = "employees") // indique le nom de la table associée.

public class Employee {
    @Id // clé primaire
    @GeneratedValue (strategy = GenerationType.IDENTITY) // id auto-incrementé
    private Long id;
    @Column(name = "first_name") // indique le nom de la colonne associée.
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String mail;// par défaut, le nom de la colonne est le même que le nom de l'attribut.
    private String password;
    


    
}
