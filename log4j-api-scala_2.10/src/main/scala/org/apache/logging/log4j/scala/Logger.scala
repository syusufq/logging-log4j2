/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */
package org.apache.logging.log4j.scala

import org.apache.logging.log4j.message.{Message, MessageFactory2}
import org.apache.logging.log4j.spi.ExtendedLogger
import org.apache.logging.log4j.{Level, Marker}

import scala.language.experimental.macros

class Logger(val delegate: ExtendedLogger) {

  private final val FQCN = classOf[Logger].getName

  def fatal(marker: Marker, message: Message): Unit =
  macro LoggerMacro.fatalMarkerMsg

  def fatal(marker: Marker, message: CharSequence): Unit =
  macro LoggerMacro.fatalMarkerString

  def fatal(marker: Marker, message: AnyRef): Unit =
  macro LoggerMacro.fatalMarkerObject

  def fatal(marker: Marker, message: Message, cause: Throwable): Unit =
  macro LoggerMacro.fatalMarkerMsgThrowable

  def fatal(marker: Marker, message: CharSequence, cause: Throwable): Unit =
  macro LoggerMacro.fatalMarkerStringThrowable

  def fatal(marker: Marker, message: AnyRef, cause: Throwable): Unit =
  macro LoggerMacro.fatalMarkerObjectThrowable

  def fatal(message: Message): Unit =
  macro LoggerMacro.fatalMsg

  def fatal(message: CharSequence): Unit =
  macro LoggerMacro.fatalString
  
  def fatal(message: AnyRef): Unit =
  macro LoggerMacro.fatalObject
  
  def fatal(message: Message, cause: Throwable): Unit =
  macro LoggerMacro.fatalMsgThrowable

  def fatal(message: CharSequence, cause: Throwable): Unit =
  macro LoggerMacro.fatalStringThrowable

  def fatal(message: AnyRef, cause: Throwable): Unit =
  macro LoggerMacro.fatalObjectThrowable


  def error(marker: Marker, message: Message): Unit =
  macro LoggerMacro.errorMarkerMsg

  def error(marker: Marker, message: CharSequence): Unit =
  macro LoggerMacro.errorMarkerString

  def error(marker: Marker, message: AnyRef): Unit =
  macro LoggerMacro.errorMarkerObject

  def error(marker: Marker, message: Message, cause: Throwable): Unit =
  macro LoggerMacro.errorMarkerMsgThrowable

  def error(marker: Marker, message: CharSequence, cause: Throwable): Unit =
  macro LoggerMacro.errorMarkerStringThrowable

  def error(marker: Marker, message: AnyRef, cause: Throwable): Unit =
  macro LoggerMacro.errorMarkerObjectThrowable

  def error(message: Message): Unit =
  macro LoggerMacro.errorMsg

  def error(message: CharSequence): Unit =
  macro LoggerMacro.errorString

  def error(message: AnyRef): Unit =
  macro LoggerMacro.errorObject

  def error(message: Message, cause: Throwable): Unit =
  macro LoggerMacro.errorMsgThrowable

  def error(message: CharSequence, cause: Throwable): Unit =
  macro LoggerMacro.errorStringThrowable

  def error(message: AnyRef, cause: Throwable): Unit =
  macro LoggerMacro.errorObjectThrowable


  def warn(marker: Marker, message: Message): Unit =
  macro LoggerMacro.warnMarkerMsg

  def warn(marker: Marker, message: CharSequence): Unit =
  macro LoggerMacro.warnMarkerString

  def warn(marker: Marker, message: AnyRef): Unit =
  macro LoggerMacro.warnMarkerObject

  def warn(marker: Marker, message: Message, cause: Throwable): Unit =
  macro LoggerMacro.warnMarkerMsgThrowable

  def warn(marker: Marker, message: CharSequence, cause: Throwable): Unit =
  macro LoggerMacro.warnMarkerStringThrowable

  def warn(marker: Marker, message: AnyRef, cause: Throwable): Unit =
  macro LoggerMacro.warnMarkerObjectThrowable

  def warn(message: Message): Unit =
  macro LoggerMacro.warnMsg

  def warn(message: CharSequence): Unit =
  macro LoggerMacro.warnString

