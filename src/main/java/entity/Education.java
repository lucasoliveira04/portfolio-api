package entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "education", schema = "public")
public class Education {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "profile_id", nullable = false)
    private ProfileEntity profile;

    @Size(max = 100)
    @NotNull
    @Column(name = "institution", nullable = false, length = 100)
    private String institution;

    @Size(max = 100)
    @Column(name = "degree", length = 100)
    private String degree;

    @Size(max = 100)
    @Column(name = "field", length = 100)
    private String field;

    @NotNull
    @Column(name = "started_at", nullable = false)
    private LocalDate startedAt;

    @Column(name = "ended_at")
    private LocalDate endedAt;


}