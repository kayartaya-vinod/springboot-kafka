#!/bin/bash

cd kafka-producer
echo "building the kafka producer"
mvn clean package -DskipTests=true
docker build --tag learnwithvinod/kafka-producer:latest .
cd ..

cd kafka-consumer
echo "building the kafka consumer"
mvn clean package -DskipTests=true
docker build --tag learnwithvinod/kafka-consumer:latest .
cd ..
