import { Component, OnInit } from '@angular/core';
import { AvailCompOff } from 'src/app/models/avail-comp-off';
import { LeaveService } from 'src/app/service/leave.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-avail-comp-off',
  templateUrl: './avail-comp-off.component.html',
  styleUrls: ['./avail-comp-off.component.css']
})
export class AvailCompOffComponent implements OnInit {

  compOff = new AvailCompOff();
  compOffForm : FormGroup;

  
  constructor(private leaveService:LeaveService) { }

  ngOnInit() 
  {
    console.log('applied ngOnInit()');

    this.compOffForm = new FormGroup({
      employeeId : new FormControl('',Validators.required),
      reason : new FormControl('',Validators.required),
      startDate : new FormControl('',Validators.required),
      endDate : new FormControl('',Validators.required)
    });
  }

  apply()
  {
    console.log('inside apply()');

    this.compOff.employeeId = "tushar";
    this.compOff.startDate = this.compOffForm.controls['startDate'].value;
    this.compOff.endDate = this.compOffForm.controls['endDate'].value;
    this.compOff.reason = this.compOffForm.controls['reason'].value;

    this.leaveService.availCompOff(this.compOff).subscribe(()=>{});
  }
}
