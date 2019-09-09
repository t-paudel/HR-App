import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { UserLeaves } from '../models/user-leaves';
import { ApplyLeave } from '../models/apply-leave';
import { AvailCompOff } from '../models/avail-comp-off';

@Injectable({
  providedIn: 'root'
})
export class LeaveService {

  private headers = new HttpHeaders({'Content-Type'  : 'application/json'});

  constructor(private http:HttpClient) { }

  getAvailableLeaves(employeeId:string)
  {
    // var httpParam = new HttpParams();
    // httpParam.append("empId",empId);
    
    return this.http.get('/v2/leaveManagement/api/getLeaves/' + employeeId, {headers: this.headers});
  }

  addLeaves(body:UserLeaves)
  {
    return this.http.post('v2/leaveManagement/api/addLeaves', body, {headers : this.headers});
  }

  applyLeave(body:ApplyLeave)
  {
    return this.http.post('/v2/leaveManagement/api/applyLeave', body, {headers:this.headers});
  }

  availCompOff(body:AvailCompOff)
  {
    return this.http.post('/v2/leaveManagement/api/availCompOff', body, {headers:this.headers});
  }
}
