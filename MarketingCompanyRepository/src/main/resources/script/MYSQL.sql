Drop Albums;
CREATE TABLE Albums (
  albums_id BIGINT NOT NULL,
  file_format VARCHAR(255) NULL,
  geolocation VARCHAR(255) NULL,
  tags VARCHAR(255) NULL,
  captured_date int NULL,
  captured_by int NULL,
  local_date int NULL,
  CONSTRAINT pk_albums PRIMARY KEY (albums_id)
);

