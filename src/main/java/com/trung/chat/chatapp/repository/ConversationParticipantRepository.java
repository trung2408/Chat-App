package com.trung.chat.chatapp.repository;

import com.trung.chat.chatapp.entity.ConversationParticipant;
import com.trung.chat.chatapp.entity.ConversationParticipantId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversationParticipantRepository extends JpaRepository<ConversationParticipant, ConversationParticipantId> {
    int countByUser(ConversationParticipant conversationParticipant);
}
