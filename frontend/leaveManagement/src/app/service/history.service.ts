import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HistoryService {

  private headers = new HttpHeaders({'Content-Type':'application/json'});

  constructor(private http:HttpClient) { }

  getLeaveHistory(employeeId:string)
  {
    return this.http.get('/v2/leaveManagement/api/getHistory/' + employeeId, {headers:this.headers});
  }


}
