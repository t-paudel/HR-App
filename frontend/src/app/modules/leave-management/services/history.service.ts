import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { LeaveHistory } from '../models/leave-history';

@Injectable({
  providedIn: 'root'
})
export class HistoryService 
{
  private headers = new HttpHeaders({'Content-Type':'application/json'});

  constructor(private http:HttpClient) { }

  getLeaveHistory(employeeId:string)
  {
    return this.http.get('/v2/leaveManagement/api/getHistory/' + employeeId, {headers:this.headers});
  }

  updateLeaveHistory(body:LeaveHistory)
  {
    return this.http.put('/v2/leavemanagement/api/updateHistory/', body, {headers:this.headers});
  }

  deleteLeaveHistory(id:string)
  {
    return this.http.delete('/v2/leaveManagement/api/removeHistory/' + id, {headers:this.headers});
  }
}
