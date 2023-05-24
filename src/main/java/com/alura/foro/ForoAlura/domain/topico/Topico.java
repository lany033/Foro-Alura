package com.alura.foro.ForoAlura.domain.topico;

import com.alura.foro.ForoAlura.domain.Curso;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private Date fecha;
    private Boolean activo;

    @Enumerated(EnumType.STRING)
    private Estatus estatus;

    private String autor;

    @Enumerated(EnumType.STRING)
    private Curso curso;

    public Topico(DatosRegistroDeTopicos datosRegistroDeTopicos) {
        this.activo = true;
        this.titulo = datosRegistroDeTopicos.titulo();
        this.autor = datosRegistroDeTopicos.autor();
        this.mensaje = datosRegistroDeTopicos.mensaje();
        this.estatus = datosRegistroDeTopicos.estatus();
        this.fecha = datosRegistroDeTopicos.fecha();
        this.curso = datosRegistroDeTopicos.curso();

    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if(datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if (datosActualizarTopico.estatus() != null){
            this.estatus = datosActualizarTopico.estatus();
        }
        if (datosActualizarTopico.curso() != null){
            this.curso = datosActualizarTopico.curso();
        }
    }

    public void desactivarTopico() {
        this.activo = false;
    }
}
