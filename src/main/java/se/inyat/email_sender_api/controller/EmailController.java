package se.inyat.email_sender_api.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.inyat.email_sender_api.domain.dto.EmailDTO;
import se.inyat.email_sender_api.service.EmailServiceImpl;

@RequestMapping("/api/v1/email")
@RestController
public class EmailController {

    private final EmailServiceImpl emailService;

    @Autowired
    public EmailController(EmailServiceImpl emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public ResponseEntity<Void> doSendEmail(@RequestBody @Valid EmailDTO dto) {
        System.out.println("DTO:" + dto);
        emailService.sendEmail(dto);
        return ResponseEntity.noContent().build();
    }


}