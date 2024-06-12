package se.inyat.email_sender_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.inyat.email_sender_api.domain.entity.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, String> {

}