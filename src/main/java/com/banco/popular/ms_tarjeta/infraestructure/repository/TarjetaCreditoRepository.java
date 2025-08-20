package com.banco.popular.ms_tarjeta.infraestructure.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banco.popular.ms_tarjeta.infraestructure.entities.TarjetaCredito;
@Repository
public interface TarjetaCreditoRepository extends CrudRepository <TarjetaCredito, Long> {

}
