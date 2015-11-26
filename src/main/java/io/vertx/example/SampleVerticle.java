package io.vertx.example;

import io.vertx.core.AbstractVerticle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SampleVerticle extends AbstractVerticle {
    private static final Logger logger = LogManager.getLogger(SampleVerticle.class);

    @Override
    public void start() throws Exception {
        logger.info("SampleVerticle Started!");
        System.out.println("SampleVerticle");
    }

    @Override
    public void stop() throws Exception {
        logger.info("SampleVerticle Stopped!");
    }
}
