package com.alura.foro.ForoAlura.domain.topico;

import com.alura.foro.ForoAlura.domain.Curso;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record DatosListadoTopico(
        Long id,
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        Date fecha,
        @NotBlank
        String autor,
        @NotNull
        Curso curso,
        @NotNull
        Estatus estatus) {

    public DatosListadoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha(), topico.getAutor(), topico.getCurso(), topico.getEstatus());
    }
}
