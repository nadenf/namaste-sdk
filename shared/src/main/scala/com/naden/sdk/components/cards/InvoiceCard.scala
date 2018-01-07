package com.naden.sdk.components.cards

import com.naden.sdk.components.Component
import com.naden.sdk.models.Invoice
import boopickle.Default._

case class InvoiceCard(invoice: Invoice,
            showTitle: Boolean,
            showSocial: Boolean,
            showMessaging: Boolean,
            value: String) extends Component
