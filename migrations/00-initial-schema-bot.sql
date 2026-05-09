CREATE TABLE telegram_bot_user (
    id BIGINT PRIMARY KEY,
    user_name VARCHAR(255),
    first_name VARCHAR(255),
    is_bot BOOLEAN NOT NULL
);

CREATE TABLE bot_chat (
    id BIGINT PRIMARY KEY,
    reply_service VARCHAR(255) NOT NULL
);

CREATE TABLE chat_shared_state (
    id BIGINT PRIMARY KEY,
    command_flow_state VARCHAR(50),
    processing_command VARCHAR(255),
    processing_command_step INT
);

CREATE TABLE event (
    id BIGINT,
    owner_id_type VARCHAR(50) NOT NULL,
    state VARCHAR(50) NOT NULL,
    updated_at TIMESTAMP,
    PRIMARY KEY (id, owner_id_type)
);

CREATE TABLE link_update (
    id BIGINT PRIMARY KEY,
    event_id BIGINT,
    event_owner_id_type VARCHAR(50) NOT NULL,
    url VARCHAR(500),
    description TEXT
);

CREATE TABLE telegram_bot_message (
    message_id BIGSERIAL PRIMARY KEY,
    local_chat_id BIGINT NOT NULL,
    message TEXT,
    date TIMESTAMP,
    chat_id BIGINT,
    user_id BIGINT
);

ALTER TABLE telegram_bot_message
ADD CONSTRAINT fk_message_chat
FOREIGN KEY (chat_id) REFERENCES bot_chat(id);

ALTER TABLE telegram_bot_message
ADD CONSTRAINT fk_message_user
FOREIGN KEY (user_id) REFERENCES telegram_bot_user(id);

CREATE TABLE shared_state_messages_mapping (
    shared_state_id BIGINT NOT NULL,
    message_id BIGINT NOT NULL,
    PRIMARY KEY (shared_state_id, message_id),
    FOREIGN KEY (shared_state_id) REFERENCES chat_shared_state(id) ON DELETE CASCADE,
    FOREIGN KEY (message_id) REFERENCES telegram_bot_message(message_id) ON DELETE CASCADE
);

CREATE TABLE link_update_bot_chats_mapping (
    link_update_id BIGINT NOT NULL,
    bot_chat_id BIGINT NOT NULL,
    PRIMARY KEY (link_update_id, bot_chat_id),
    FOREIGN KEY (link_update_id) REFERENCES link_update(id) ON DELETE CASCADE,
    FOREIGN KEY (bot_chat_id) REFERENCES bot_chat(id) ON DELETE CASCADE
);
