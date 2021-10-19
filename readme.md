# Cross-SDK Sentry Sample

A sample containing a Python & Flask application calling a Java & Spring Boot service.

## How to run

1. Create 2 projects in Sentry console - one for Flask app, one for Java app.
2. Update `docker-compose.yml` with SDKs for each project.
3. Run `make` from command line.
4. Call `curl http://localhost:5000`
5. Go to Sentry console to find a new transaction.
