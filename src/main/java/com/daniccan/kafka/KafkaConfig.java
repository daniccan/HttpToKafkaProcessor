package com.daniccan.kafka;

/**
 * Kafka Configurations
 * 
 * @author daniccan
 */
public class KafkaConfig {

    // Configuration(s) - To be moved to Properties File.
    public static String kafkaConnectionUrl = "10.2.1.16:9092";
    public static String personTopicName = "person_topic";
    public static String kafkaProducerAcks = "all";
    public static int kafkaProducerRetries = 0;
    public static int kafkaProducerBatchSize = 16384;
    public static int kafkaProducerLingerMs = 1;
    public static int kafkaProducerBufferMemory = 33554432;
    public static String kafkaTopicKeySerializer = "org.apache.kafka.common.serialization.StringSerializer";
    public static String kafkaTopicValueSerializer = "com.daniccan.kafka.PersonSerializer";
    public static String kafkaProducerCompressionType = "lz4";
}
