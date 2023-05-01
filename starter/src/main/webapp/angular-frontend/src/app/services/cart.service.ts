import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Order } from '../models/Order';
import { Product } from '../models/Product';
import { ProductItemComponent } from '../components/product-item/product-item.component';

@Injectable({
  providedIn: 'root',
})
export class CartService {
  cartProducts: any[] = [];
  url = 'http://localhost:4200/orders/';

  constructor(private http: HttpClient) {}

  getCartProducts() {
    return this.cartProducts;
  }

  addToCart(product: any, amount: any) {
    //TODO: Add item to the cart
    // existingProduct.amount += parseInt(amount);

    let contains = this.cartProducts.findIndex((x) => x.id === product.id);
    if (contains >= 0) {
      this.cartProducts[contains].amount += 1;
    } else {
      this.cartProducts.push(product);
    }
    alert('Added to cart!');
  }

  clearCart() {
    this.cartProducts = [];
    return this.cartProducts;
  }

  updateCart(cart: any) {
    this.cartProducts = cart;

    return this.cartProducts;
  }

  submitOrder(order: any): Observable<any> {
    //Submit the order information the API
    return this.http.post<Order>(this.url, order, {
      headers: { Authorization: 'Basic dWRhY2l0eTpwYXNzd29yZA==' },
    });
  }
}
