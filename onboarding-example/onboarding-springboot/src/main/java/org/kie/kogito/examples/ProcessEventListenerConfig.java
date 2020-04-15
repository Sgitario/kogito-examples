package org.kie.kogito.examples;

import org.kie.kogito.monitoring.process.PrometheusProcessEventListener;
import org.kie.kogito.process.impl.DefaultProcessEventListenerConfig;
import org.springframework.stereotype.Component;

@Component
public class ProcessEventListenerConfig extends DefaultProcessEventListenerConfig {
   
    public ProcessEventListenerConfig() {
        super(new PrometheusProcessEventListener("onboarding"));
    }
}
