package org.portfolio.portfolioapi.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserModal {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String firstName;
    private String lastName;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "user_emails", joinColumns = @JoinColumn(name = "user_id"))
    @MapKeyColumn(name = "email_type")
    @Column(name = "email_value")
    private Map<String, String> emails = new HashMap<>();

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "user_phones", joinColumns = @JoinColumn(name = "user_id"))
    @MapKeyColumn(name = "phone_type")
    @Column(name = "phone_value")
    private Map<String, String> phoneNumbers = new HashMap<>();

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "user_social_links", joinColumns = @JoinColumn(name = "user_id"))
    @MapKeyColumn(name = "social_type")
    @Column(name = "social_url")
    private Map<String, String> socialMediaLinks = new HashMap<>();
}
