import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserLeavesComponent } from './user-leaves/user-leaves.component';

const routes: Routes = [
  {path :'userLeaves' , component : UserLeavesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
