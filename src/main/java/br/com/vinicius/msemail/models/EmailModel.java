package br.com.vinicius.msemail.models;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.vinicius.msemail.enums.EmailStatus;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID emailId;
    
    private String ownerRef;
    
    private String emailFrom;
    
    private String emailTo;
    
    private String subject;
    
    @Column(columnDefinition = "TEXT")
    private String content;
    
    private LocalDateTime sentDate;
    
    private EmailStatus status;
}
