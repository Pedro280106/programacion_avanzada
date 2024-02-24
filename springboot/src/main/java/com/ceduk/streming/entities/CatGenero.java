package com.ceduk.streming.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "cat_generos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatGenero  implements Serializable {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idu_genero")
    private Integer iduGenero;

    @Column(name = "nom_genero")
    private String nomGenero;
}
