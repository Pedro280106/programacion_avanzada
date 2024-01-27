package com.ceduk.streming.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "cat_estudios")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CatEstudios implements Serializable {
    @Id
    @Column(name = "idu_estudio")
    private int iduEstudio;

    @Column(name = "nom_estudio")
    private String nombre;
}
