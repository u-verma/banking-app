CREATE TABLE user_profile
(
    id            TEXT,
    type          VARCHAR(255) NOT NULL,
    first_name    VARCHAR(255) NOT NULL,
    last_name     VARCHAR(255) NOT NULL,
    email         VARCHAR(255) NOT NULL,
    phone         VARCHAR(255) NOT NULL,
    date_of_birth DATE         NOT NULL,
    created_at    TIMESTAMPTZ  NOT NULL default now(),
    modify_at     TIMESTAMPTZ  NOT NULL default now(),
    CONSTRAINT pk_user_profile_id PRIMARY KEY (id)
);