  def warn(message: AnyRef): Unit =
  macro LoggerMacro.warnObject

  def warn(message: Message, cause: Throwable): Unit =
  macro LoggerMacro.warnMsgThrowable

  def warn(message: CharSequence, cause: Throwable): Unit =
  macro LoggerMacro.warnStringThrowable

  def warn(message: AnyRef, cause: Throwable): Unit =
  macro LoggerMacro.warnObjectThrowable


  def info(marker: Marker, message: Message): Unit =
  macro LoggerMacro.infoMarkerMsg

  def info(marker: Marker, message: CharSequence): Unit =
  macro LoggerMacro.infoMarkerString

  def info(marker: Marker, message: AnyRef): Unit =
  macro LoggerMacro.infoMarkerObject

  def info(marker: Marker, message: Message, cause: Throwable): Unit =
  macro LoggerMacro.infoMarkerMsgThrowable

  def info(marker: Marker, message: CharSequence, cause: Throwable): Unit =
  macro LoggerMacro.infoMarkerStringThrowable

  def info(marker: Marker, message: AnyRef, cause: Throwable): Unit =
  macro LoggerMacro.infoMarkerObjectThrowable

  def info(message: Message): Unit =
  macro LoggerMacro.infoMsg

  def info(message: CharSequence): Unit =
  macro LoggerMacro.infoString

  def info(message: AnyRef): Unit =
  macro LoggerMacro.infoObject

  def info(message: Message, cause: Throwable): Unit =
  macro LoggerMacro.infoMsgThrowable

  def info(message: CharSequence, cause: Throwable): Unit =
  macro LoggerMacro.infoStringThrowable

  def info(message: AnyRef, cause: Throwable): Unit =
  macro LoggerMacro.infoObjectThrowable


  def debug(marker: Marker, message: Message): Unit =
  macro LoggerMacro.debugMarkerMsg

  def debug(marker: Marker, message: CharSequence): Unit =
  macro LoggerMacro.debugMarkerString

  def debug(marker: Marker, message: AnyRef): Unit =
  macro LoggerMacro.debugMarkerObject

  def debug(marker: Marker, message: Message, cause: Throwable): Unit =
  macro LoggerMacro.debugMarkerMsgThrowable

  def debug(marker: Marker, message: CharSequence, cause: Throwable): Unit =
  macro LoggerMacro.debugMarkerStringThrowable

  def debug(marker: Marker, message: AnyRef, cause: Throwable): Unit =
  macro LoggerMacro.debugMarkerObjectThrowable

  def debug(message: Message): Unit =
  macro LoggerMacro.debugMsg

  def debug(message: CharSequence): Unit =
  macro LoggerMacro.debugString

  def debug(message: AnyRef): Unit =
  macro LoggerMacro.debugObject

  def debug(message: Message, cause: Throwable): Unit =
  macro LoggerMacro.debugMsgThrowable

  def debug(message: CharSequence, cause: Throwable): Unit =
  macro LoggerMacro.debugStringThrowable

  def debug(message: AnyRef, cause: Throwable): Unit =
  macro LoggerMacro.debugObjectThrowable


  def trace(marker: Marker, message: Message): Unit =
  macro LoggerMacro.traceMarkerMsg

  def trace(marker: Marker, message: CharSequence): Unit =
  macro LoggerMacro.traceMarkerString

  def trace(marker: Marker, message: AnyRef): Unit =
  macro LoggerMacro.traceMarkerObject

  def trace(marker: Marker, message: Message, cause: Throwable): Unit =
  macro LoggerMacro.traceMarkerMsgThrowable

  def trace(marker: Marker, message: CharSequence, cause: Throwable): Unit =
  macro LoggerMacro.traceMarkerStringThrowable

  def trace(marker: Marker, message: AnyRef, cause: Throwable): Unit =
  macro LoggerMacro.traceMarkerObjectThrowable

  def trace(message: Message): Unit =
  macro LoggerMacro.traceMsg

  def trace(message: CharSequence): Unit =
  macro LoggerMacro.traceString

  def trace(message: AnyRef): Unit =
  macro LoggerMacro.traceObject

  def trace(message: Message, cause: Throwable): Unit =
  macro LoggerMacro.traceMsgThrowable

