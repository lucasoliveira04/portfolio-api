package entity;

import enums.TypeEmailEnum;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "profile_email")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private TypeEmailEnum type;

    @Column(name = "email", nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private ProfileEntity profile;
}
