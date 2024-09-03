import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-card',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './card.component.html',
  styleUrl: './card.component.css'
})



export class CardComponent {
    country:string = 'COP';
    currency:string='$';
    typetemplate:string='simple';

    products: any[] = [
      {name:'Soda',stock:1,describe:'lorem3',price:2000},
      {name:'Water',stock:2,describe:'lorem1',price:2000},
      {name:'Cookies',stock:3,describe:'lorem2',price:2000}
    ]

}
