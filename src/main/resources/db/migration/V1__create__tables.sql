CREATE TABLE profile
(
    id        UUID NOT NULL,
    name      VARCHAR(255),
    mid_name  VARCHAR(255),
    last_name VARCHAR(255),
    CONSTRAINT pk_profile PRIMARY KEY (id)
);

CREATE TABLE profile_email
(
    id         UUID         NOT NULL,
    type       VARCHAR(20),
    email      VARCHAR(255) NOT NULL,
    profile_id UUID,
    CONSTRAINT pk_profile_email PRIMARY KEY (id)
);

ALTER TABLE profile_email
    ADD CONSTRAINT FK_PROFILE_EMAIL_ON_PROFILE FOREIGN KEY (profile_id) REFERENCES profile (id);