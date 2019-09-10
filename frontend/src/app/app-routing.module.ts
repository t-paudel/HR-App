import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  // {path : 'showleaves', component : ShowLeavesComponent},
  // {path : 'addleaves', component : AddLeavesComponent},
  // {path : 'applyleaves', component : ApplyLeavesComponent},
  // {path : 'availcompoff', component : AvailCompOffComponent},
  // {path : 'leavehistory', component : LeaveHistoryComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
