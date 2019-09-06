import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LeaveService {

  private headers = new HttpHeaders({'Content-Type'  : 'application/json'});

  constructor(private http:HttpClient) { }

  getAvailableLeaves(empId:string)
  {
    // var httpParam = new HttpParams();
    // httpParam.append("empId",empId);
    
    return this.http.get('/v2/leaveManagement/api/getAllLeaves',{headers: this.headers});
  }
}
