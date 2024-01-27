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
@Table(name = "cat_tipos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CatTipos implements Serializable {
    @Id
    @Column(name = "idu_tipo")
    private int iduTipo;

    @Column(name = "des_tipo")
    private String descripcion;
}
