package repository;

import entity.Certificate;
import entity.Project;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class ProjectRepository implements PanacheRepositoryBase<Project, UUID> {
    public List<Project> findByProfileId(UUID profileId) {
        return list("profile.id", profileId);
    }
}
