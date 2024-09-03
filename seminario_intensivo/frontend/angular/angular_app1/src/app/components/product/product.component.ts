import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ProductsService } from '../../services/products.service';
import { Product } from './Product';
import { RowComponent } from '../row/row.component';

@Component({
  selector: 'app-product',
  standalone: true,
  imports: [FormsModule, CommonModule, RowComponent],
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent {

  constructor(private service: ProductsService) {

  }

  ngOnInit(): void {
    //this.list();
    let prduc = this.service.get2();
    this.products.push(prduc);

  }

  products:Product[]=[];


  name: string = "";
  description: string = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
  price: number = 0;
  state: boolean= false;
  active: boolean = false;
  idtegory: string="";
  

  pod: Product= {name:this.name,description:this.description,price:this.price,state:this.state,idtegory:this.idtegory}

  //categories:string[]=["Health","Botanic","Clothes","Shoes","Beauty"]
  categories:any[]=[
    {id:'1',name:'health article'},
    {id:'2',name:'tech article'},
    {id:'3',name:'clothes article'},
    {id:'4',name:'beauty article'}

  ]

  save(): void {
    console.log(this.name);
    console.log(this.description);
    console.log(this.price);
    console.log(this.state);
    console.log(this.idtegory);

    let prod: Product = {name:this.name,description:this.description,price:this.price,state:this.state,idtegory:this.idtegory}
    let res=this.service.save(prod);
    if(res) {
      console.log("successful save")
    } else {
      console.error("ERROR SAVE")

    }

  }

  list() {
    this.service.get("3");
  }

}
