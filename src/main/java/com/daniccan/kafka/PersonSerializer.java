package com.daniccan.kafka;

import com.daniccan.proto.PersonProtos.Person;
import org.apache.kafka.common.serialization.Serializer;

/**
 * Kafka Serializer for Protobuf Object
 * 
 * @author daniccan
 */
public class PersonSerializer extends Adapter implements Serializer<Person> {

    @Override
    public byte[] serialize(String topic, Person person) {
        return person.toByteArray();
    }
}
