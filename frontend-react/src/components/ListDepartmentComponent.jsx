import {useEffect, useState} from "react";
import {getDepartments, deleteDepartment} from "../services/DepartmentService.js";
import {useNavigate} from "react-router-dom";

const ListDepartmentComponent = () => {

    const [departments, setDepartments] = useState([]);
    const navigate = useNavigate();

    useEffect(()=>{
        getAllDepartments()
    }, [])

    function getAllDepartments(){
        getDepartments().then((response) => {
            console.log(response.data)
            setDepartments((response.data))
        }).catch(error => {
            console.error(error)
        })
    }

    function addNewDepartment(){
        navigate('/add-department')
    }

    function updateDepartment(id){
        navigate(`/edit-department/${id}`)
    }

    function removeDepartment(id){
        console.log(id);
        deleteDepartment(id).then((response) => {
            getAllDepartments()
        }).catch(error => {
            console.error(error);
        })
    }


  return (
    <div className="container">
    <h2 className="text-center">List of Departments</h2>
        <button className='btn btn-primary mb-2' onClick={addNewDepartment}>Add Department</button>
    <table className="table table-striped table-bordered">
        <thead>
        <tr>
            <th>Department Id</th>
            <th>Department Name</th>
            <th>Department Description</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        {
            departments.map(department =>
                <tr key={department.id}>
                    <td>{department.id}</td>
                    <td>{department.departmentName}</td>
                    <td>{department.departmentDescription}</td>
                    <td>
                        <button className='btn btn-info' onClick={() => updateDepartment(department.id)}>Update</button>
                        <button className='btn btn-danger' onClick={() => removeDepartment(department.id)}>Delete</button>
                    </td>
                </tr>)
        }
        </tbody>
    </table>
</div>
  )
}

export default ListDepartmentComponent