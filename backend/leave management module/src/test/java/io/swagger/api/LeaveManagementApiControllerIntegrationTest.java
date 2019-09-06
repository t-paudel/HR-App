package io.swagger.api;

import io.swagger.model.ApplyCompOff;
import io.swagger.model.ApplyLeave;
import io.swagger.model.History;
import io.swagger.model.UserLeaves;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeaveManagementApiControllerIntegrationTest {

    @Autowired
    private LeaveManagementApi api;

    @Test
    public void addLeaveHistoryTest() throws Exception {
        List<History> body = Arrays.asList(new History());
        ResponseEntity<Void> responseEntity = api.addLeaveHistory(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void addLeavesTest() throws Exception {
        UserLeaves body = new UserLeaves();
        ResponseEntity<Void> responseEntity = api.addLeaves(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void applyCompOffTest() throws Exception {
        ApplyCompOff body = new ApplyCompOff();
        ResponseEntity<Void> responseEntity = api.applyCompOff(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void applyLeavesTest() throws Exception {
        ApplyLeave body = new ApplyLeave();
        ResponseEntity<Void> responseEntity = api.applyLeaves(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteEmployeeLeaveHistoryTest() throws Exception {
        String employeeId = "employeeId_example";
        ResponseEntity<Void> responseEntity = api.deleteEmployeeLeaveHistory(employeeId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteleavesTest() throws Exception {
        String employeeId = "employeeId_example";
        ResponseEntity<Void> responseEntity = api.deleteleaves(employeeId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAllEmployeeLeaveHistoryTest() throws Exception {
        String employeeId = "employeeId_example";
        ResponseEntity<List<UserLeaves>> responseEntity = api.getAllEmployeeLeaveHistory(employeeId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAllleavesTest() throws Exception {
        ResponseEntity<List<UserLeaves>> responseEntity = api.getAllleaves();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getEmployeeLeaveHistoryTest() throws Exception {
        String employeeId = "employeeId_example";
        ResponseEntity<List<UserLeaves>> responseEntity = api.getEmployeeLeaveHistory(employeeId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getLeavesByEmployeeIdTest() throws Exception {
        Long employeeId = 789L;
        ResponseEntity<List<UserLeaves>> responseEntity = api.getLeavesByEmployeeId(employeeId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateLeaveHistoryTest() throws Exception {
        List<History> body = Arrays.asList(new History());
        ResponseEntity<Void> responseEntity = api.updateLeaveHistory(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
