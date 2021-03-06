/***********************************************************************************************************************
 *
 * Copyright (C) 2010 by the Stratosphere project (http://stratosphere.eu)
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
package eu.stratosphere.sopremo.pact;

import eu.stratosphere.api.common.operators.Ordering;
import eu.stratosphere.api.common.operators.base.ReduceOperatorBase;
import eu.stratosphere.sopremo.operator.ElementaryOperator;

@SuppressWarnings({ "unchecked", "rawtypes" })
public final class SopremoReduceOperator extends ReduceOperatorBase {
	private final ElementaryOperator<?> operator;

	private Ordering innerGroupOrder;

	public SopremoReduceOperator(final ElementaryOperator<?> operator, final Class udf, final int[] keyPositions,
			final String name) {
		super(udf, keyPositions, name);
		this.operator = operator;
	}

	/**
	 * Returns the innerGroupOrder.
	 * 
	 * @return the innerGroupOrder
	 */
	public Ordering getInnerGroupOrder() {
		return this.innerGroupOrder;
	}

	@Override
	public boolean isCombinable() {
		return this.operator.isCombinable();
	}

	/**
	 * Sets the innerGroupOrder to the specified value.
	 * 
	 * @param innerGroupOrder
	 *        the innerGroupOrder to set
	 */
	public void setInnerGroupOrder(final Ordering innerGroupOrder) {
		if (innerGroupOrder == null)
			throw new NullPointerException("innerGroupOrder must not be null");

		this.innerGroupOrder = innerGroupOrder;
	}
}