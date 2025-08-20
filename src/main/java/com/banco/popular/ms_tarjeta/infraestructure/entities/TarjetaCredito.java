package com.banco.popular.ms_tarjeta.infraestructure.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tarjeta_credito")
public class TarjetaCredito {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@NotNull(message = "El idtarjetaCredito no puede ser nulo") 
private Long idtarjetaCredito;
private String clase;
private String descripcion;
private String franquicia;
@Column(name = "cupo", precision = 10, scale = 2)
@NotNull(message = "El cupo no puede ser nulo")
private BigDecimal  cupo;
//@Column(name = "saldo_actual", precision = 10, scale = 2)
@NotNull(message = "El saldo no puede ser nulo")
private BigDecimal  saldo_actual;
private long codigoSeguridad;
@NotNull(message = "la fechaExpedicion no puede ser nula")
private LocalDate fechaExpedicion;
@NotNull(message = "la fechaPoblamiento no puede ser nula")
private LocalDate fechaPoblamiento;
public TarjetaCredito() {
    // Constructor por defecto
}
public TarjetaCredito(Long idtarjetaCredito, String clase, String descripcion, String franquicia, BigDecimal cupo,
                      BigDecimal saldo_actual, long codigoSeguridad, LocalDate fechaExpedicion, LocalDate fechaPoblamiento) {
    this.idtarjetaCredito = idtarjetaCredito;
    this.clase = clase;
    this.descripcion = descripcion;
    this.franquicia = franquicia;
    this.cupo = cupo;
    this.saldo_actual = saldo_actual;
    this.codigoSeguridad = codigoSeguridad;
    this.fechaExpedicion = fechaExpedicion;
    this.fechaPoblamiento = fechaPoblamiento;
}
public Long getIdtarjetaCredito() {
    return idtarjetaCredito;
}
public void setIdtarjetaCredito(Long idtarjetaCredito) {
    this.idtarjetaCredito = idtarjetaCredito;
}
public String getClase() {
    return clase;
}
public void setClase(String clase) {
    this.clase = clase;
}
public String getDescripcion() {
    return descripcion;
}
public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}
public String getFranquicia() {
    return franquicia;
}
public void setFranquicia(String franquicia) {
    this.franquicia = franquicia;
}
public BigDecimal getCupo() {
    return cupo;
}
public void setCupo(BigDecimal cupo) {
    this.cupo = cupo;
}
public BigDecimal getSaldo_actual() {
    return saldo_actual;
}
public void setSaldo_actual(BigDecimal saldo_actual) {
    this.saldo_actual = saldo_actual;
}
public long getCodigoSeguridad() {
    return codigoSeguridad;
}
public void setCodigoSeguridad(long codigoSeguridad) {
    this.codigoSeguridad = codigoSeguridad;
}
public LocalDate getFechaExpedicion() {
    return fechaExpedicion;
}
public void setFechaExpedicion(LocalDate fechaExpedicion) {
    this.fechaExpedicion = fechaExpedicion;
}
public LocalDate getFechaPoblamiento() {
    return fechaPoblamiento;
}
public void setFechaPoblamiento(LocalDate fechaPoblamiento) {
    this.fechaPoblamiento = fechaPoblamiento;
}
@Override
public String toString() {
    return "TarjetaCredito [idtarjetaCredito=" + idtarjetaCredito + ", clase=" + clase + ", descripcion=" + descripcion
            + ", franquicia=" + franquicia + ", cupo=" + cupo + ", saldo_actual=" + saldo_actual + ", codigoSeguridad="
            + codigoSeguridad + ", fechaExpedicion=" + fechaExpedicion + ", fechaPoblamiento=" + fechaPoblamiento
            + ", getIdtarjetaCredito()=" + getIdtarjetaCredito() + ", getClase()=" + getClase() + ", getDescripcion()="
            + getDescripcion() + ", getFranquicia()=" + getFranquicia() + ", getClass()=" + getClass() + ", getCupo()="
            + getCupo() + ", getSaldo_actual()=" + getSaldo_actual() + ", getCodigoSeguridad()=" + getCodigoSeguridad()
            + ", getFechaExpedicion()=" + getFechaExpedicion() + ", getFechaPoblamiento()=" + getFechaPoblamiento()
            + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}



}
