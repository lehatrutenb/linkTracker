CREATE TABLE telegram_bot_user (
    id BIGINT PRIMARY KEY,
    user_name VARCHAR(255),
    first_name VARCHAR(255),
    is_bot BOOLEAN NOT NULL,
    version BIGINT
);

CREATE TABLE telegram_bot_chat (
    id BIGINT PRIMARY KEY,
    type VARCHAR(50) NOT NULL,
    version BIGINT
);

CREATE TABLE chat_shared_state (
    id BIGINT PRIMARY KEY,
    command_flow_state VARCHAR(50),
    processing_command VARCHAR(255),
    processing_command_step INT,
    version BIGINT
);

CREATE TABLE event (
    id BIGINT PRIMARY KEY,
    owner_id_type VARCHAR(50) NOT NULL,
    state VARCHAR(50) NOT NULL,
    updated_at TIMESTAMP,
    version BIGINT
);

CREATE TABLE link_update (
    id BIGINT PRIMARY KEY,
    url VARCHAR(500),
    description TEXT,
    tg_chat_i_ds BIGINT[],
    version BIGINT
);

CREATE TABLE telegram_bot_message (
    tech_id BIGSERIAL,
    id BIGINT NOT NULL,
    message TEXT,
    date TIMESTAMP,
    chat_id BIGINT,
    user_id BIGINT,
    version BIGINT,
    PRIMARY KEY (tech_id)
);

ALTER TABLE telegram_bot_message
ADD CONSTRAINT fk_message_chat
FOREIGN KEY (chat_id) REFERENCES telegram_bot_chat(id);

ALTER TABLE telegram_bot_message
ADD CONSTRAINT fk_message_user
FOREIGN KEY (user_id) REFERENCES telegram_bot_user(id);

CREATE TABLE shared_state_messages_mapping (
    shared_state_id BIGINT NOT NULL,
    message_id BIGINT NOT NULL,
    PRIMARY KEY (shared_state_id, message_id),
    FOREIGN KEY (shared_state_id) REFERENCES chat_shared_state(id) ON DELETE CASCADE,
    FOREIGN KEY (message_id) REFERENCES telegram_bot_message(tech_id) ON DELETE CASCADE
);
