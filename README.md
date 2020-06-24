# multiple-microservices-in-one-container
- Two Spring Boot services
- service_A (port 8000)
- service_B (port 8080)
- Running in a single docker container as two processes
- Each service has two methods: hello and hello_from_remote.
- Each hello_from_remote method sends an http call to other service's hello method <br/>
Replace the line endings of the shell script to LF format when running the application
