package com.ceduk.streming.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "ctl_multimedias")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CtlMultimedia implements Serializable {

    @Id

    @Column(name = "idu_multimedia")
    private Integer iduMultimedia;

    @Column(name = "nom_titulo")
    private  String nomTitulo;

    @ManyToOne

    @JoinColumn(name = "idu_genero")
    private CatGenero iduGenero;

    @ManyToOne

    @JoinColumn(name = "idu_clasificacion")
    private CatClasificacion iduClasificacion;

    @ManyToOne

    @JoinColumn(name = "idu_estudio")
    private CatEstudio iduEstudio;

    @ManyToOne

    @JoinColumn(name = "idu_contenido")
    private CtlContenido iduContenido;
}
