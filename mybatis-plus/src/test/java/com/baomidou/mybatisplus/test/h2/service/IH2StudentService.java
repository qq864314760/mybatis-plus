/*
 * Copyright (c) 2011-2019, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.test.h2.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.test.h2.entity.persistent.H2Student;

/**
 * Created by nieqiuqiu on 2018/9/6.
 */
public interface IH2StudentService extends IService<H2Student> {

    void testTransactional();

    void testSqlRunnerTransactional();
}
