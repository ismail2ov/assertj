/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2023 the original author or authors.
 */
package org.assertj.core.api;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

/**
 * Tests for <code>{@link Assertions#assertThat(LocalDateTime)}</code>.
 * 
 * @author Joel Costigliola
 * @author Marcin Zajączkowski
 */
class Assertions_assertThat_with_LocalDateTime_Test {

  @Test
  void should_create_Assert() {
    AbstractLocalDateTimeAssert<?> assertions = Assertions.assertThat(LocalDateTime.now());
    assertThat(assertions).isNotNull();
  }

  @Test
  void should_pass_actual() {
    LocalDateTime localDateTime = LocalDateTime.now();
    AbstractLocalDateTimeAssert<?> assertions = Assertions.assertThat(localDateTime);
    assertThat(assertions.getActual()).isSameAs(localDateTime);
  }
}
