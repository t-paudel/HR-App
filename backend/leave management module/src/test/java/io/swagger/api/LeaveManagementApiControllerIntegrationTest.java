package io.swagger.api;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import io.swagger.model.ApplyLeave;
import io.swagger.model.AvailCompOff;
import io.swagger.model.History;
import io.swagger.model.MessageStatus;
import io.swagger.model.UserLeaves;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeaveManagementApiControllerIntegrationTest {

    @Autowired
    private LeaveManagementApi api;


    @Test
    public void addLeavesTest() throws Exception {
        UserLeaves body = new UserLeaves();
        ResponseEntity<UserLeaves> responseEntity = api.addLeaves(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void availCompOffTest() throws Exception {
        AvailCompOff body = new AvailCompOff();
        ResponseEntity<MessageStatus> responseEntity = api.availCompOff(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void applyLeavesTest() throws Exception {
        ApplyLeave body = new ApplyLeave();
        ResponseEntity<MessageStatus> responseEntity = api.applyLeave(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteEmployeeLeaveHistoryTest() throws Exception {
        String employeeId = "employeeId_example";
        ResponseEntity<MessageStatus> responseEntity = api.deleteEmployeeLeaveHistory(employeeId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteleavesTest() throws Exception {
        String employeeId = "employeeId_example";
        ResponseEntity<MessageStatus> responseEntity = api.deleteleaves(employeeId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getEmployeeLeaveHistoryTest() throws Exception {
        String id = "id_example";
        ResponseEntity<List<History>> responseEntity = api.getEmployeeLeaveHistory(id);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getLeavesByEmployeeIdTest() throws Exception {
        String employeeId = "employeeId_example";
        ResponseEntity<UserLeaves> responseEntity = api.getLeavesByEmployeeId(employeeId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateLeaveHistoryTest() throws Exception {
        History body = new History();
        ResponseEntity<History> responseEntity = api.updateLeaveHistory(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
