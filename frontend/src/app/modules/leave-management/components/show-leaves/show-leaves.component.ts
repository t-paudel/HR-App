import { Component, OnInit } from '@angular/core';
import { UserLeaves } from '../../models/user-leaves';
import { LeaveService } from '../../services/leave.service';

@Component({
  selector: 'app-show-leaves',
  templateUrl: './show-leaves.component.html',
  styleUrls: ['./show-leaves.component.css']
})
export class ShowLeavesComponent implements OnInit {

  user = "tushar"
  leaves = new UserLeaves();

  constructor(private leaveService:LeaveService) { }

  ngOnInit() 
  {
    this.leaveService.getAvailableLeaves(this.user).subscribe((data:UserLeaves) => {
      this.leaves = data;
      console.log(this.leaves);
    });
  }
}
