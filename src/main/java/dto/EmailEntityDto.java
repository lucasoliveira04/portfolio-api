package dto;

import enums.TypeEmailEnum;
import jakarta.validation.constraints.Email;

import java.io.Serializable;

/**
 * DTO for {@link entity.EmailEntity}
 */
public record EmailEntityDto(TypeEmailEnum type, @Email String email,
                             ProfileEntityDto profile) implements Serializable {
}