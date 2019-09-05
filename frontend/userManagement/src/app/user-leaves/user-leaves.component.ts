import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms'

@Component({
  selector: 'app-user-leaves',
  templateUrl: './user-leaves.component.html',
  styleUrls: ['./user-leaves.component.css']
})
export class UserLeavesComponent implements OnInit {

  userLeaveForm : FormGroup;

  constructor() { }

  ngOnInit() 
  {
    this.userLeaveForm = new FormGroup({
      empId : new FormControl('',Validators.required),
      sickLeave : new FormControl(''),
      casualLeave : new FormControl(''),
      earnedLeave : new FormControl(''),
      compOff : new FormControl(''),
      lop : new FormControl(''),
      maternityLeave : new FormControl('')
    })
  }
}
