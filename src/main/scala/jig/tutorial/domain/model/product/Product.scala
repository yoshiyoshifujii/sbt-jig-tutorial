package jig.tutorial.domain.model.product

/**
 * 商品
 */
class Product(name: Name, price: Price) {
  def productStock: ProductStock = ProductStock.在庫あり
}
