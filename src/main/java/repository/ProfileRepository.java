package repository;

import entity.ProfileEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Optional;
import java.util.UUID;

@ApplicationScoped
public class ProfileRepository implements PanacheRepositoryBase<ProfileEntity, UUID> {
    public Optional<ProfileEntity> findWithAllData(UUID id) {
        return find("""
                SELECT DISTINCT p FROM ProfileEntity p
                LEFT JOIN FETCH p.emails
                WHERE p.id = ?1
                """, id).firstResultOptional();
    }
}
