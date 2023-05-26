package com.parcial.service;

import com.parcial.dao.impl.OdontologoDaoEnMemoria;
import com.parcial.dao.impl.OdontologoDaoH2;
import com.parcial.entity.Odontologo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class OdontologoServiceTest {
    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());
    private OdontologoService odontologoServiceEnMemoria = new OdontologoService(new OdontologoDaoEnMemoria(new ArrayList<>()));

    @Test
    public void listarTodosLosOdontologos() {
        List<Odontologo> odontologosTest = odontologoService.listarOdontologos();
        assertFalse(odontologosTest.isEmpty());
        assertTrue(odontologosTest.size() >= 3);

        System.out.println("-----------------------------------------------");


        Odontologo odontologo = new Odontologo(1, 133, "Sebastian", "Martinez");
        Odontologo odontologo2 = new Odontologo(2, 135, "Laura", "Fernandez");


        odontologoServiceEnMemoria.guardarOdontologo(odontologo);
        odontologoServiceEnMemoria.guardarOdontologo(odontologo2);

        assertFalse(odontologoServiceEnMemoria.listarOdontologos().isEmpty());
        assertTrue(odontologoServiceEnMemoria.listarOdontologos().size() >= 2);

    }

}
