#!/usr/bin/env bash

gradle clean build copyDeps
vertx run io.vertx.example.SampleVerticle -cp build/libs/*:build/libs/dependencies/*