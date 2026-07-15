package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.entities.Persona;

public class PersonaDAO {
    

    private static List<Persona> personas = new ArrayList<>();


    public void create(Persona p) {
        personas.add(p);
    }

    public void update(Persona p) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getId()==p.getId()) {
            	personas.get(i).setCedula(p.getCedula());
                personas.get(i).setNombre(p.getNombre());
                personas.get(i).setEdad(p.getEdad());                
                return;
            }
        }
    }

    public void delete(int id) {
    	for(int i = 0; i < personas.size(); i++) {
			if(personas.get(i).getId() == id) {
				personas.remove(i);
				return;
			}
		}
		
    }

    public Persona getByCedula(String c) {
    	for (Persona p : personas) {
    		if (p.getCedula().equals(c)) {
				return p;
			}
    	}
        return null;
    }
    
    public List<Persona> getAll() {
    	if (personas.isEmpty()) {
    		personas.add(new Persona(1, "Carlos Torres", "1712345678", 25));
    		personas.add(new Persona(2, "Diana Mora", "0987654321", 16));
    	}
    	return personas;
    }


}