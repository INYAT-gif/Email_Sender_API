package se.inyat.email_sender_api.service;

import se.inyat.email_sender_api.domain.dto.EmailDTO;

public interface EmailService {
    void sendEmail(EmailDTO dto);
}
