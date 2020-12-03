package si.fri.prpo.s01.history.api.v1.sources;

import org.graalvm.compiler.core.common.type.Stamp;
import si.fri.prpo.s01.history.api.v1.dtos.HistoryDTO;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.*;

@Singleton
@Path("history")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class HistorySource {
    @Context
    protected UriInfo uriInfo;


    HashMap<Integer, List<HistoryDTO>> map;

    @PostConstruct
    void init(){
        map = new HashMap<Integer, List<HistoryDTO>>() {{
            put(1, new ArrayList<HistoryDTO>(){{
                add(new HistoryDTO(12, new Date(120, Calendar.DECEMBER, 3, 9,0,0)));
                add(new HistoryDTO(5, new Date(120, Calendar.DECEMBER, 3, 10,0,0)));
                add(new HistoryDTO(0, new Date(120, Calendar.DECEMBER, 3, 11,0,0)));
            }});

            put(2, new ArrayList<HistoryDTO>(){{
                add(new HistoryDTO(8, new Date(120, Calendar.DECEMBER, 3, 9,0,0)));
                add(new HistoryDTO(10, new Date(120, Calendar.DECEMBER, 3, 10,0,0)));
                add(new HistoryDTO(10, new Date(120, Calendar.DECEMBER, 3, 11,0,0)));
            }});
        }};
    }

    @GET
    @Path("{roomId}")
    public Response getForRoom(@PathParam("roomId") Integer roomId){
        List<HistoryDTO> out = map.get(roomId);
        if (out == null){
            out = new ArrayList<>();
        }
        return Response.ok(out).build();
    }

    @POST
    @Path("{roomId}")
    public Response addForRoom(@PathParam("roomId") Integer roomId, HistoryDTO history) {
        List<HistoryDTO> arr = map.get(roomId);
        // Create new if none exists
        if (arr == null){
            arr = new ArrayList<>();
        }

        arr.add(history);
        return Response.status(Response.Status.CREATED).entity(arr).build();
    }
}
