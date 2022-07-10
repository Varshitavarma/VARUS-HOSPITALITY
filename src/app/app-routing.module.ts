import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './pages/about/about.component';
import { ContactComponent } from './pages/contact/contact.component';
import { HomeComponent } from './pages/home/home.component';
import { RoomsComponent } from './pages/rooms/rooms.component';
import { RoompageComponent } from './pages/roompage/roompage.component';
import { LoginComponent } from './pages/login/login.component';
import { RegistrationComponent } from './pages/registration/registration.component'


const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'menu',component:RoomsComponent},
  {path:'menu/:id',component:RoompageComponent},
  {path:'about',component:AboutComponent},
  {path:'contact',component:ContactComponent},
  {path: 'login',component:LoginComponent},
  {path: 'registration', component:RegistrationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }