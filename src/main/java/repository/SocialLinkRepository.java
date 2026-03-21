package repository;

import entity.SocialLink;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class SocialLinkRepository implements PanacheRepositoryBase<SocialLink, UUID> {
    public List<SocialLink> findByProfileId(UUID profileId) {
        return list("profile.id", profileId);
    }
}
