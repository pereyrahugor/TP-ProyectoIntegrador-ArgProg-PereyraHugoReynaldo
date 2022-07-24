import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Error404Component } from './components/error404/error404.component';
import { ExperiencesNewFormComponent } from './components/experiences-new-form/experiences-new-form.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { TestsComponent } from './components/tests/tests.component';

const routes: Routes = [
   {path:'', component: HomeComponent},
   {path:'login', component: LoginComponent},
   {path:'tests', component: TestsComponent},
   {path:'newExperience', component: ExperiencesNewFormComponent},
   {path: '**', component: Error404Component}
 

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
