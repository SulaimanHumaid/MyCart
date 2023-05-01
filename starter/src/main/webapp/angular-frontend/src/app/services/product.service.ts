import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../models/Product';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  constructor(private http: HttpClient) {}

  url = 'http://localhost:8080/api/';

  getProducts(): Observable<Product[]> {
    //TODO: Fetch the product list from the API
    return this.http.get<Product[]>(this.url, {
      headers: { Authorization: 'Basic dWRhY2l0eTpwYXNzd29yZA==' },
    });
  }

  getProductById(id: number): Observable<Product> {
    //TODO: Fetch the product list from the API
    return this.http.get<Product>(this.url + id, {
      headers: { Authorization: 'Basic dWRhY2l0eTpwYXNzd29yZA==' },
    });
  }
}
