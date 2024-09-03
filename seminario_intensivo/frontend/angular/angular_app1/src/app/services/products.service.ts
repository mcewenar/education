import { Injectable } from '@angular/core';
import {Product} from '../components/product/Product'
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {


  endpoint: string = ""
  operation="";

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  save(product:Product): boolean {
    this.http.post(`${this.endpoint}/${this.operation}`,product).subscribe(
      data => {
        console.log(data);
        return true;
      }, error => {
        console.log(error);
        return false;
      })
      return false;

  }


  get(id: string) {
    this.http.get(`${this.endpoint}/?id=${id}`).subscribe(
      data => {
        console.log(data);
        return true;
      }, error => {
        console.log(error);
        return false;
      })
      return false
  }

  update(product:Product) {

    this.http.put(`${this.endpoint}/${this.operation}`,product).subscribe(
      data => {
        console.log(data);
      }, error => {
        console.log(error)
      }
    );

  }

  get2(): Product {
    return {name:"calculadora", description: "lorem ipsum",price:3, state:true, idtegory:"1" }
  }
}
