package repository;

import entity.Certificate;
import entity.Skill;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class SkillRepository implements PanacheRepositoryBase<Skill, UUID> {
    public List<Skill> findByProfileId(UUID profileId) {
        return list("profile.id", profileId);
    }
}
