package com.atd.microservices.core.createorder.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Date;

@Data
@NoArgsConstructor
public class ErrorDetails {
  private Date timestamp;
  private String message;
  private String details;

  public ErrorDetails(Date timestamp, String message, String details) {
    super();
    this.timestamp = timestamp;
    this.message = message;
    this.details = details;
  }

  public ErrorDetails(String message) {
    super();
    this.timestamp = Date.from(Instant.now());
    this.message = message;
    this.details = "";
  }

  public ErrorDetails(Throwable e) {
    super();
    this.timestamp = Date.from(Instant.now());
    this.message = e.getMessage();
    this.details = "";
  }
}