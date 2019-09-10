import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { ApplyLeave } from '../../models/apply-leave';
import { LeaveService } from '../../services/leave.service';

@Component({
  selector: 'app-apply-leaves',
  templateUrl: './apply-leaves.component.html',
  styleUrls: ['./apply-leaves.component.css']
})
export class ApplyLeavesComponent implements OnInit 
{

  leaveForm : FormGroup;
  applyLeave = new ApplyLeave();
  leaveType = ['Sick Leave', 'Casual Leave', 'Earned Leave', 'Comp-Off', 'Loss of Pay', 'Maternity Leave'];

  constructor(private leaveService:LeaveService) { }

  ngOnInit() 
  {
    console.log('inside ngOnInit()');

    this.leaveForm = new FormGroup({
      leaveType : new FormControl('', Validators.required),
      reason : new FormControl(''),
      startDate : new FormControl('', Validators.required),
      endDate : new FormControl('', Validators.required)
    });
  }

  apply()
  {
    console.log('inside apply()');

    this.applyLeave.employeeId = "tushar";
    this.applyLeave.leaveType = this.leaveForm.controls['leaveType'].value;
    this.applyLeave.reason = this.leaveForm.controls['reason'].value;
    this.applyLeave.startDate = this.leaveForm.controls['startDate'].value;
    this.applyLeave.endDate = this.leaveForm.controls['endDate'].value;

    this.leaveService.applyLeave(this.applyLeave).subscribe(()=>{})
    console.log(this.applyLeave);
  }
}
