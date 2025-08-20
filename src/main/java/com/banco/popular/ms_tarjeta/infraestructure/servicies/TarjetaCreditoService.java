package com.banco.popular.ms_tarjeta.infraestructure.servicies;

import java.util.List;

import com.banco.popular.ms_tarjeta.infraestructure.entities.TarjetaCredito;

public interface TarjetaCreditoService {
    List<TarjetaCredito> getAllTarjetasCredito();
    TarjetaCredito getTarjetaCreditoById(Long idtarjetaCredito);
    TarjetaCredito createTarjetaCredito(TarjetaCredito tarjetaCredito);
    TarjetaCredito updateTarjetaCredito(Long idtarjetaCredito, TarjetaCredito tarjetaCredito);
    void deleteTarjetaCredito(Long idtarjetaCredito);

}
