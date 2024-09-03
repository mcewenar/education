import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-row',
  standalone: true,
  imports: [],
  templateUrl: './row.component.html',
  styleUrl: './row.component.css'
})
export class RowComponent {
  //Este es el componente hijo y así se le pasa usando un Input
  @Input() id:string="";
  @Input() name:string="";
  @Input() description:string="";
  @Input() status:boolean=false;

}
