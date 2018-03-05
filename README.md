# kafka-produce-scala-example

Extremely minimum example to use kafka producer in scala.

- kafka-1.0
- scala-2.12.4

## Assumed
- **broker** : `localhost:9092`
- **topic** : `test`
- **docker-compose** 

```shell
% docker-compose run sbt
```

## Example Apps

`src/main/scala`

- `Produce01` : mimimum producer ("test", "1")
- `Produce02` : idempotent producer ("test", "1")

## Run `ProduceXX`

```scala
sbt:kafkaProducer> runMain Produce01
```

## Run Consume

This is an easiest way to consume the last message in the topic `test`.

```shell
% kafka-fetch test -l -g
test#0  226: (unknown) Bytes"1"
```
- kafka-fetch: https://github.com/maiha/kafka.cr


## Contributing

1. Fork it ( https://github.com/maiha/kafka-produce-scala-example/fork )
2. Create your feature branch (git checkout -b my-new-feature)
3. Commit your changes (git commit -am 'Add some feature')
4. Push to the branch (git push origin my-new-feature)
5. Create a new Pull Request

## Contributors

- [maiha](https://github.com/maiha) maiha - creator, maintainer
