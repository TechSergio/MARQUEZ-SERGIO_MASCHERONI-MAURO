package com.parcial.dao.impl;

import com.parcial.dao.IDao;
import com.parcial.entity.Odontologo;
import org.apache.log4j.Logger;

import java.util.List;

public class OdontologoDaoEnMemoria implements IDao<Odontologo> {
    private static final Logger LOGGER = Logger.getLogger(OdontologoDaoEnMemoria.class);
    private final List<Odontologo> odontologoRepository;

    public OdontologoDaoEnMemoria(List<Odontologo> odontologoRepository) {
        this.odontologoRepository = odontologoRepository;
    }

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        odontologoRepository.add(odontologo);
        LOGGER.info("Odontologo guardado: " + odontologo);
        return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() {
        LOGGER.info("Listado de todos los odontologos: \n" + odontologoRepository);
        return odontologoRepository;
    }
}
