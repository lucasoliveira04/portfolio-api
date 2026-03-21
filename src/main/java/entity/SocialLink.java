package entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "social_link", schema = "public")
public class SocialLink {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "profile_id", nullable = false)
    private ProfileEntity profile;

    @Size(max = 50)
    @NotNull
    @Column(name = "platform", nullable = false, length = 50)
    private String platform;

    @Size(max = 255)
    @NotNull
    @Column(name = "url", nullable = false)
    private String url;


}