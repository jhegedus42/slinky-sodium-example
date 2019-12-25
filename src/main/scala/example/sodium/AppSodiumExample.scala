package example.sodium

import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.{React, ReactContext}
import slinky.web.html._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("resources/App.css", JSImport.Default)
@js.native
object AppCSS extends js.Object

@JSImport("resources/logo.svg", JSImport.Default)
@js.native
object ReactLogo extends js.Object

@react object AppSodiumExample {

  type Props = Unit

  private val css = AppCSS


  val component: FunctionalComponent[Props] = FunctionalComponent[Props] { _ => "bla2"

  }


}
