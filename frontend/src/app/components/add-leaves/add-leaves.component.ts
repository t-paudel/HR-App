import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms'
import { UserLeaves } from 'src/app/models/user-leaves';
import { LeaveService } from 'src/app/service/leave.service';

@Component({
  selector: 'app-add-leaves',
  templateUrl: './add-leaves.component.html',
  styleUrls: ['./add-leaves.component.css']
})
export class AddLeavesComponent implements OnInit {

  leaveForm : FormGroup;
  leaves : UserLeaves;

  constructor(private leaveService:LeaveService) { }

  ngOnInit() 
  {
    this.leaveForm = new FormGroup({
      empId : new FormControl('', Validators.required),
      sickLeave : new FormControl(''),
      casualLeave : new FormControl(''),
      earnedLeave : new FormControl(''),
      compOff : new FormControl(''),
      lop : new FormControl(''),
      maternityLeave : new FormControl('')
    });
  }

  addLeaves()
  {
    console.log('inside addLeaves()');
    
    this.leaves = new UserLeaves();
    this.leaves.employeeId = this.leaveForm.controls['empId'].value;
    this.leaves.sickLeave = this.leaveForm.controls['sickLeave'].value;
    this.leaves.casualLeave = this.leaveForm.controls['casualLeave'].value;
    this.leaves.earnedLeave = this.leaveForm.controls['earnedLeave'].value;
    this.leaves.compOff = this.leaveForm.controls['compOff'].value;
    this.leaves.lossOfPay = this.leaveForm.controls['lop'].value;
    this.leaves.maternityLeave = this.leaveForm.controls['maternityLeave'].value;

    console.log(this.leaves);

    this.leaveService.addLeaves(this.leaves).subscribe(() => {
      console.log('leave added');
    })
  }
}
