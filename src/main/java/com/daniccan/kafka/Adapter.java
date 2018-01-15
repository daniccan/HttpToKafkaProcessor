package com.daniccan.kafka;

import java.util.Map;

/**
 *
 * @author daniccan
 */
public abstract class Adapter {

    public void close() {
    }

    public void configure(Map<String, ?> configs, boolean isKey) {
    }
}
