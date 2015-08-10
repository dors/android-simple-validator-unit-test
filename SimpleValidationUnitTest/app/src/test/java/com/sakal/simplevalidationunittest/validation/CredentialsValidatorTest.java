/*
 * Copyright 2015 Dor Sakal
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sakal.simplevalidationunittest.validation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class) // use so Android classes like TextUtils will be mocked
@Config(manifest=Config.NONE) //To avoid WARNING: No manifest file found at ./AndroidManifest.xml.
public class CredentialsValidatorTest {

	/**
	 * single CredentialsValidator instance to use for all tests
	 */
	private CredentialsValidator mValidator;

	public CredentialsValidatorTest() {}

	/*********************************
	 * setup methods
	 *********************************/

	@Before
	public void setUp() throws
			Exception {

		mValidator = new CredentialsValidator();
	}

	/*********************************
	 * email validation methods
	 *********************************/

	@Test
	public void validate_email_empty_returnsFalse() throws
			Exception {

		Assert.assertFalse(mValidator.isEmailValid(""));
	}

	@Test
	public void validate_email_null_returnsFalse() throws
			Exception {

		Assert.assertFalse(mValidator.isEmailValid(null));
	}

	@Test
	public void validate_email_invalid_returnsFalse() throws
			Exception {

		Assert.assertFalse(mValidator.isEmailValid("invalidEmail"));
	}

	@Test
	public void validate_email_valid_returnsTrue() throws
			Exception {

		Assert.assertTrue(mValidator.isEmailValid("valid@email.com"));
	}

	/*********************************
	 * password validation methods
	 *********************************/

	@Test
	public void validate_password_empty_returnsFalse() throws
			Exception {

		Assert.assertFalse(mValidator.isPasswordValid(""));
	}

	@Test
	public void validate_password_null_returnsFalse() throws
			Exception {

		Assert.assertFalse(mValidator.isPasswordValid(null));
	}

	@Test
	public void validate_password_valid_returnsTrue() throws
			Exception {

		Assert.assertTrue(mValidator.isPasswordValid("validPassword"));
	}

}