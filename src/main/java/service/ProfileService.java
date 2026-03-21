package service;

import dto.ProfileFullDataDTO;
import entity.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.NotFoundException;
import repository.*;

import java.util.List;
import java.util.UUID;
@ApplicationScoped
public class ProfileService {
    @Inject ProfileRepository profileRepository;
    @Inject ExperienceRepository experienceRepository;
    @Inject EducationRepository educationRepository;
    @Inject SkillRepository skillRepository;
    @Inject ProjectRepository projectRepository;
    @Inject CertificateRepository certificateRepository;
    @Inject BlogPostRepository blogPostRepository;
    @Inject SocialLinkRepository socialLinkRepository;

    public ProfileFullDataDTO getAllData(UUID profileId) {
        ProfileEntity profile = profileRepository.findWithAllData(profileId)
                .orElseThrow(() -> new NotFoundException("Profile not found"));

        return new ProfileFullDataDTO(
                profile.getId(),
                profile.getName(),
                profile.getMidName(),
                profile.getLastName(),
                profile.getBio(),
                profile.getPhotoUrl(),
                profile.getJobTitle(),
                profile.getLocation(),
                toEmailDTOs(profile.getEmails()),
                toSocialLinkDTOs(socialLinkRepository.findByProfileId(profileId)),
                toExperienceDTOs(experienceRepository.findByProfileId(profileId)),
                toEducationDTOs(educationRepository.findByProfileId(profileId)),
                toSkillDTOs(skillRepository.findByProfileId(profileId)),
                toProjectDTOs(projectRepository.findByProfileId(profileId)),
                toCertificateDTOs(certificateRepository.findByProfileId(profileId)),
                toBlogPostDTOs(blogPostRepository.findByProfileId(profileId))
        );
    }

    private List<ProfileFullDataDTO.EmailDTO> toEmailDTOs(List<EmailEntity> list) {
        if (list == null) return List.of();
        return list.stream().map(e -> new ProfileFullDataDTO.EmailDTO(e.getId(), e.getType().name(), e.getEmail())).toList();
    }

    private List<ProfileFullDataDTO.SocialLinkDTO> toSocialLinkDTOs(List<SocialLink> list) {
        return list.stream().map(s -> new ProfileFullDataDTO.SocialLinkDTO(s.getId(), s.getPlatform(), s.getUrl())).toList();
    }

    private List<ProfileFullDataDTO.ExperienceDTO> toExperienceDTOs(List<Experience> list) {
        return list.stream().map(e -> new ProfileFullDataDTO.ExperienceDTO(e.getId(), e.getCompany(), e.getRole(), e.getDescription(), e.getStartedAt(), e.getEndedAt(), e.getCurrent())).toList();
    }

    private List<ProfileFullDataDTO.EducationDTO> toEducationDTOs(List<Education> list) {
        return list.stream().map(e -> new ProfileFullDataDTO.EducationDTO(e.getId(), e.getInstitution(), e.getDegree(), e.getField(), e.getStartedAt(), e.getEndedAt())).toList();
    }

    private List<ProfileFullDataDTO.SkillDTO> toSkillDTOs(List<Skill> list) {
        return list.stream().map(s -> new ProfileFullDataDTO.SkillDTO(s.getId(), s.getName(), s.getCategory(), s.getLevel())).toList();
    }

    private List<ProfileFullDataDTO.ProjectDTO> toProjectDTOs(List<Project> list) {
        return list.stream().map(p -> new ProfileFullDataDTO.ProjectDTO(p.getId(), p.getName(), p.getDescription(), p.getRepoUrl(), p.getLiveUrl(), p.getStartedAt(), p.getEndedAt())).toList();
    }

    private List<ProfileFullDataDTO.CertificateDTO> toCertificateDTOs(List<Certificate> list) {
        return list.stream().map(c -> new ProfileFullDataDTO.CertificateDTO(c.getId(), c.getName(), c.getIssuer(), c.getCredentialUrl(), c.getIssuedAt(), c.getExpiresAt())).toList();
    }

    private List<ProfileFullDataDTO.BlogPostDTO> toBlogPostDTOs(List<BlogPost> list) {
        return list.stream().map(b -> new ProfileFullDataDTO.BlogPostDTO(b.getId(), b.getTitle(), b.getSlug(), b.getStatus(), b.getPublishedAt(), b.getCreatedAt())).toList();
    }
}
