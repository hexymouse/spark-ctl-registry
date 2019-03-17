package app.issue.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Issue {
  private UUID uuid;
  private String title;
  private String description;
}
