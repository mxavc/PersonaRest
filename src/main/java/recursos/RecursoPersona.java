package recursos;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import modelo.entities.Persona;
import modelo.servicios.PersonaService;

@Path("/personas")
public class RecursoPersona {


    private PersonaService servicio = new PersonaService();

    @GET
    @Path("/cedula/{cedula}")
    @Produces(MediaType.APPLICATION_JSON)
    public Persona buscar(@PathParam("cedula") String cedula) {
        return servicio.buscarPorCedula(cedula);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void add(Persona p) {
        servicio.agregarCiudadano(p);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(Persona p) {
        servicio.actualizarRegistro(p);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") int id) {
        servicio.darDeBaja(id);
    }

    @GET
    @Path("/todos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Persona> todos() {
        return servicio.listar();
    }
    
    @GET
    @Path("/credito/{cedula}")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean verificarCredito(@PathParam("cedula") String cedula) {
        return servicio.aplicaCredito(cedula);
    }
}