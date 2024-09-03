LAS DIRECTIVAS SE PUEDEN PERSONALIZAR, PARA USOS ESPECÍFICOS

1. Attribute directive: es usado para dar comportamientos o cambiar elementos in la aparienci: 
    ngModel, ngClass, ngStyle (DIRECTIVAS PREDETERMINADAS)

2. Structural directive (cambia el layout del DOM model. Agrega o remueve elementos): *ngIf, *ngFor, ngSwitch, ngPlural, ngTemplate, 
    ngComponentOutlet


INSTALACIÓN DE ANGULAR:
npm install -g @angular/cli (instalar previamente npm y node)

INICIAR UN PROYECTO EN ANGULAR:
ng new <<project_name>>

CORRER EL PROYECTO EN ANGULAR:
ng serve 

CREAR COMPONENTE EN ANGULAR:
ng generate component components/card

CREAR UN SERVICIO EN ANGULAR:
ng generate service services/products


SCRIPTS:
"scripts": {
    "ng": "ng",
    "start": "ng serve",
    "build": "ng build",
    "watch": "ng build --watch --configuration development",
    "test": "ng test"
  },
