package com.example.demorail;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, Object> home() {
        return Map.of(
            "app", "demorail",
            "status", "ok",
            "mensaje", "API de Productos desplegada en Railway",
            "endpoints", List.of(
                "GET  /productos",
                "GET  /producto/{id}",
                "GET  /buscarPorPrecio/{precio}",
                "POST /registrar",
                "DELETE /producto/{id}",
                "GET  /health"
            )
        );
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }
}
