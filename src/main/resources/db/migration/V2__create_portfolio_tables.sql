ALTER TABLE profile
    ADD COLUMN bio       TEXT,
    ADD COLUMN photo_url VARCHAR(255),
    ADD COLUMN job_title VARCHAR(100),
    ADD COLUMN location  VARCHAR(100),
    ADD COLUMN created_at TIMESTAMP DEFAULT NOW();

CREATE TABLE social_link
(
    id         UUID         NOT NULL,
    profile_id UUID         NOT NULL,
    platform   VARCHAR(50)  NOT NULL,
    url        VARCHAR(255) NOT NULL,
    CONSTRAINT pk_social_link PRIMARY KEY (id),
    CONSTRAINT fk_social_link_profile FOREIGN KEY (profile_id) REFERENCES profile (id) ON DELETE CASCADE
);

CREATE TABLE experience
(
    id          UUID         NOT NULL,
    profile_id  UUID         NOT NULL,
    company     VARCHAR(100) NOT NULL,
    role        VARCHAR(100) NOT NULL,
    description TEXT,
    started_at  DATE         NOT NULL,
    ended_at    DATE,
    current     BOOLEAN      NOT NULL DEFAULT FALSE,
    CONSTRAINT pk_experience PRIMARY KEY (id),
    CONSTRAINT fk_experience_profile FOREIGN KEY (profile_id) REFERENCES profile (id) ON DELETE CASCADE
);

CREATE TABLE education
(
    id          UUID         NOT NULL,
    profile_id  UUID         NOT NULL,
    institution VARCHAR(100) NOT NULL,
    degree      VARCHAR(100),
    field       VARCHAR(100),
    started_at  DATE         NOT NULL,
    ended_at    DATE,
    CONSTRAINT pk_education PRIMARY KEY (id),
    CONSTRAINT fk_education_profile FOREIGN KEY (profile_id) REFERENCES profile (id) ON DELETE CASCADE
);

CREATE TABLE skill
(
    id         UUID        NOT NULL,
    profile_id UUID        NOT NULL,
    name       VARCHAR(50) NOT NULL,
    category   VARCHAR(50),
    level      VARCHAR(20),
    CONSTRAINT pk_skill PRIMARY KEY (id),
    CONSTRAINT fk_skill_profile FOREIGN KEY (profile_id) REFERENCES profile (id) ON DELETE CASCADE
);

CREATE TABLE project
(
    id          UUID         NOT NULL,
    profile_id  UUID         NOT NULL,
    name        VARCHAR(100) NOT NULL,
    description TEXT,
    repo_url    VARCHAR(255),
    live_url    VARCHAR(255),
    started_at  DATE,
    ended_at    DATE,
    CONSTRAINT pk_project PRIMARY KEY (id),
    CONSTRAINT fk_project_profile FOREIGN KEY (profile_id) REFERENCES profile (id) ON DELETE CASCADE
);

CREATE TABLE certificate
(
    id             UUID         NOT NULL,
    profile_id     UUID         NOT NULL,
    name           VARCHAR(100) NOT NULL,
    issuer         VARCHAR(100),
    credential_url VARCHAR(255),
    issued_at      DATE,
    expires_at     DATE,
    CONSTRAINT pk_certificate PRIMARY KEY (id),
    CONSTRAINT fk_certificate_profile FOREIGN KEY (profile_id) REFERENCES profile (id) ON DELETE CASCADE
);

CREATE TABLE blog_post
(
    id           UUID         NOT NULL,
    profile_id   UUID         NOT NULL,
    title        VARCHAR(255) NOT NULL,
    content      TEXT,
    slug         VARCHAR(255) NOT NULL UNIQUE,
    status       VARCHAR(20)  NOT NULL DEFAULT 'DRAFT',
    published_at TIMESTAMP,
    created_at   TIMESTAMP    NOT NULL DEFAULT NOW(),
    CONSTRAINT pk_blog_post PRIMARY KEY (id),
    CONSTRAINT fk_blog_post_profile FOREIGN KEY (profile_id) REFERENCES profile (id) ON DELETE CASCADE
);