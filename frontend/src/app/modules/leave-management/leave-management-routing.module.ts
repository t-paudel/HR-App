import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ShowLeavesComponent } from './components/show-leaves/show-leaves.component';
import { AddLeavesComponent } from './components/add-leaves/add-leaves.component';
import { ApplyLeavesComponent } from './components/apply-leaves/apply-leaves.component';
import { AvailCompOffComponent } from './components/avail-comp-off/avail-comp-off.component';
import { LeaveHistoryComponent } from './components/leave-history/leave-history.component';

const routes: Routes = [
  {path : 'showleaves', component : ShowLeavesComponent},
  {path : 'addleaves', component : AddLeavesComponent},
  {path : 'applyleaves', component : ApplyLeavesComponent},
  {path : 'availcompoff', component : AvailCompOffComponent},
  {path : 'leavehistory', component : LeaveHistoryComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LeaveManagementRoutingModule { }
