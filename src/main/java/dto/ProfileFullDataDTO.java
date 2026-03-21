package dto;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record ProfileFullDataDTO(
        UUID id,
        String name,
        String midName,
        String lastName,
        String bio,
        String photoUrl,
        String jobTitle,
        String location,
        List<EmailDTO> emails,
        List<SocialLinkDTO> socialLinks,
        List<ExperienceDTO> experiences,
        List<EducationDTO> educations,
        List<SkillDTO> skills,
        List<ProjectDTO> projects,
        List<CertificateDTO> certificates,
        List<BlogPostDTO> blogPosts
) {
    public record EmailDTO(UUID id, String type, String email) {}
    public record SocialLinkDTO(UUID id, String platform, String url) {}
    public record ExperienceDTO(UUID id, String company, String role, String description, LocalDate startedAt, LocalDate endedAt, Boolean current) {}
    public record EducationDTO(UUID id, String institution, String degree, String field, LocalDate startedAt, LocalDate endedAt) {}
    public record SkillDTO(UUID id, String name, String category, String level) {}
    public record ProjectDTO(UUID id, String name, String description, String repoUrl, String liveUrl, LocalDate startedAt, LocalDate endedAt) {}
    public record CertificateDTO(UUID id, String name, String issuer, String credentialUrl, LocalDate issuedAt, LocalDate expiresAt) {}
    public record BlogPostDTO(UUID id, String title, String slug, String status, Instant publishedAt, Instant createdAt) {}
}