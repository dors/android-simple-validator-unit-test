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

import android.support.annotation.NonNull;
import android.text.TextUtils;

/**
 * simple class for checking if an email or password are valid
 */
public class CredentialsValidator {

	public CredentialsValidator() {

	}

	/**
	 * @param email
	 * @return true if the email is not null, not empty and has a valid email structure
	 */
	public boolean isEmailValid(@NonNull String email) {
		return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email)
		                                                                       .matches();
	}

	/**
	 * @param password
	 * @return true if the password is not null and not empty
	 */
	public boolean isPasswordValid(@NonNull String password) {
		return !TextUtils.isEmpty(password);
	}

}
