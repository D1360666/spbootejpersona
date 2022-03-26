package co.com.sofka.App.repository;

import co.com.sofka.App.App;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepoImplRepo implements IPersonaRepo {

    private static Logger LOG = LoggerFactory.getLogger(App.class);

    @Override
    public void registrar(String nombre) {
        LOG.info("Se registro a " + nombre);
    }
}
