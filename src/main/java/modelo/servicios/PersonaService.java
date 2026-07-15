package modelo.servicios;

import modelo.dao.PersonaDAO;
import modelo.entities.Persona;
import java.util.List;

public class PersonaService {
    //Los nombres del sercicio salen del negocio
	private PersonaDAO dao;

	public PersonaService() {
		this.dao = new PersonaDAO();
	}

    public Persona buscarPorCedula(String cedula) {
        return dao.getByCedula(cedula);
    }

    public void agregarCiudadano(Persona p) {
        dao.create(p);
    }

    public void actualizarRegistro(Persona p) {
        dao.update(p);
    }

    public void darDeBaja(int id) {
        dao.delete(id);
    }

    public boolean aplicaCredito(String cedula) {
        Persona p = buscarPorCedula(cedula);
        

        if (p != null && p.getEdad() >= 18) {
            return true;
        }
        return false;
    }
    
    public List<Persona> listar() {
        return dao.getAll();
        
    }
}