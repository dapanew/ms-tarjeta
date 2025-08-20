package com.banco.popular.ms_tarjeta.infraestructure.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.banco.popular.ms_tarjeta.infraestructure.entities.TarjetaCredito;
import com.banco.popular.ms_tarjeta.infraestructure.repository.TarjetaCreditoRepository;

@Service
public class TarjetaCreditoServiceImpl implements TarjetaCreditoService {
private final TarjetaCreditoRepository tarjetaCreditoRepository;
    public TarjetaCreditoServiceImpl(TarjetaCreditoRepository tarjetaCreditoRepository) {
        this.tarjetaCreditoRepository = tarjetaCreditoRepository;
    }
    // Aquí se implementarán los métodos definidos en la interfaz TarjetaCreditoService
    // Por ejemplo, para obtener todas las tarjetas de crédito:
    
    @Override
    public List<TarjetaCredito> getAllTarjetasCredito() {
        // Lógica para obtener todas las tarjetas de crédito
        return (List<TarjetaCredito>) tarjetaCreditoRepository.findAll(); // Reemplazar con la implementación real
    }
@Transactional
    @Override
    public TarjetaCredito getTarjetaCreditoById(Long idtarjetaCredito) {
        // Lógica para obtener una tarjeta de crédito por su ID
        return tarjetaCreditoRepository.findById(idtarjetaCredito).orElse(null); // Reemplazar con la implementación real
    }

    @Override
    @Transactional
    public TarjetaCredito createTarjetaCredito(TarjetaCredito tarjetaCredito) {
        // Lógica para crear una nueva tarjeta de crédito
        return tarjetaCreditoRepository.save(tarjetaCredito); // Reemplazar con la implementación real
    }

    @Override
    public TarjetaCredito updateTarjetaCredito(Long idtarjetaCredito, TarjetaCredito tarjetaCredito) {
        // Lógica para actualizar una tarjeta de crédito existente
        Optional<TarjetaCredito> existingTarjeta = tarjetaCreditoRepository.findById(idtarjetaCredito);
        if (existingTarjeta.isPresent()) {
            TarjetaCredito updatedTarjeta = existingTarjeta.get();
            updatedTarjeta.setClase(tarjetaCredito.getClase());
            updatedTarjeta.setDescripcion(tarjetaCredito.getDescripcion());
            updatedTarjeta.setFranquicia(tarjetaCredito.getFranquicia());
            updatedTarjeta.setCupo(tarjetaCredito.getCupo());
            updatedTarjeta.setSaldo_actual(tarjetaCredito.getSaldo_actual());
            updatedTarjeta.setCodigoSeguridad(tarjetaCredito.getCodigoSeguridad());
            updatedTarjeta.setFechaExpedicion(tarjetaCredito.getFechaExpedicion());
            updatedTarjeta.setFechaPoblamiento(tarjetaCredito.getFechaPoblamiento());
            return tarjetaCreditoRepository.save(updatedTarjeta);
        }
        return null; 
    }

    @Override
    public void deleteTarjetaCredito(Long idtarjetaCredito) {
        // Lógica para eliminar una tarjeta de crédito por su ID
        tarjetaCreditoRepository.deleteById(idtarjetaCredito); // Reemplazar con la implementación real
    }




}
