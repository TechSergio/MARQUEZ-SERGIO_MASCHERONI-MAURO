package com.parcial.service;

import com.parcial.dao.impl.OdontologoDaoH2;
import com.parcial.entity.Odontologo;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OdontologoServiceTest {
    private static Connection connection = null;
    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @Test
    public void listarTodosLosOdontologos(){
        List<Odontologo> odontologosTest = odontologoService.listarOdontologos();
        assertFalse(odontologosTest.isEmpty());
        assertTrue(odontologosTest.size() >= 3);

    }

}
