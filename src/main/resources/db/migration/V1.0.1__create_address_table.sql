CREATE TABLE address
(
    id         TEXT,
    type       VARCHAR(255) NOT NULL,
    street     VARCHAR(255) NOT NULL,
    city       VARCHAR(255) NOT NULL,
    state      VARCHAR(255) NOT NULL,
    zip        VARCHAR(255) NOT NULL,
    country    VARCHAR(255) NOT NULL,
    created_at TIMESTAMPTZ  NOT NULL,
    modify_at  TIMESTAMPTZ  NOT NULL,
    user_profile_id    TEXT         NOT NULL,
    CONSTRAINT pk_address_id PRIMARY KEY (id),
    CONSTRAINT fk_user_profile FOREIGN KEY (user_profile_id) REFERENCES user_profile (id) ON DELETE CASCADE
);