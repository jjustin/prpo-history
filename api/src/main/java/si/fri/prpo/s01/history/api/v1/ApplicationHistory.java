package si.fri.prpo.s01.history.api.v1;

import si.fri.prpo.s01.history.api.v1.sources.HistorySource;

import javax.ws.rs.ApplicationPath;
import java.util.Set;

@ApplicationPath("v1")
public class ApplicationHistory extends javax.ws.rs.core.Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new
                java.util.HashSet<Class<?>>();
        resources.add(HistorySource.class);
        return resources;
    }
}
