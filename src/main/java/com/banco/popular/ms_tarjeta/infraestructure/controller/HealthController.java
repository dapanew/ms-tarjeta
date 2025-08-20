package com.banco.popular.ms_tarjeta.infraestructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    // Endpoint to check the health of the service
    @GetMapping("/")
    public String healthCheck() {
        return "Servicio de Tarjeta de Credito en funcionamiento";
    }

}
