package com.ceduk.streming.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "cat_estudios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatEstudio implements Serializable {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idu_estudio")
    private Integer iduEstudio;

    @Column(name = "nom_estudio")
    private String nomEstudio;
}
