/*
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

package com.aliyuncs.lrg.transform.v20191010;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lrg.model.v20191010.SubnetControllerListResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubnetControllerListResponseUnmarshaller {

	public static SubnetControllerListResponse unmarshall(SubnetControllerListResponse subnetControllerListResponse, UnmarshallerContext _ctx) {
		
		subnetControllerListResponse.setCode(_ctx.integerValue("SubnetControllerListResponse.code"));
		subnetControllerListResponse.setMessage(_ctx.stringValue("SubnetControllerListResponse.message"));
		subnetControllerListResponse.setSuccess(_ctx.booleanValue("SubnetControllerListResponse.success"));

		List<Map<Object, Object>> data = _ctx.listMapValue("SubnetControllerListResponse.data");
		subnetControllerListResponse.setData(data);
	 
	 	return subnetControllerListResponse;
	}
}