package com.ceduk.streming.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "cat_tipos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatTipo implements Serializable {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idu_tipo")
    private Integer iduTipo;

    @Column(name = "des_tipo")
    private String desTipo;
}
