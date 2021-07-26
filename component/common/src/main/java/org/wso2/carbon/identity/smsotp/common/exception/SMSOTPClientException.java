/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbon.identity.smsotp.common.exception;

/**
 * SMS OTP client exception
 */
public class SMSOTPClientException extends SMSOTPException {

    public SMSOTPClientException(String errorCode, String message) {

        super(errorCode, message);
    }

    public SMSOTPClientException(String errorCode, String message, Throwable throwable) {

        super(errorCode, message, throwable);
    }

    public SMSOTPClientException(String message, String description, String errorCode) {

        super(message, description, errorCode);
    }

    public SMSOTPClientException(String message, String description, String errorCode, Throwable e) {

        super(message, description, errorCode, e);
    }

}