import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AltaClienteComponent } from './alta-cliente/alta-cliente.component';
import { FormsModule } from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';

const routes: Routes = [
{path:"cliente/alta", component: AltaClienteComponent},  
{path:"", redirectTo:"/mockachino", pathMatch:"full"}

];

@NgModule({
  imports: [RouterModule.forRoot(routes),HttpClientModule],
  exports: [RouterModule],
  providers:[HttpClientModule]

})
export class AppRoutingModule { }
