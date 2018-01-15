package com.daniccan.converter;

import com.daniccan.proto.PersonProtos.Person;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

/**
 * Json to Protobuf Converter
 * 
 * @author daniccan
 */
public class ProtobufConverter {

    public Person convertJsonToProtobuf(String inputJson) throws InvalidProtocolBufferException {
        Person.Builder builder = Person.newBuilder();
        JsonFormat.parser().merge(inputJson, builder);

        Person person = builder.build();

        return person;
    }
}
