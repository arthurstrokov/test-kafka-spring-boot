# test-kafka-spring-boot

# https://habr.com/ru/post/496182/

    D:\Java\Kafka\kafka_2.13-3.1.0\bin\windows>
    start zookeeper-server-start.bat D:\Java\Kafka\kafka_2.13-3.1.0\config\zookeeper.properties

    D:\Java\Kafka\kafka_2.13-3.1.0\bin\windows>
    start kafka-server-start.bat D:\Java\Kafka\kafka_2.13-3.1.0\config\server.properties

    if instaled local or

    docker-compose up -d
    gradle bootRun
    docker-compose down --volumes
