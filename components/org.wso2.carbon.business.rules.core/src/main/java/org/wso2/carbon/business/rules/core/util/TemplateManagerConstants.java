/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.business.rules.core.util;

import org.wso2.carbon.utils.Utils;

/**
 * Consists of constants related to root.Template Manager
 */
public class TemplateManagerConstants {
    // Directory locations
    private static final String CARBON_HOME = Utils.getCarbonHome().toString();
    public static final String TEMPLATES_DIRECTORY = CARBON_HOME + "/resources/businessRules/templates/";
    // Pattern of templated elements in Templates
    // ${templatedElement}
    public static final String TEMPLATED_ELEMENT_NAME_REGEX_PATTERN = "\\$\\{(\\S+)\\}";

    // Pattern of Template names
   // @App:name("SiddhiAppName")
    public static final String SIDDHI_APP_NAME_REGEX_PATTERN = "@App:name\\([\\\",\\\'](\\S+)[\\\",\\\']\\)";
    // @App:name("SiddhiAppName")
    public static final String SIDDHI_APP_RULE_LOGIC_PATTERN = "(\\d{1,})";
    // Template / Artifact types
    public static final String TEMPLATE_TYPE_SIDDHI_APP = "siddhiApp";
    public static final String TEMPLATE_TYPE_GADGET = "gadget";
    public static final String TEMPLATE_TYPE_DASHBOARD = "dashboard";
    public static final String SIDDHI_APP_TEMPLATE = "@App:name('appName') ${inputTemplate} ${outputTemplate} from " +
            "${inputStreamName} [ ${logic} ] select ${mapping} insert into ${outputStreamName}";

    // Rule Template types
    public static final String RULE_TEMPLATE_TYPE_INPUT = "input";
    public static final String RULE_TEMPLATE_TYPE_OUTPUT = "output";
    public static final String RULE_TEMPLATE_TYPE_TEMPLATE = "template";
    public static final String RULE_TEMPLATE_TYPE_SCRATCH = "scratch";

    // Business Rule types
    public static final String BUSINESS_RULE_TYPE_TEMPLATE = "template";
    public static final String BUSINESS_RULE_TYPE_SCRATCH = "scratch";

    // Instance count for Rule Templates
    public static final String INSTANCE_COUNT_ONE = "one";
    public static final String INSTANCE_COUNT_MANY = "many";

    public static final String BUSINESS_RULES = "business.rules";

    public final static int SAVE_SUCCESSFUL_DEPLOYMENT_FAILED = 4;
    public final static int SAVE_SUCCESSFUL_DEPLOYMENT_SUCCESSFUL = 3;
    public final static int SAVE_SUCCESSFUL_PARTIALLY_DEPLOYED = 2;
    public final static int SAVE_SUCCESSFUL_NOT_DEPLOYED = 0;
    public final static int OPERATION_FAILED = -1;
}
