import { Component, OnInit } from '@angular/core';
import { HistoryService } from 'src/app/service/history.service';
import { LeaveHistory } from 'src/app/models/leave-history';

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
