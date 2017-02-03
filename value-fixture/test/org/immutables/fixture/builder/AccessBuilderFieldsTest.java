/*
   Copyright 2016 Immutables Authors and Contributors

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.immutables.fixture.builder;

import java.util.EnumMap;
import java.util.EnumSet;
import org.junit.Test;

public class AccessBuilderFieldsTest {
  @Test
  public void accessFields() {
    AccessBuilderFields a = new AccessBuilderFields.Builder()
      .a(1)
      .b("b")
      .c(EnumSet.allOf(AccessBuilderFields.T.class))
      .d(new EnumMap<AccessBuilderFields.T, String>(AccessBuilderFields.T.class))
      .addE("e1", "e2")
      .putF("fk", "fv")
      .accessFields()
      .build();
  }
}