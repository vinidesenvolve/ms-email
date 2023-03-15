package br.com.vinicius.msemail.repositories;

import br.com.vinicius.msemail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
    
}
