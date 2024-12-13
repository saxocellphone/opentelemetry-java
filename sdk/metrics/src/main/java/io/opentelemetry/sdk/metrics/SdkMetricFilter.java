package io.opentelemetry.sdk.metrics;

import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.metrics.export.MetricFilter;

public class SdkMetricFilter implements MetricFilter {
  @Override
  public MetricFilterResults testMetric(InstrumentationScopeInfo instrumentationScopeInfo) {
    return null;
  }
}
