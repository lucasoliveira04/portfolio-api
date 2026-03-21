package dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link entity.BlogPost}
 */
public record BlogPostDto(@NotNull ProfileEntityDto profile, @NotNull @Size(max = 255) String title, String content,
                          @NotNull @Size(max = 255) String slug, @NotNull @Size(max = 20) String status,
                          Instant publishedAt, @NotNull Instant createdAt) implements Serializable {
}