import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddLeavesComponent } from './components/add-leaves/add-leaves.component';
import { ApplyLeavesComponent } from './components/apply-leaves/apply-leaves.component';
import { AvailCompOffComponent } from './components/avail-comp-off/avail-comp-off.component';
import { ShowLeavesComponent } from './components/show-leaves/show-leaves.component';
import { LeaveHistoryComponent } from './components/leave-history/leave-history.component';
import { LeaveManagementRoutingModule } from './leave-management-routing.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [AddLeavesComponent, 
    ApplyLeavesComponent, 
    AvailCompOffComponent, 
    ShowLeavesComponent, 
    LeaveHistoryComponent],
  imports: [
    CommonModule,
    LeaveManagementRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class LeaveManagementModule { }
