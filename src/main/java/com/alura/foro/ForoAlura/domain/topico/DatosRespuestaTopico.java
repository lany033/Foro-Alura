package com.alura.foro.ForoAlura.domain.topico;

import com.alura.foro.ForoAlura.domain.Curso;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, Estatus estatus, Curso curso, Date fecha) {
}
