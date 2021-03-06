/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.hessian;

import java.io.IOException;

/**
 * Created by zhanggeng on 2017/7/23.
 *
 * @author <a href="mailto:zhanggeng.zg@antfin.com">zhanggeng</a>
 */
public interface ClassNameFilter {

    /**
     * 排序，从小到大排序，越小越前面
     *
     * @return 顺序
     */
    public int order();

    /**
     * 决定类名，例如进行过滤，转换，等等。
     *
     * @param className 类名
     * @return 类名
     */
    public String resolve(String className) throws IOException;
}
