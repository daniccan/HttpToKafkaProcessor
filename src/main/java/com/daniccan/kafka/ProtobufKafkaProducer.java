package com.daniccan.kafka;

import com.daniccan.proto.PersonProtos.Person;
import java.util.Properties;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

/**
 * Kafka Producer Implementation
 * 
 * @author daniccan
 */
public class ProtobufKafkaProducer {

    private Producer<String, Person> producer = null;
    private Properties kafkaProducerProps = null;

    public ProtobufKafkaProducer() {
        kafkaProducerProps = new Properties();
        kafkaProducerProps.put("bootstrap.servers", KafkaConfig.kafkaConnectionUrl);
        kafkaProducerProps.put("acks", KafkaConfig.kafkaProducerAcks);
        kafkaProducerProps.put("retries", KafkaConfig.kafkaProducerRetries);
        kafkaProducerProps.put("batch.size", KafkaConfig.kafkaProducerBatchSize);
        kafkaProducerProps.put("linger.ms", KafkaConfig.kafkaProducerLingerMs);
        kafkaProducerProps.put("buffer.memory", KafkaConfig.kafkaProducerBufferMemory);
        kafkaProducerProps.put("key.serializer", KafkaConfig.kafkaTopicKeySerializer);
        kafkaProducerProps.put("value.serializer", KafkaConfig.kafkaTopicValueSerializer);
        kafkaProducerProps.put("compression.type", KafkaConfig.kafkaProducerCompressionType);

        producer = new KafkaProducer<>(kafkaProducerProps);
    }

    public void writeToKafkaTopic(Person person, String topicName) {
        producer.send(new ProducerRecord<>(topicName, person));
    }
}
