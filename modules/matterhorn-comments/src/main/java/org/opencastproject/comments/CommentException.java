/**
 * Licensed to The Apereo Foundation under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 *
 * The Apereo Foundation licenses this file to you under the Educational
 * Community License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License
 * at:
 *
 *   http://opensource.org/licenses/ecl2.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package org.opencastproject.comments;

/**
 * Exception thrown in {@link CommentService}
 */
public class CommentException extends Exception {

  /**
   * UUID of exception
   */
  private static final long serialVersionUID = 5021589610482150120L;

  /**
   * Used to create exception without parameters.
   */
  public CommentException() {
  }

  /**
   * Used to create exception with exception message.
   * 
   * @param message
   *          exception message
   */
  public CommentException(String message) {
    super(message);
  }

  /**
   * Used to create exception with a cause.
   * 
   * @param cause
   */
  public CommentException(Throwable cause) {
    super(cause);
  }

  /**
   * Used to create exception with a message and a cause
   * 
   * @param message
   * @param cause
   */
  public CommentException(String message, Throwable cause) {
    super(message, cause);
  }

}
