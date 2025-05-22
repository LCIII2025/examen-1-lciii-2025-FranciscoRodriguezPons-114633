package org.example.parking;

import org.junit.Test;

import static junit.framework.Assert.*;


public class EstacionamientoTest {

    @Test
    public void testRetirarVehiculo() throws Exception {
        //TODO test LISTO
        Estacionamiento estacionamiento = new Estacionamiento();
        Vehiculo vehiculo = new Vehiculo("ABC123", "Ford Fiesta", Vehiculo.Tipo.AUTO);
        String dni = "12345678";
        String nombre = "Juan";

        boolean ingresoExitoso = estacionamiento.ingresarVehiculo(dni, nombre, vehiculo);
        assertTrue(ingresoExitoso);

        Ticket ticket = estacionamiento.retirarVehiculo("ABC123");
        assertNotNull(ticket.getHoraSalida());

    }

    @Test
    public void testCalcularPrecio() throws Exception {
        // TODO test LISTO
        Cliente cliente = new Cliente("12345678","Juan");
        Vehiculo vehiculo = new Vehiculo("AD529JT", "Ford Focus", Vehiculo.Tipo.AUTO);

        Ticket ticket = new Ticket(cliente, vehiculo);
        ticket.setHoraSalida(ticket.getHoraEntrada().plusMinutes(90));

        double precio = ticket.calcularPrecio();
        assertEquals(200.0, precio);
    }


}