/**
 * Copyright (c) 2000-2016 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.portal.component.inputrichtext.internal;

/**
 * @author  Neil Griffin
 */
public class RichTextFactoryImpl implements RichTextFactory {

	@Override
	public RichText getRichText(RichText.Type type, String value) {

		switch (type) {

		case BBCODE: {
			return new RichTextBBCodeImpl(value);
		}

		case CREOLE: {
			return new RichTextCreoleImpl(value);
		}

		default: {
			return new RichTextHTMLImpl(value);
		}
		}
	}
}