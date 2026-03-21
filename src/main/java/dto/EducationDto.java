package dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link entity.Education}
 */
public record EducationDto(@NotNull ProfileEntityDto profile, @NotNull @Size(max = 100) String institution,
                           @Size(max = 100) String degree, @Size(max = 100) String field, @NotNull LocalDate startedAt,
                           LocalDate endedAt) implements Serializable {
}