package org.learn.axonframework.coreapi

import org.axonframework.commandhandling.TargetAggregateIdentifier

//model
data class ProductInfo(val productId: String, val comment: String, val price: Int)


class FileOrderCommand(@TargetAggregateIdentifier val orderId: String, val productInfo : ProductInfo)

class CreateInvoiceCommand(val orderId: String, val productId: String, val comment: String)


class OrderFiledEvent(val orderId: String, val productInfo : ProductInfo)

class InvoiceCreatedEvent(val invoiceId : String, val orderId: String)
