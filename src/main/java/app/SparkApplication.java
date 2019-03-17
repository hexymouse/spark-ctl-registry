package app;


import app.core.registry.ApplicationRegistry;
import spark.Spark;

public class SparkApplication {
  public static void main(String[] args) {
    ApplicationRegistry.register(args);
  }
}
