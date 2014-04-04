/*
  Copyright (c) 2014  SourceClear Inc.
      
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

package com.sourceclear.headlines.impl.cdpbeans;

import com.google.common.collect.ImmutableList;

import javax.annotation.concurrent.Immutable;

/**
 * allow-http-request-headers-from grants a requesting document from a requesting
 * domain to send user-defined headers to the target domain. This tag grants permission to push data
 * in the form of headers. (from Cross-domain Policy File Specification)
 */
@Immutable
public final class AllowHttpRequestHeadersConfig {

    ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public static final String HEADER_NAME = "allow-http-request-headers-from";

    ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private volatile ImmutableList<String> domain;

    private volatile ImmutableList<String> headers;

    private volatile boolean secure = true;

    private volatile boolean enabled = true;

    /////////////////////////////// Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


    ////////////////////////////////// Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    //------------------------ Implements:

    //------------------------ Overrides:

    //---------------------------- Abstract Methods -----------------------------

    //---------------------------- Utility Methods ------------------------------

    //---------------------------- Property Methods -----------------------------

    /**
     * @return requesting domain to be granted access
     */
    public ImmutableList<String> getDomain() {
        return domain;
    }

    public void setDomain(ImmutableList<String> domain) {
        this.domain = domain;
    }

    /**
     * @return a comma-separated list of headers that the allowed requesting domain is permitted to send.
     */
    public ImmutableList<String> getHeaders() {
        return headers;
    }

    public void setHeaders(ImmutableList<String> headers) {
        this.headers = headers;
    }

    /**
     * @return false if allows an HTTPS policy file to grant access to a request
     * coming from an HTTP source. The default is true, providing only HTTPS sources permission.
     */
    public boolean isSecure() {
        return secure;
    }

    public void setSecure(boolean secure) {
        this.secure = secure;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
