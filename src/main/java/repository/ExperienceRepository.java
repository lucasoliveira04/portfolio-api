package repository;

import entity.Certificate;
import entity.Experience;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class ExperienceRepository implements PanacheRepositoryBase<Experience, UUID> {
    public List<Experience> findByProfileId(UUID profileId) {
        return list("profile.id", profileId);
    }
}
