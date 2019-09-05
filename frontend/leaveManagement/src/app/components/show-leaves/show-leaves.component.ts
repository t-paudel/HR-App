import { Component, OnInit } from '@angular/core';
import { UserLeaves } from 'src/app/models/user-leaves';
import { LeaveService } from 'src/app/service/leave.service';

@Component({
  selector: 'app-show-leaves',
  templateUrl: './show-leaves.component.html',
  styleUrls: ['./show-leaves.component.css']
})
export class ShowLeavesComponent implements OnInit {

  user = "tushar"
  leaves: UserLeaves;

  constructor(private service:LeaveService) { }

  ngOnInit() 
  {
    this.service.getAvailableLeaves(this.user).subscribe((data:UserLeaves) => {
      this.leaves = data;
    });
  }
}
