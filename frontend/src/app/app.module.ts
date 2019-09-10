import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ApplyLeavesComponent } from './components/apply-leaves/apply-leaves.component';
import { ShowLeavesComponent } from './components/show-leaves/show-leaves.component';
import { HttpClientModule } from '@angular/common/http';
import { AddLeavesComponent } from './components/add-leaves/add-leaves.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AvailCompOffComponent } from './components/avail-comp-off/avail-comp-off.component';
import { LeaveHistoryComponent } from './components/leave-history/leave-history.component';

@NgModule({
  declarations: [
    AppComponent,
    ShowLeavesComponent,
    ApplyLeavesComponent,
    AddLeavesComponent,
    AvailCompOffComponent,
    LeaveHistoryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
