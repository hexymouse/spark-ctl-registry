package app.issue.service.impl;

import app.issue.model.Issue;
import app.issue.service.IssueService;

import java.util.List;
import java.util.UUID;

public class IssueServiceImpl implements IssueService {
  @Override
  public List<Issue> findAll() {
    return null;
  }

  @Override
  public Issue findByUUID(UUID uuid) {
    return null;
  }

  @Override
  public void delete(UUID uuid) {

  }
}
