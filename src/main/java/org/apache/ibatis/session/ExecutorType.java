/*
 *    Copyright 2009-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.session;

/**
 * @author Clinton Begin
 */
public enum ExecutorType {

  /**
   * 简单执行器，执行一次sql就会创建一个statement
   */
  SIMPLE,

  /**
   * 批量执行器 todo ？
   */
  REUSE,

  /**
   * 重用执行器，内部会维护一个map集合，会把创建的statement存入map，下次要用的时候直接拿出来
   */
  BATCH

  /**
   * 还有一个执行器，叫做CachingExecutor，如果mybatis允许缓存的话，就会用这个执行器进行装饰
   */

}
