package com.naden.sdk.components.cards

import boopickle.Default._

import com.naden.sdk.models.{Component, Invoice}

case class InvoiceCard(invoice: Invoice,
            showTitle: Boolean,
            showSocial: Boolean,
            showMessaging: Boolean,
            value: String) extends Component


object InvoiceCard {
	implicit val pickler: Pickler[InvoiceCard] = generatePickler[InvoiceCard]
}