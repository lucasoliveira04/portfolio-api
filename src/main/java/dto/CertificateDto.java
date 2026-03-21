package dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link entity.Certificate}
 */
public record CertificateDto(@NotNull ProfileEntityDto profile, @NotNull @Size(max = 100) String name,
                             @Size(max = 100) String issuer, @Size(max = 255) String credentialUrl, LocalDate issuedAt,
                             LocalDate expiresAt) implements Serializable {
}