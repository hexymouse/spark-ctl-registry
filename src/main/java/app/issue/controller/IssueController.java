package app.issue.controller;

import app.core.annotation.Controller;
import app.core.annotation.Endpoint;

import static spark.Spark.*;

@Controller
public class IssueController {

  @Endpoint
  public void getAll() {
    get("/issue", (req, res) -> "test");
  }

  @Endpoint
  public void sayHello() {
    get("/hello", (req, res) -> "hello");
  }
}
