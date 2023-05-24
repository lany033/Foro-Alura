package com.alura.foro.ForoAlura.domain.topico;

import com.alura.foro.ForoAlura.domain.Curso;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id, String titulo, String mensaje, Estatus estatus, Curso curso) {
}
