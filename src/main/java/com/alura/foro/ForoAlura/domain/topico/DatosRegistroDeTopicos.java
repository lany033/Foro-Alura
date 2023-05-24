package com.alura.foro.ForoAlura.domain.topico;

import com.alura.foro.ForoAlura.domain.Curso;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record DatosRegistroDeTopicos(
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
}
