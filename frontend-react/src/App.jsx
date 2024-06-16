import './App.css'
import HeaderComponent from "./components/HeaderComponent.jsx";
import ListEmployeeComponent from "./components/ListEmployeeComponent.jsx";
import FooterComponent from "./components/FooterComponent.jsx";
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import EmployeeComponent from './components/EmployeeComponent.jsx';
import ListDepartmentComponent from './components/ListDepartmentComponent.jsx';

function App() {

    return (
        <>
            <BrowserRouter>
                <HeaderComponent />
                <Routes>
                    <Route>
                        <Route path='/' element={<ListEmployeeComponent/>}></Route>
                        <Route path='/employees' element={<ListEmployeeComponent/>}></Route>
                        <Route path='/add-employee' element={<EmployeeComponent/>}></Route>
                        <Route path='/edit-employee/:id' element={<EmployeeComponent/>}></Route>
                        <Route path='/departments' element={<ListDepartmentComponent/>}></Route>
                    </Route>
                </Routes>
                <FooterComponent />
            </BrowserRouter>
        </>
    )
}

export default App
