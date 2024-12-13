package io.opentelemetry.sdk.metrics.export;

import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.metrics.MetricFilterResults;

public interface MetricFilter {

  MetricFilterResults testMetric(InstrumentationScopeInfo instrumentationScopeInfo, );
}
