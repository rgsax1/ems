import axios from 'axios';

const API_EMPLOYEE_URL = 'http://localhost:8080/api/employees';

export const getEmployees = () => axios.get(API_EMPLOYEE_URL);
export const createEmployee = (employee) => axios.post(API_EMPLOYEE_URL, employee)
export const getEmployee = (employeeId) => axios.get(API_EMPLOYEE_URL + '/' + employeeId)
export const updateEmployee = (employeeId, employee) => axios.put(API_EMPLOYEE_URL + '/' + employeeId, employee)
export const deleteEmployee = (employeeId) => axios.delete(API_EMPLOYEE_URL + '/' + employeeId)