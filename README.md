# HttpToKafkaProcessor

1. A HTTP Server built on top of Netty.
2. The Server accepts JSON Objects as Query parameters from the URL. 
  ( e.g: http://localhost:8080/?query={"name":"Daniccan","age":26,"email":"daniccan@gmail.com"} )
3. The JSON Object is converted into Protobuf object (Proto File: Person.proto).
4. The Protobuf object is pushed into a Kafka Queue (Topic Name: person_topic).


