package com.alura.foro.ForoAlura.controller;

import com.alura.foro.ForoAlura.domain.usuarios.DatosAutenticacionUsuario;
import com.alura.foro.ForoAlura.domain.usuarios.Usuario;
import com.alura.foro.ForoAlura.infra.security.DatosJWTToken;
import com.alura.foro.ForoAlura.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/login")
public class AutenticacionController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private TokenService tokenService;

    //DTO -> Necesario cuando se recibe parametros desde el cliente
    @PostMapping
    public ResponseEntity autenticacionUsuario(@RequestBody @Valid DatosAutenticacionUsuario datosAutenticacionUsuario){
        Authentication authToken = new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.login(),
                datosAutenticacionUsuario.clave());
        var usuarioAutenticado = authenticationManager.authenticate(authToken);
        var JWTtoken = tokenService.generarToken((Usuario) usuarioAutenticado.getPrincipal());
        return ResponseEntity.ok(new DatosJWTToken(JWTtoken));
    }
}
