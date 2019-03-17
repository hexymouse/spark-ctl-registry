package app.issue.service;

import app.issue.model.Issue;

import java.util.List;
import java.util.UUID;

public interface IssueService {
  List<Issue> findAll();
  Issue findByUUID(UUID uuid);
  void delete(UUID uuid);
}
