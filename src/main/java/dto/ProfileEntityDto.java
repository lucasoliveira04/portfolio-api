package dto;

import java.io.Serializable;

/**
 * DTO for {@link entity.ProfileEntity}
 */
public record ProfileEntityDto(String name,
                               String midName,
                               String lastName
) implements Serializable {
}