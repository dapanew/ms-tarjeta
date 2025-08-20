package com.banco.popular.ms_tarjeta.infraestructure.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.banco.popular.ms_tarjeta.infraestructure.entities.TarjetaCredito;
import com.banco.popular.ms_tarjeta.infraestructure.servicies.TarjetaCreditoService;
import com.banco.popular.ms_tarjeta.infraestructure.servicies.TarjetaCreditoServiceImpl;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/tarjeta-credito")
public class TarjetaCreditoController {
@Autowired
private TarjetaCreditoService tarjetaCreditoService; 
private static final Logger log = LoggerFactory.getLogger(TarjetaCreditoController.class);


@GetMapping("/allTarjetas")
public List<TarjetaCredito> getAllTarjetasCredito() {
    return tarjetaCreditoService.getAllTarjetasCredito();
}
@GetMapping("/{idTarjetaCredito}")
public ResponseEntity<?> getTarjetaCreditoById(@PathVariable Long idTarjetaCredito) {
    TarjetaCredito tarjetaCredito = tarjetaCreditoService.getTarjetaCreditoById(idTarjetaCredito);
    log.info(" Inicio Consultando tarjeta de credito con id: {}", idTarjetaCredito);
    if (tarjetaCredito != null) {
          log.info(" fin Consultando tarjeta de credito con id: {}",+ idTarjetaCredito);
        return ResponseEntity.ok(tarjetaCredito);
       

    } else {
          log.info(" no se encontro ningun dato asociado a la  tarjeta de credito con id: {}",+ idTarjetaCredito);
         return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonMap("error", " no se encontro ningun dato asociado a la  tarjeta de credito con id: "+idTarjetaCredito));
    }
    //return new String();

@DeleteMapping("/{idTarjetaCredito}")
public ResponseEntity<Void> deleteTarjetaCredito(@PathVariable Long idTarjetaCredito) {        
    TarjetaCredito tarjetaCredito = tarjetaCreditoService.getTarjetaCreditoById(idTarjetaCredito);
    if (tarjetaCredito != null) {
        tarjetaCreditoService.deleteTarjetaCredito(idTarjetaCredito);
        log.info(" Tarjeta de credito con id: {} eliminada correctamente", idTarjetaCredito);
        return ResponseEntity.noContent().build();
    } else {
        log.info(" no se encontro ningun dato asociado a la  tarjeta de credito con id: {}",+ idTarjetaCredito);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}


}
