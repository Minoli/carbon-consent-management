/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbon.consent.mgt.core.model;

/**
 * Model class for PIICategory entries in a Purpose.
 */
public class PurposePIICategory extends PIICategory {

    private Boolean mandatory;

    public PurposePIICategory(PIICategory piiCategory, Boolean mandatory) {

        super(piiCategory.getId(), piiCategory.getName(), piiCategory.getDescription(), piiCategory.getSensitive(),
              piiCategory.getTenantId(), piiCategory.getDisplayName());
        this.mandatory = mandatory;
    }

    public PurposePIICategory(Integer id, Boolean mandatory) {

        super(id);
        this.mandatory = mandatory;
    }

    public Boolean getMandatory() {

        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {

        this.mandatory = mandatory;
    }
}
