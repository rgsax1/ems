import axios from 'axios';

const API_DEPARTMENT_URL = 'http://localhost:8080/api/departments';

export const listDepartments = () => axios.get(API_DEPARTMENT_URL);
export const createDepartment = (department) => axios.post(API_DEPARTMENT_URL, department)
export const getDepartment = (departmentId) => axios.get(API_DEPARTMENT_URL + '/' + departmentId)
export const updateDepartment = (departmentId, department) => axios.put(API_DEPARTMENT_URL + '/' + departmentId, department)
export const deleteDepartment = (departmentId) => axios.delete(API_DEPARTMENT_URL + '/' + departmentId)