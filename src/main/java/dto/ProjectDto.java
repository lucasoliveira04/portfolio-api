package dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link entity.Project}
 */
public record ProjectDto(@NotNull ProfileEntityDto profile, @NotNull @Size(max = 100) String name, String description,
                         @Size(max = 255) String repoUrl, @Size(max = 255) String liveUrl, LocalDate startedAt,
                         LocalDate endedAt) implements Serializable {
}