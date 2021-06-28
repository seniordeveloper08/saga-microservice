package com.uuhnaut69.inventory.infrastructure.message.log;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class MessageLog {

  @Id private UUID id;

  @Column(nullable = false)
  private Timestamp receivedAt;
}
