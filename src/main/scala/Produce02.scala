/*
 * idempotent producer
 * produce "1" into "test" with idempotent mode
 */
object Produce02 extends App {
 import java.util.Properties
 import org.apache.kafka.clients.producer._

 val props = new Properties()
 props.put("bootstrap.servers", "localhost:9092")
 props.put("client.id", "x")
 props.put("enable.idempotence", "true")
 props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
 props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")

 val producer = new KafkaProducer[String, String](props)
 val record   = new ProducerRecord[String, String]("test", "1")

 producer.send(record)
 producer.close()
}
