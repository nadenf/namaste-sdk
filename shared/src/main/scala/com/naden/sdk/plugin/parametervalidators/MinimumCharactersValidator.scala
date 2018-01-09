package com.naden.sdk.plugin.parametervalidators

import com.naden.sdk.plugin.ParameterValidator

case class MinimumCharactersValidator(length: Int)()
    extends ParameterValidator {
  override def invalid(str: String): Option[String] = str match {
    case s: String if s.length <= length =>
      Some("validation.minimumCharacters") // TODO add length
    case _ => None
  }
}
