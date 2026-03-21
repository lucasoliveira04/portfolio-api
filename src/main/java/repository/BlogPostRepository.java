package repository;

import entity.BlogPost;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class BlogPostRepository implements PanacheRepositoryBase<BlogPost, UUID> {
    public List<BlogPost> findByProfileId(UUID profileId) {
        return list("profile.id", profileId);
    }
}
