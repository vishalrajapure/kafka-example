This repo holds details of Kafka

Basic steps to run Kafka Server on local:

- Download server files from : https://www.apache.org/dyn/closer.cgi?path=/kafka/2.8.0/kafka_2.13-2.8.0.tgz
- Unzip it. rename dir to kafka and copy to C drive for convinience. 
- Go to /config/server.properties and update log dir to : log.dirs=c:/kafka/kafka-logs
- Go to /config/zookeeper.properties and update dataDir to : dataDir=c:/kafka/zookeeper-data
- Thats it.
- Start zookeeper server : .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
- Start Kafka server : .\bin\windows\kafka-server-start.bat .\config\server.properties
- Create Topic : .\bin\windows\kafka-topics.bat --create --topic TestTopic --bootstrap-server localhost:9092
- Check list of topics: kafka-topics.bat --zookeeper localhost:2181 --list
- Note that Zookeeper will be running on 2181 and kafka server will run on 9092 by default.
