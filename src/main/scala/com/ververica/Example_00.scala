package com.ververica

import io.findify.flink.api._
import io.findify.flinkadt.api._


@main def example0 =
  val env = StreamExecutionEnvironment.getExecutionEnvironment
  env.readTextFile("input/words.txt")
    .flatMap(_.split(" "))
    .map(value => (value, 1))
    .keyBy(_._1)
    .sum(1)
    .print()

  env.execute()
