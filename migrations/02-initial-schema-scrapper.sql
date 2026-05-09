CREATE TABLE scrapper_link (
    link_id BIGINT PRIMARY KEY,
    link_uri VARCHAR(500) NOT NULL UNIQUE,
    updated_at TIMESTAMP,
    version BIGINT
);

CREATE TABLE link_listener (
    id BIGINT PRIMARY KEY,
    type VARCHAR(50) NOT NULL,
    version BIGINT
);

CREATE TABLE link_metadata (
    link_id BIGINT NOT NULL,
    link_uri VARCHAR(500) NOT NULL,
    listener_id BIGINT NOT NULL,
    version BIGINT,
    PRIMARY KEY (link_id, listener_id),
    FOREIGN KEY (link_id) REFERENCES scrapper_link(link_id) ON DELETE CASCADE,
    FOREIGN KEY (listener_id) REFERENCES link_listener(id) ON DELETE CASCADE
);

CREATE TABLE link_tag (
    name VARCHAR(255) NOT NULL PRIMARY KEY,
    version BIGINT
);

CREATE TABLE link_metadata_tags_mapping (
    link_id BIGINT NOT NULL,
    link_uri VARCHAR(500) NOT NULL,
    listener_id BIGINT NOT NULL,
    tag_name VARCHAR(255) NOT NULL,
    PRIMARY KEY (link_id, listener_id, tag_name),
    FOREIGN KEY (link_id) REFERENCES scrapper_link(link_id) ON DELETE CASCADE,
    FOREIGN KEY (listener_id) REFERENCES link_listener(id) ON DELETE CASCADE,
    FOREIGN KEY (tag_name) REFERENCES link_tag(name) ON DELETE CASCADE
);
