import { Component, OnInit } from '@angular/core';
import { LeaveHistory } from '../../models/leave-history';
import { HistoryService } from '../../services/history.service';

@Component({
  selector: 'app-leave-history',
  templateUrl: './leave-history.component.html',
  styleUrls: ['./leave-history.component.css']
})
export class LeaveHistoryComponent implements OnInit {

  empId="tushar";
  historyData:LeaveHistory[];

  constructor(private historyService:HistoryService) { }

  ngOnInit() 
  {
    this.historyService.getLeaveHistory(this.empId).subscribe((data:LeaveHistory[])=>{
      this.historyData = data;
      console.log(this.historyData);
    });
  }

}
