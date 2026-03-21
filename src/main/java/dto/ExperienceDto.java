package dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link entity.Experience}
 */
public record ExperienceDto(@NotNull ProfileEntityDto profile, @NotNull @Size(max = 100) String company,
                            @NotNull @Size(max = 100) String role, String description, @NotNull LocalDate startedAt,
                            LocalDate endedAt, @NotNull Boolean current) implements Serializable {
}