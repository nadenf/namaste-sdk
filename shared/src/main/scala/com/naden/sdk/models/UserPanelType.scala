package com.naden.sdk.models

import com.naden.sdk.components.{Border, BorderSize, Color, Component}
import com.naden.sdk.plugin.Parameter
import com.naden.sdk.plugin.services.PanelType

case class UserPanelType(
    createdBy: User,
    title: String,
    description: String,
    layout: Layout[Component],
    override val instanceParameters: List[Parameter],
    override val globalParameters: List[Parameter],
    override val scripts: List[String],
    override val stylesheets: List[String],
    override val userEditable: Boolean,
    override val allowUserRefresh: Boolean,
    override val panelColour: Color,
    override val borders: Set[(Border, BorderSize, Color)])
    extends PanelType {

  override def layout(parameterValues: List[(Parameter, String)]) = layout

  override def layoutHasChanged: Boolean = false

  override def onStartup(): Unit = {}

  override def onShutdown(): Unit = {}
}
