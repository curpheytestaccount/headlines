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
import com.google.gson.annotations.SerializedName;

import javax.annotation.concurrent.Immutable;

/**
 * Defines the meta-policy for the current domain. A meta-policy specifies acceptable
 * domain policy files other than the master policy file located in the target domain's root and named
 * crossdomain.xml.  (from Cross-domain Policy File Specification)
 */
@Immutable
public final class SiteControlConfig {

    ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public static final String HEADER_NAME = "site-control";

    ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @SerializedName("permitted-cross-domain-policies")
    private volatile ImmutableList<String> permittedCrossDomainPolicies;

    private volatile boolean enabled = true;

    /////////////////////////////// Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


    ////////////////////////////////// Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    //------------------------ Implements:

    //------------------------ Overrides:

    //---------------------------- Abstract Methods -----------------------------

    //---------------------------- Utility Methods ------------------------------

    //---------------------------- Property Methods -----------------------------

    /**
     *
     * @return specified the meta-policy
     */
    public ImmutableList<String> getPermittedCrossDomainPolicies() {
        return permittedCrossDomainPolicies;
    }

    public void setPermittedCrossDomainPolicies(ImmutableList<String> permittedCrossDomainPolicies) {
        this.permittedCrossDomainPolicies = permittedCrossDomainPolicies;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
