/***********************************************************************************************************************
 *
 * Copyright (C) 2010-2013 by the Stratosphere project (http://stratosphere.eu)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 **********************************************************************************************************************/
package eu.stratosphere.sopremo.packages;

import eu.stratosphere.sopremo.expressions.EvaluationExpression;

/**
 * Registry that manages constants in the form of {@link EvaluationExpression}s.
 * 
 */
public interface IConstantRegistry extends IRegistry<EvaluationExpression> {

	/**
	 * @param javaConstants
	 */
	void put(Class<?> javaConstants);
}
