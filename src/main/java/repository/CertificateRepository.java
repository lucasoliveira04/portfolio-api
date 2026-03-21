package repository;

import entity.Certificate;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class CertificateRepository implements PanacheRepositoryBase<Certificate, UUID> {
    public List<Certificate> findByProfileId(UUID profileId) {
        return list("profile.id", profileId);
    }
}
