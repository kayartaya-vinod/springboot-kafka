# Springboot Kafka message producer/consumer demo

To create docker images for both producer and consumer applications, just run the `build.sh`.

You can send a POST message to http://localhost:8000/api/messages in `text/plain` format, which publishes that message to kafka server running at localhost:9002 (inside docker container, of course). The consumer application listens to the kafka server, and on receiving message, just logs the same.

To start all services, run the `docker compose up -d` command, and to check the logs, just run the command `docker logs <consumer-container-name>`.

To send the message, you can use the request from the `requests.http` file.
