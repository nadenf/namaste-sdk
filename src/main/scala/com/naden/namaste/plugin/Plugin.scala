package com.naden.namaste.plugin

import com.naden.namaste.models.PageType
import com.naden.namaste.plugin.component._

trait NamastePlugin {

  def panelTypes(): Option[Set[PanelType]]

  def pageTypes(): Option[Set[PageType]]

  def pageTypeCreators(): Option[Set[PageTypeCreator]]

  def pageImporters(): Option[Set[PageImporter]]

  def pageExporters(): Option[Set[PageExporter]]

  def storageServices(): Option[Set[StorageService]]

  def authenticationServices(): Option[Set[AuthenticationService]]

  def eventHandlers(): Option[Set[EventHandler]]

  def themes(): Option[Set[Theme]]

  def tasks(): Option[Set[Task]]

  def parameterValidators(): Option[Set[ParameterValidator]]
}