  def trace(message: CharSequence, cause: Throwable): Unit =
  macro LoggerMacro.traceStringThrowable

  def trace(message: AnyRef, cause: Throwable): Unit =
  macro LoggerMacro.traceObjectThrowable
  
  
  def log(level: Level, marker: Marker, message: Message): Unit =
  macro LoggerMacro.logMarkerMsg

  def log(level: Level, marker: Marker, message: CharSequence): Unit =
  macro LoggerMacro.logMarkerString

  def log(level: Level, marker: Marker, message: AnyRef): Unit =
  macro LoggerMacro.logMarkerObject

  def log(level: Level, marker: Marker, message: Message, cause: Throwable): Unit =
  macro LoggerMacro.logMarkerMsgThrowable

  def log(level: Level, marker: Marker, message: CharSequence, cause: Throwable): Unit =
  macro LoggerMacro.logMarkerStringThrowable
  
  def log(level: Level, marker: Marker, message: AnyRef, cause: Throwable): Unit =
  macro LoggerMacro.logMarkerObjectThrowable
  
  def log(level: Level, message: Message): Unit =
  macro LoggerMacro.logMsg

  def log(level: Level, message: CharSequence): Unit =
  macro LoggerMacro.logString

  def log(level: Level, message: AnyRef): Unit =
  macro LoggerMacro.logObject
  
  def log(level: Level, message: Message, cause: Throwable): Unit =
  macro LoggerMacro.logMsgThrowable

  def log(level: Level, message: CharSequence, cause: Throwable): Unit =
  macro LoggerMacro.logStringThrowable

  def log(level: Level, message: AnyRef, cause: Throwable): Unit =
  macro LoggerMacro.logObjectThrowable
  

  def isEnabled(level: Level): Boolean = delegate.isEnabled(level)

  def isEnabled(level: Level, marker: Marker): Boolean = delegate.isEnabled(level, marker)

  def entry(params: AnyRef*): Unit =
    delegate.entry(params) // TODO would be useful to have this as a macro to avoid varargs array creation

  def traceEntry(): Unit = delegate.traceEntry()

  def traceExit[R](result: R): R = delegate.traceExit(result)

  def traceExit(): Unit = delegate.traceExit()

  def throwing[T <: Throwable](t: T): T = delegate.throwing(t)

  def throwing[T <: Throwable](level: Level, t: T): T = delegate.throwing(level, t)

  def catching(t: Throwable): Unit = delegate.catching(t)

  def catching(level: Level, t: Throwable): Unit = delegate.catching(level, t)

  def level: Level = delegate.getLevel

  def name: String = delegate.getName

  def messageFactory: MessageFactory2 = delegate.getMessageFactory.asInstanceOf[MessageFactory2]

  /** Always logs a message at the specified level. It is the responsibility of the caller to ensure the specified
    * level is enabled.
    *
    * Should normally not be used directly from application code, but needs to be public for access by macros.
    *
    * @param level    log level
    * @param marker   marker or `null`
    * @param message  message
    * @param cause    cause or `null`
    */
  def logMessage(level: Level, marker: Marker, message: Message, cause: Throwable): Unit = {
    delegate.logMessage(FQCN, level, marker, message, cause)
  }

  /** Always logs a message at the specified level. It is the responsibility of the caller to ensure the specified
    * level is enabled.
    *
    * Should normally not be used directly from application code, but needs to be public for access by macros.
    *
    * @param level    log level
    * @param marker   marker or `null`
    * @param message  message
    * @param cause    cause or `null`
    */
  def logMessage(level: Level, marker: Marker, message: CharSequence, cause: Throwable): Unit = {
    delegate.logMessage(FQCN, level, marker, messageFactory.newMessage(message), cause)
  }

  /** Always logs a message at the specified level. It is the responsibility of the caller to ensure the specified
    * level is enabled.
    *
    * Should normally not be used directly from application code, but needs to be public for access by macros.
    *
    * @param level    log level
    * @param marker   marker or `null`
    * @param message  message
    * @param cause    cause or `null`
    */
  def logMessage(level: Level, marker: Marker, message: AnyRef, cause: Throwable): Unit = {
    delegate.logMessage(FQCN, level, marker, messageFactory.newMessage(message), cause)
  }

}
