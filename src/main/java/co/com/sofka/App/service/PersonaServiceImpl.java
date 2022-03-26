package co.com.sofka.App.service;

import co.com.sofka.App.repository.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements IPersonaService{

    @Autowired
    private IPersonaRepo repo;

    @Override
    public void registrar(String nombre) {
        repo.registrar(nombre);
    }
}
