package security.service;

import java.util.List;

import security.entity.Staff;
import security.exception.StaffNotFoundException;


public interface StaffService {
	Staff insertStaff(Staff newStaff);

	Staff showStaffById(Long stafid) throws StaffNotFoundException;

	List<Staff> showAllStaffs();



	Staff updateStaffById(Long stafid, Staff Staff) throws StaffNotFoundException;

	void deleteStaffById(Long stafid) throws StaffNotFoundException;

	Staff updateSalaryById(Long staffid, Staff Staff) throws StaffNotFoundException;
}