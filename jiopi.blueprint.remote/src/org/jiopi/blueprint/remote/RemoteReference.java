/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */
package org.jiopi.blueprint.remote;

import java.io.Serializable;

/**
 * A remote object reference.
 *
 *
 * @version 0.5 ,2010.10.31
 * @since JIOPi0.5 , 2010.10.31
 */
@Version
public class RemoteReference implements Serializable{

	private static final long serialVersionUID = 5L;

	/**
     * Remote JIOPi container's URL
     */
    public final String REMOTE_URI;

    /**
     * UUID String to identify a remote JIOPi remote container
     */
    public final String REMOTE_UUID;


    /**
     * unique object id in a remote JIOPi container
     */
    public final long OBJECT_ID;


    public RemoteReference(String remote_uri, String remote_uuid, long object_id) {
        REMOTE_URI = remote_uri;
        REMOTE_UUID = remote_uuid;
        OBJECT_ID = object_id;
    }
}
