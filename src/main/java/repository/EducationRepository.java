package repository;

import entity.Education;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class EducationRepository implements PanacheRepositoryBase<Education, UUID> {
    public List<Education> findByProfileId(UUID profileId) {
        return list("profile.id", profileId);
    }
}
