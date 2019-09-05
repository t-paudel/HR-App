import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ShowLeavesComponent } from './components/show-leaves/show-leaves.component';

const routes: Routes = [
  {path : 'showleaves', component : ShowLeavesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
