/*
 * Copyright (c) 2021. Kwai, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author KOOM Team
 *
 */
package com.kwai.koom.base

object MonitorBuildConfig {
  @JvmStatic
  val DEBUG by lazy { MonitorManager.commonConfig.debugMode }

  @JvmStatic
  val VERSION_NAME by lazy { MonitorManager.commonConfig.versionNameInvoker() }

  @JvmStatic
  val PRODUCT_NAME by lazy { MonitorManager.commonConfig.productNameInvoker() }

  @JvmStatic
  val SERVICE_ID by lazy { MonitorManager.commonConfig.serviceIdInvoker() }

  @JvmStatic
  val CHANNEL by lazy { MonitorManager.commonConfig.channelInvoker() }

  @JvmStatic
  val DEVICE_ID by lazy { MonitorManager.commonConfig.deviceIdInvoker() }

  @JvmStatic
  val ROM by lazy { MonitorManager.commonConfig.romInvoker() }
}