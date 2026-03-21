package dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

/**
 * DTO for {@link entity.SocialLink}
 */
public record SocialLinkDto(@NotNull ProfileEntityDto profile, @NotNull @Size(max = 50) String platform,
                            @NotNull @Size(max = 255) String url) implements Serializable {
}