package dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

/**
 * DTO for {@link entity.Skill}
 */
public record SkillDto(@NotNull ProfileEntityDto profile, @NotNull @Size(max = 50) String name,
                       @Size(max = 50) String category, @Size(max = 20) String level) implements Serializable {
}